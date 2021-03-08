import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterUserComponent } from './register-user/register-user.component';
import { UserListComponent } from './user-list/user-list.component';
import { LoginUserComponent } from './login-user/login-user.component';
import {ActiveUserComponent} from './active-user/active-user.component';
import {UserProfileComponent} from './user-profile/user-profile.component';
import {BlogListComponent } from './blog-list/blog-list.component';
const routes: Routes = [
  { path: '', redirectTo: 'login-user', pathMatch: 'full' },  
  { path: 'user-list', component: UserListComponent },  
  { path: 'add-user', component: RegisterUserComponent },
  { path: 'login-user', component: LoginUserComponent }, 
  { path: 'active-user' , component: ActiveUserComponent},
  { path: 'user-profile' , component: UserProfileComponent},
  { path: 'blog-list' , component: BlogListComponent}  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
