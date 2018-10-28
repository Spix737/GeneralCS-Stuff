import java.util.Scanner;
public class HalfTerm1HWK
{  
    public static int Genth;
    public static String[] wordList = new String[Genth];
    
    public static void main (String[] args)
    {
       Scanner userInput = new Scanner(System.in);
       
       int listLength;
       System.out.print("Enter the amount of objects you would like in the list (int): ");
       String listLengthNOT = userInput.next();
       int result = Integer.parseInt(listLengthNOT);
       listLength = (result);
       int Gength = listLength;
       
       String[] wordList = new String [listLength];
       
       int rob = 0;
       while (rob<Gength){
        System.out.println("Enter the strng you want in the list: ");
        String thingToPutIn = userInput.next(); 
        wordList[rob] = thingToPutIn;
        rob++;
       }
       System.out.println("* * * Output * * *");
       for(int zis = 0; zis<wordList.length; zis++)
        System.out.println(wordList[zis]);    
    }
    
    
    
    public static void LastElement (String[]args)
    {
        int lastly = Genth - 1;
        System.out.println("The last element in your array is " + wordList[lastly]);
        
    }
    
}
