import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Othe {
 
  
    public static void main(String[] args) {

        DateTimeFormatter formatas = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
        LocalDateTime laikas = LocalDateTime.now();
        System.out.println(laikas.format(formatas));

      // System.out.println(Main.fullThrottle());
      // System.out.println(Main.maxSpeed);


      // Main myCar = new Main();     
      // System.out.println(myCar.fullThrottle());      
      // System.out.println(myCar.speed());      
      
      // Main newCar = new Main();
      // System.out.println(newCar.maxSpeed);
      
      // myCar.maxSpeed = 150; 
      // System.out.println(myCar.maxSpeed);
      // System.out.println(newCar.maxSpeed);
      // System.out.println(Main.maxSpeed);


      // Scanner myObj = new Scanner(System.in);
      
      // System.out.println("Enter username");
      // String userName = myObj.nextLine(); //veikia kaip input eilutė (iš karto rodo terminale )
      
      // System.out.println("Username is: " + userName);
     
  }


}
