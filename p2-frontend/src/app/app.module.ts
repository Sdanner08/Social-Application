import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { IndexComponent } from './pages/index/index.component';
import { ProfileCreateComponent } from './pages/profile-create/profile-create.component';
import { TempComponentComponent } from './components/temp-component/temp-component.component';

@NgModule({
  declarations: [
    AppComponent,
    IndexComponent,
    ProfileCreateComponent,
    TempComponentComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
