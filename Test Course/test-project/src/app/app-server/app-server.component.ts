import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-app-server',
  templateUrl: './app-server.component.html',
  styleUrls: ['./app-server.component.css']
})
export class AppServerComponent implements OnInit {

  allowNewServer = false;
  serverCreationStatus = "no server was created";
  serverName="test";
  constructor() {
  setTimeout(() => {
  this.allowNewServer=true;
  }, 2000);
  }
  onCreateServer(){
  this.serverCreationStatus = "server was created";
  }
  onUpdateServerName(event: any){
  console.log(event);
  this.serverName=(<HTMLInputElement>event.target).value;
  }
  ngOnInit(): void {
  }

}
