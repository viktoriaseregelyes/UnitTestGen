import { Component, OnInit } from '@angular/core';
import { TestGeneratorService } from './services/test-generator.service';

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
  testCases: string = "TEST testName\nMETHOD name\nPARAM int a VALUE 10\nPARAM int b VALUE 0\nEXPECT 10;"
  generatedTests: string = "Done";
  infoButton: string = 'CONSTRUCTOR\nPARAM int id VALUE 1\n\nMOCKING\nMOCK Service serviceMock\n\nTEST loginTest\nMETHOD login\nPARAM string username VALUE "admin"\nPARAM string password VALUE "1234"\nEXPECT true';

  isLoading = false;
  copySuccess = false;
  sidebarCollapsed = false;
  theme: 'vs-dark' | 'vs-light' = 'vs-dark';

  editorOptions = {
    theme: 'vs-dark',
    language: 'javascript',
    fontSize: 16,
    fontFamily: 'JetBrains Mono, monospace',
    automaticLayout: true
  };

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

  generate(): void {
    this.isLoading = true;

    this.generatorService.generateTests(this.inputClass, this.testCases).subscribe({
      next: (res) => { this.templateClass = res; this.isLoading = false;},
      error: (err) => { this.generatedTests = 'Error sending input.'; this.isLoading = false; }
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
}
