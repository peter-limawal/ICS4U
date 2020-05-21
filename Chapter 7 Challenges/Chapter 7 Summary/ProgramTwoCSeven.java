/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 7 Program Two
*/

public class ProgramTwoCSeven {
   
   public static void main(String[] args) {
      
      // Declaring 2D array
      String[][] footballTeams = new String[2][20];
      
      // Filling in array
      footballTeams[0][0] = "Arsenal";
      footballTeams[0][1] = "Aston Villa";
      footballTeams[0][2] = "Bournemouth";
      footballTeams[0][3] = "Brighton & Hove Albion";
      footballTeams[0][4] = "Burnley";
      footballTeams[0][5] = "Chelsea";
      footballTeams[0][6] = "Crystal Palace";
      footballTeams[0][7] = "Everton";
      footballTeams[0][8] = "Leicester City";
      footballTeams[0][9] = "Liverpool";
      footballTeams[0][10] = "Manchester City";
      footballTeams[0][11] = "Manchester United";
      footballTeams[0][12] = "Newcastle United";
      footballTeams[0][13] = "Norwich City";
      footballTeams[0][14] = "Sheffield United";
      footballTeams[0][15] = "Southampton";
      footballTeams[0][16] = "Tottenham Hotspur";
      footballTeams[0][17] = "Watford";
      footballTeams[0][18] = "West Ham United";
      footballTeams[0][19] = "Wolverhampton Wanderers";
      
      footballTeams[1][0] = "Islington, London";
      footballTeams[1][1] = "Aston, Birmingham";
      footballTeams[1][2] = "Bournemouth, Dorset";
      footballTeams[1][3] = "Brighton, East Sussex";
      footballTeams[1][4] = "Burnley, Lancashire";
      footballTeams[1][5] = "Fulham, London";
      footballTeams[1][6] = "Selhurst, South London";
      footballTeams[1][7] = "Liverpool, Merseyside";
      footballTeams[1][8] = "Leicester, East Midlands";
      footballTeams[1][9] = "Liverpool, Merseyside";
      footballTeams[1][10] = "Manchester, Greater Manchester";
      footballTeams[1][11] = "Manchester, Greater Manchester";
      footballTeams[1][12] = "Newcastle upon Tyne, Tyne and Wear";
      footballTeams[1][13] = "Norwich, Norfolk";
      footballTeams[1][14] = "Sheffield, South Yorkshire";
      footballTeams[1][15] = "Southampton, Hampshire";
      footballTeams[1][16] = "Tottenham, London";
      footballTeams[1][17] = "Watford, Hertfordshire";
      footballTeams[1][18] = "Stratford, East London";
      footballTeams[1][19] = "Wolverhampton, West Midlands";
      
      // Outputting 5 random teams
      for (int i = 0; i < 5; i++) {
         
         // Producing random column number
         int col = (int)(Math.random() * 20);
         
         System.out.println("The football club " + footballTeams[0][col] + " is from " + footballTeams[1][col] + ".");
      }
   } // Main method
   
} // End class