import { AfterViewInit, Component, OnInit, ViewChild } from '@angular/core';
import { TestGeneratorService, ValidationError } from './services/test-generator.service';
import { MonacoEditorComponent } from '@materia-ui/ngx-monaco-editor';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  standalone: false,
  styleUrl: './app.component.css'
})

export class AppComponent {
  title = 'Unit Test Generator';
  
  inputClass: string = "public class ClassName {\n\tpublic int name(int a, int b) {\n\t\treturn a + b;\n\t}\n}";
  templateClass: string = "Test output";
  testCases: string = "TEST testName\nMETHOD name\nPARAM int a VALUE 10\nPARAM int b VALUE 0\nEXPECT 10"
  generatedTests: string = "Done";
  infoButton: string = 'CONSTRUCTOR\nPARAM int id VALUE 1\n\nMOCKING\nMOCK Service serviceMock\n\nTEST loginTest\nREPEAT 2\nMETHOD login\nPARAM string username VALUE "admin"\nVARIATION string password VALUES ["1234", "5678"]\nEXPECT true';
  coverage: number = 0.0;

  isLoading = false;
  copySuccess = false;
  sidebarCollapsed = false;
  theme: 'vs-dark' | 'vs-light' = 'vs-dark';

  showError = false;
  errorMessage = '';

  editorOptions = {
    theme: 'vs-dark',
    language: 'javascript',
    fontSize: 16,
    fontFamily: 'JetBrains Mono, monospace',
    automaticLayout: true
  };

  testEditorInstance!: monaco.editor.IStandaloneCodeEditor;

  @ViewChild(MonacoEditorComponent) monacoComp!: MonacoEditorComponent;

  ngAfterViewInit() {
    this.testEditorInstance = this.monacoComp.editor;
  }

  onTestEditorInit(editor: any): void {
    this.testEditorInstance = editor;

    editor.onDidChangeModelContent(() => {
      console.log('Editor changed');
      console.log(this.testEditorInstance.getValue());

      this.generatorService.validate(this.testEditorInstance.getValue()).subscribe({
        next: (errors) => this.applyValidationMarkers(errors),
        error: (err) => console.error('Validation error:', err)
      });
    });
  }

  constructor(private generatorService: TestGeneratorService) {}

  toggleSidebar(): void {
    this.sidebarCollapsed = !this.sidebarCollapsed;
  }

  toggleTheme(): void {
    this.theme = this.theme === 'vs-dark' ? 'vs-light' : 'vs-dark';
    this.editorOptions = {
      ...this.editorOptions,
      theme: this.theme
    };
  }

  applyValidationMarkers(errors: ValidationError[]): void {
    const model = this.testEditorInstance.getModel();

    if (!model) return;

    const markers: monaco.editor.IMarkerData[] = errors.map(err => ({
      severity: monaco.MarkerSeverity.Error,
      message: err.message,
      startLineNumber: err.line,
      startColumn: err.column,
      endLineNumber: err.line,
      endColumn: err.length,
    }));

    console.log(errors);

    monaco.editor.setModelMarkers(model!, model.uri.toString(), markers);
  }

  generate(): void {
    this.isLoading = true;

    this.generatorService.generateTests(this.inputClass, this.testCases).subscribe({
      next: (res) => { this.templateClass = res.test; this.coverage = res.coverage; this.isLoading = false;},
      error: (err) => { this.showError = true; this.errorMessage = err?.error || 'Error sending input.'; this.isLoading = false; }
    });
  }

  copyEditorContent(): void {
    navigator.clipboard.writeText(this.templateClass).then(() => {
      this.copySuccess = true;
      setTimeout(() => this.copySuccess = false, 2000);
      }).catch(err => {
        console.error('Could not copy text: ', err);
    });
  }

  downloadEditorContent(): void {
    const blob = new Blob([this.templateClass], { type: 'text/plain' });
    const url = window.URL.createObjectURL(blob);

    const a = document.createElement('a');
    a.href = url;
    a.download = 'MyJavaFile.java';
    a.click();

    window.URL.revokeObjectURL(url);
  }

  get themeLabel(): string {
    return this.theme === 'vs-dark' ? '🌙 Dark Mode' : '☀️ Light Mode';
  }

  closeError(): void {
    this.showError = false;
    this.errorMessage = '';
  }
}

