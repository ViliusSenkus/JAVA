public class Main {
      
      public static void main(String[] args){
            System.out.println("Čia yra programos pradžia");

            final int x = 2;
            final int y = 3;
            final char color = 'C';
            final String t = "labas";

            Field myField = new Field(x, y, color, t);

            System.out.println("\n\n");

            Rocket myRocket = new Rocket();
            myRocket.performTask();

      }
}
