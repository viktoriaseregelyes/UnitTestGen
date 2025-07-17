import { platformBrowser } from '@angular/platform-browser';
import { AppModule } from './app/app.module';
import 'codemirror/mode/javascript/javascript';
import 'codemirror/mode/markdown/markdown';

platformBrowser().bootstrapModule(AppModule, {
  ngZoneEventCoalescing: true,
})
  .catch(err => console.error(err));
