import java.util.Scanner;
public class Str_leave{

     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         String str=s.nextLine();
             switch(str){
                 case "Monday":
                     System.out.print("no");break;
                  case "Tuesday":
                     System.out.print("no");break;
                   case "Wednesday":
                     System.out.print("no");break;
                   case "Thursday":
                     System.out.print("no");break;
                   case "Friday":
                     System.out.print("no");break;
                   case "Saturday":
                     System.out.print("yes");break;
                   case "Sunday":
                     System.out.print("yes");break;
                   default:
                       break;
                     
             }
     }
}