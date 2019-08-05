import { Component, OnInit } from '@angular/core';
import { PlayerService } from 'src/service/player.service';
import { PlayerDTO } from 'src/dto/playerdto';


@Component({
  selector: 'app-player',
  templateUrl: './player.component.html',
  styleUrls: ['./player.component.css']
})
export class PlayerComponent implements OnInit {

  players: PlayerDTO[];
  playertoinsert: PlayerDTO = new PlayerDTO();

  constructor(private service: PlayerService) { }

  ngOnInit() {
    this.getPlayers();
    console.log("Sono qui");
  }

  getPlayers() {
    this.service.getAll().subscribe(players => this.players = players);
    console.log("sono nella get players: " + this.players);
  }

  delete(player: PlayerDTO) {
    this.service.delete(player.id).subscribe(() => this.getPlayers());
  }

  update(player: PlayerDTO) {
    this.service.update(player).subscribe(() => this.getPlayers());
  }

  insert(player: PlayerDTO) {
    this.service.insert(player).subscribe(() => this.getPlayers());
  }

  clear(){
    this.playertoinsert = new PlayerDTO();
  }
}
