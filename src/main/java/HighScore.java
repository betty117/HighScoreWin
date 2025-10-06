import java.util.Scanner;

public class HighScore{
    public static void main(String[] args){

        String gameInfo= "";
        String[] teamsAndscore;
        String[] teamsDivided;
        String[] scoreDivide;
        String scores;
        String teams;
        String team1="";
        String team2="";
        int team1Score=0;
        int team2Score=0;

        Scanner sc = new Scanner(System.in);

        // ask user for game information
        System.out.println( "Enter Teams Name and Scores (team 1:team2|team1 score:team2score): " );
        gameInfo = sc.nextLine().trim();

        // split game and score by |

        teamsAndscore= gameInfo.split("\\|");

        // split teams from teams and score since the teams name is on [0]scores=teamsAndscore[1]

        teams=teamsAndscore[0];
        teamsDivided=teams.split(":");
        team1=teamsDivided[0];
        team2=teamsDivided[1];

        //separating score from teamAndscore since the since is on
        scores=teamsAndscore[1];
        scoreDivide=scores.split(":");
        team1Score=Integer.parseInt(scoreDivide[0]);
        team2Score=Integer.parseInt(scoreDivide[1]);

        //printing results

        if (team1Score>team2Score) {
            System.out.println("winner:" + team1);
        } else{
            System.out.println("winner:" + team2);


        }






    }

}
