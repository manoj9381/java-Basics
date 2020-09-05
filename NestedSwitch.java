import java.util.Scanner;
public class NestedSwitch
{    
public static void main(String args[])  
{  
      Scanner in=new Scanner(System.in);  
	  System.out.println("Enter branch");
	  String branch=in.nextLine();
      System.out.println("Enter Year:");
	  int year=in.nextInt();
        switch(year )  
        {  
            case 1:  
                System.out.println("English, Maths, Science");  
                break;  
            case 2:  
                switch( branch )   
                {  
                    case "CSE":  
                        System.out.println("Operating System, Java, Data Structure");  
                        break;  
                    case "ECE":  
                        System.out.println("Micro processors, Logic switching theory");  
                        break;  
                    case "MEC":  
                        System.out.println("Drawing, Manufacturing Machines");  
                        break;  
                }  
                break;  
            case 3:  
                switch( branch )   
                {  
                    case "CSE":  
                        System.out.println("Computer Organization, MultiMedia");  
                        break;  
                    case "ECE":  
                        System.out.println("Fundamentals of Logic Design, Microelectronics");  
                        break;  
                    case "MEC":  
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");  
                        break;  
                }  
                break;  
            case 4:  
                switch( branch )   
                {  
                    case "CSE":  
                        System.out.println("Data Communication and Networks, MultiMedia");  
                        break;  
                    case "ECE":  
                        System.out.println("Embedded System, Image Processing");  
                        break;  
                    case "MEC":  
                        System.out.println("Production Technology, Thermal Engineering");  
                        break;  
                }  
                break;  
        }  
    }  
}  