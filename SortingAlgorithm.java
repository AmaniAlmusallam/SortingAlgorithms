import java.util.Random;
public class SortingAlgorithm {
    static int timeBubble = 0;
    static int timeSelection = 0;
    static int timeInsertion = 0;
    
    // int = 4 , boolean = 1
    static int spaceBubble = 0;
    static int spaceSelection = 0;
    static int spaceInsertion = 0;
    
    public static void main(String[] args) {
        int[] ar2 = new int[5]; //fixed size 5 elements 
        System.out.print("List Befor Sorting [ ");
        random(ar2);
        System.out.println("] ");
        
        System.out.print("In Bubble sort: ");
        bubble(ar2);
        System.out.println("  ");
        System.out.println("Time Complixty: " + timeBubble);
        System.out.println("Space Complixty: " + spaceBubble);
        System.out.println("  ");

        System.out.print("In selection sort: ");
        selection(ar2);
        System.out.println("  ");
        System.out.println("Time Complixty: " + timeSelection);
        System.out.println("Space Complixty: " + spaceSelection);
        System.out.println("  ");

        System.out.print("In insertion sort: ");
        insertion(ar2);
        System.out.println("  ");
        System.out.println("Time Complixty: " + timeInsertion);
        System.out.println("Space Complixty: " + spaceInsertion);
        System.out.println("  ");
        

        int[] ar = {100,90,80,70,60,50,40,30,20,10};
        System.out.println("List Befor Sorting [100 90 80 70 60 50 40 30 20 10]");

        System.out.print("In Bubble sort: ");
        bubble(ar);
        System.out.println("  ");
        System.out.println("Time Complixty: " + timeBubble);
        System.out.println("Space Complixty: " + spaceBubble);
        System.out.println("  ");

        System.out.print("In selection sort: ");
        selection(ar);
        System.out.println("  ");
        System.out.println("Time Complixty: " + timeSelection);
        System.out.println("Space Complixty: " + spaceSelection);
        System.out.println("  ");

        System.out.print("In insertion sort: ");
        insertion(ar);
        System.out.println("  ");
        System.out.println("Time Complixty: " + timeInsertion);
        System.out.println("Space Complixty: " + spaceInsertion);
        System.out.println("  ");
           
        
        int[] ar3 = new int[50]; //fixed size 50 elements 
        System.out.print("List Befor Sorting [ ");
        random(ar3);
        System.out.println("] ");
        
        System.out.print("In Bubble sort: ");
        bubble(ar3);
        System.out.println("  ");
        System.out.println("Time Complixty: " + timeBubble);
        System.out.println("Space Complixty: " + spaceBubble);
        System.out.println("  ");

        System.out.print("In selection sort: ");
        selection(ar3);
        System.out.println("  ");
        System.out.println("Time Complixty: " + timeSelection);
        System.out.println("Space Complixty: " + spaceSelection);
        System.out.println("  ");

        System.out.print("In insertion sort: ");
        insertion(ar3);
        System.out.println("  ");
        System.out.println("Time Complixty: " + timeInsertion);
        System.out.println("Space Complixty: " + spaceInsertion);
        System.out.println("  ");
    }
    
    public static void random(int[] x){
        Random random = new Random(); // creating Random object
        for (int i = 0; i < x.length; i++) {
         x[i] = random.nextInt(50); // fill array with random numbers ( range 0 to 50 )   
         System.out.print(x[i]+ " ");
      }
    }
    public static void bubble(int[] x) {
        timeBubble = 0 ;
        spaceBubble = 0;
        spaceBubble = spaceBubble + (x.length * 4); // number of elemnts in x[] * 4 

        boolean a = true;
        timeBubble++;
        spaceBubble++;// a
        
        int i, k , z ; 
        spaceBubble = spaceBubble+4;// i
        spaceBubble = spaceBubble+4;// k
        spaceBubble = spaceBubble+4; // z 
        
        timeBubble++;
        for (i = 0; i < x.length - 1 && a; i++) {
            timeBubble++;
           
            a = false;
            timeBubble++;
            
            timeBubble++;
            for ( k = 0; k < x.length - i - 1; k++) {
                timeBubble++;

                timeBubble++; //checking 
                if (x[k + 1] < x[k]) {
                    z = x[k];
                    timeBubble++;

                    x[k] = x[k + 1];
                    timeBubble++;

                    x[k + 1] = z;
                    timeBubble++;

                    a = true;
                    timeBubble++;
                }
            }
        }
        for (int s : x) {
            System.out.print(s + " ");
        }
    }

    public static void selection(int[] x) {
        timeSelection = 0;
        spaceSelection = 0;
        spaceSelection = spaceSelection + (x.length * 4); // number of elemnts in x[] * 4  
        
        int i, smallestIndex, k, tem ;
        spaceSelection = spaceSelection+4; //i
        spaceSelection = spaceSelection+4; //smallestIndex
        spaceSelection = spaceSelection+4; // K
        spaceSelection = spaceSelection+4; // xx
        
        timeSelection++;
        for (i = 0; i < x.length - 1; i++) {
            timeSelection++; //for 

            smallestIndex = i;
            timeSelection++;
             
            for (k = i + 1; k < x.length; k++) {
                timeSelection++;
                
                timeSelection++;//checking 
                if (x[k] < x[smallestIndex]) {

                    smallestIndex = k;
                    timeSelection++;

                    tem = x[smallestIndex];
                    timeSelection++;  

                    x[smallestIndex] = x[i];
                    timeSelection++;

                    x[i] = tem;
                    timeSelection++;

                }
            }
        }
        for (int s : x) {
            System.out.print(s + " ");
        }
    }

    public static void insertion(int[] x) {
        timeInsertion = 0;
        spaceInsertion = 0;
        spaceInsertion = spaceInsertion + (x.length * 4);
        
        int i, a, k;
        spaceInsertion=spaceInsertion + 4; // i 
        spaceInsertion=spaceInsertion + 4; // a
        spaceInsertion=spaceInsertion + 4; // k 
        
        timeInsertion++;
        for (i = 1; i < x.length; i++) {
            timeInsertion++;

            a = x[i];
            timeInsertion++;

            k = i;
            timeInsertion++;
            
            timeInsertion++;
            while (k > 0 && x[k - 1] > a) {
                timeInsertion++;

                x[k] = x[k - 1];
                timeInsertion++;

                k--;
                timeInsertion++;
            }
            x[k] = a;
            timeInsertion++;
        }  
        for (int s : x) {
            System.out.print(s + " ");
        }
    }
}
