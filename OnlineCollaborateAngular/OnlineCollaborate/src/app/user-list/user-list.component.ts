import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';  
import {FormControl,FormGroup,Validators,FormBuilder} from '@angular/forms';  
import { User } from '../user';  
import {Observable,Subject} from "rxjs";
import {DataTablesModule} from 'angular-datatables';


@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  constructor(private userservice:UserService) { }
  usersArray: any=[];
  dtOptions: DataTables.Settings={};
  dtTrigger: Subject<any>= new Subject();

  users : Observable<User[]>;
  user : User=new User();
  deleteMessage=false;
  userlist:any;
  isupdated=false;

  ngOnInit() {
    this.isupdated=false;
    this.dtOptions={
      pageLength:6,
      stateSave:true,
      lengthMenu:[[6,16,20,-1],[6,16,20,"All"]],
      processing:true
    };
    this.userservice.getUserList().subscribe(data=>{
      this.users=data;
      this.dtTrigger.next();
    })
  }
  deleteUser(id: number){
    this.userservice.deleteUser(id)
    .subscribe(
      data=> {
        console.log(data);
        this.deleteMessage=true;
        this.userservice.getUserList().subscribe(data=>{
          this.users=data
        })
      },
      error=> console.log(error));
  }
  updateUser(id: number){
    this.userservice.getUser(id)
    .subscribe(
      data=>{
        this.userlist=data;
        console.log(this.userlist);
      }),
      error=> console.log(error);
  }
  userupdatefrom=new FormGroup({
    userId:new FormControl(),
    firstName:new FormControl(),
    lastName:new FormControl(),
    username:new FormControl(),
    password:new FormControl(),
    email:new FormControl(),
    role:new FormControl(),
    status:new FormControl(),
    isOnline:new FormControl(),
    enabled:new FormControl(),
  });
  update(user){
    this.user=new User();
    this.user.userId=this.userId.value;
    this.user.firstName=this.firstName.value;
    this.user.lastName=this.lastName.value;
    this.user.username=this.userName.value;
    this.user.password=this.password.value;
    this.user.email=this.email.value;
    this.user.role=this.role.value;
    this.user.status=this.status.value;
    this.user.isOnline=this.isOnline.value;
    this.user.enabled=this.enabled.value;
    console.log(this.firstName.value);

    this.userservice.updateUser(this.user.userId,this.user).subscribe(
      data=>{
        this.isupdated=true;
        this.userservice.getUserList().subscribe(data=>{
          this.users=data

      })
    },
    error=> console.log(error)); 
  }
  get firstName(){  
    return this.userupdatefrom.get('firstName');  
  }
  get lastName(){  
    return this.userupdatefrom.get('lastName');  
  }
  get userName(){  
    return this.userupdatefrom.get('username');  
  } 
  get password(){  
    return this.userupdatefrom.get('password');  
  }
  get email(){  
    return this.userupdatefrom.get('email');  
  } 
  get role(){  
    return this.userupdatefrom.get('role');  
  }
  get status(){  
    return this.userupdatefrom.get('status');  
  } 
  get isOnline(){  
    return this.userupdatefrom.get('isOnline');  
  }
  get enabled(){  
    return this.userupdatefrom.get('enabled');  
  } 
  get userId(){  
    return this.userupdatefrom.get('userId');  
  }
  changeisUpdate(){
    this.isupdated=false;
  }  
  
 
  
  
  
 
  
  
  
 
  
  
  
 
  
  
  
  
  

}
