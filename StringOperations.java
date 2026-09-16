import java.util.Scanner;
class StringOperations{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter first string:");
    String str1=sc.nextLine();
    System.out.print("enter second string:");
    String str2=sc.nextLine();
    System.out.println("\ncharacter at index 0: " +str1.charAt(0));
    System.out.println("Substring  from index 1:"+ str1.substring(1));
    System.out.println("concatenation: "+str1.concat(str2));
    System.out.println("Are both string equal?"+str1.equals(str2));
    System.out.println("Is first string empty?"+str1.isEmpty());
    sc.close();
  }
}