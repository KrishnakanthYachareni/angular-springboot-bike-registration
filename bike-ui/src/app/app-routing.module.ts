import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from './components/home/home.component';
import {ViewRegistrationComponent} from './components/view-registration/view-registration.component';
import {AuthGuard} from './services/auth.guard';
import {AdminComponent} from './components/admin/admin.component';
import {CallbackComponent} from './components/callback/callback.component';


const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'admin/view/:id',
    component: ViewRegistrationComponent,
    canActivate: [AuthGuard]
  },
  {
    path: 'admin',
    component: AdminComponent,
    canActivate: [AuthGuard]
  },
  {
    path: 'callback',
    component: CallbackComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
