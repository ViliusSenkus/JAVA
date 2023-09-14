import java.util.ArrayList;

class Task1{
      
      // Nustatykite, kurie skaičiai turi bendrą daugiklį artimiausiam iteraciniam skaičiui nuo skaičių sąrašo iki target skaičiaus. Atsakymas bus visų šių skaičių suma.“
      
      public static void main(String args[]){
            for (int i : arr){
                  remainder(i);
            }
            int x = 0;
            for (int i : array){
                  x += i; 
            }
            System.out.println("Skaitmenu suma " + x);
      }

      static int target = 789948162;
      static int[] arr = {
            153,
            71,
            62,
            207,
            79,
            277,
            314,
            305,
            138,
            115,
            281,
            237,
            232,
            183,
            122,
            189,
            102,
            77,
            290,
            268,
            239,
            24,
            319,
            253,
            58,
            126,
            54,
            141,
            41,
            267,
            18,
            148,
            194,
            50,
            47,
            315,
            249,
            94,
            285,
            69,
            27,
            33,
            140,
            149,
            96,
            227,
            119,
            258,
            288,
            229,
            56
      };

      static int devider1;
      static int devider2;
      static int difference1;
      static int difference2;
      static int savedDifference = target;
      static ArrayList<Integer> array = new ArrayList<Integer>();
      static int selectedDiference;


      private static void remainder(int x){
            System.out.println("\nPaimtas skaičius " + x);
            devider1 = target / x;
            devider2 = devider1 + 1;
            difference1 = target - (x*devider1);
            difference2 = (target - (x*devider2))*(-1);
            int selectedDiference = difference1 <= difference2 ? difference1 : difference2;
            if (savedDifference > selectedDiference){
                  savedDifference = selectedDiference;
                  array.clear();
                  array.add(x);
            } else if (savedDifference == selectedDiference){
                  array.add(x);
            }
            System.out.println("dalinimo kartai " + devider1 +" " + devider2);
            System.out.println("liekanos " + difference1 +" " + difference2);
            System.out.println("pasirinkta liekana " + selectedDiference);
            System.out.println("išsaugota liekana " + savedDifference);
            System.out.println("išsaugotas masyvas ");
            for (int i : array){
                  System.out.println(i + " ");
            }
      } 
}