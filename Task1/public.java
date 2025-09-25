import java.util.ArrayList;

class Team{

private String teamName;
private int teamNumber;
private ArrayList<String> playerNames;




public Team(String teamName){


	this.teamName = teamName;

}

public setRank(int teamNumber){
this.teamNumber = teamNumber;



}

public String toString() {

return "Hold: " + teamName + "Rang" + teamNumber




}

public addPlayer(String playerNames){

this.playerNames = playerNames;

}


}
