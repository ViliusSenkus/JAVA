public class Rocket {

      private String direction;
      private int positionX;
      private int positionY;
      public static String task; //list of given movement and rotation commands

      private void move(){
            System.out.println("I'm moving");
      }
      private void rotate(){
            System.out.println("I'm turning");
      }
    
      public void performTask(){
            Task myTask = new Task();
            System.out.println(myTask.getTask());
      }
}
