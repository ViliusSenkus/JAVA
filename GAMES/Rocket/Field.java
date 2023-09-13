public class Field {
      private int positionX;
      private int positionY;
      private char color;
      private String type; // start, finish, special, ...

      public Field(int positionX, int positionY, char color, String type){
            this.positionX = positionX;
            this.positionY = positionY;
            this.color = color;
            this.type = type;
            System.out.println("Sukurtas objektas:");
            this.get();
      }

      public void get(){
            System.out.println("X coordinate - " + this.positionX + "\n" 
                              + "Y coordinate - " + this.positionY + "\n"
                              + "color - " + this.color + "\n"
                              + "tye - " + type + ".");
      }

      public int getX(){
            return this.positionX;
      }
      
      public int getY(){
            return this.positionY;
      }

      public char getColor(){
            return this.color;
      }

      public String getType(){
            return this.type;
      }

       public void setX(int x){
            this.positionX = x;
      }
      
      public void setY(int y){
            this.positionY = y;
      }

      public void setColor(char c){
            this.color = c;
      }

      public void setType(String t){
            this.type = t;
      }
}
