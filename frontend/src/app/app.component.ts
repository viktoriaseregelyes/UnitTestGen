import { Component, OnInit } from '@angular/core';
import { TestGeneratorService } from './services/test-generator.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  standalone: false,
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'UnitTestGenerator';
  inputClass: string = "public class Example {}";
  templateClass: string = "TEST TEMPLATE HERE";
  generatedTests: string = "Done";

  constructor(private generatorService: TestGeneratorService) {}

  generate(): void {
    this.generatorService.generateTests(this.inputClass).subscribe({
      next: (res) => this.generatedTests = res.generatedTests,
      error: (err) => this.generatedTests = 'Error sending input.'
    });
  }
}
