package Flow_Control_Structure;
import java.util.*;

public class Color {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      char chUpper=(ch>=97 && ch<=122)?(char)(ch-32):ch;
      switch(chUpper) {
      case 'R':
    	  System.out.println("Red");
    	  break;
      case 'B':
    	  System.out.println("Blue");
    	  break;
      case 'G':
    	  System.out.println("Green");
    	  break;
      case 'O':
    	  System.out.println("Orange");
    	  break;
      case 'Y':
    	  System.out.println("Yellow");
    	  break;
      case 'W':
    	  System.out.println("White");
    	  break;
      default:
    	 System.out.println("Invalid code");
      }
	}

}
