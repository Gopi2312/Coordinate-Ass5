package assignment.coordinates;
import java.util.*;
import java.util.logging.*;
public class Main 
{
    public static void main( String[] args )
    {
    	Logger log = Logger.getLogger("hi");
        Scanner sc = new Scanner(System.in);
        log.info("Enter Coordinate x: ");
        Float x=sc.nextFloat();
        log.info("Enter Coordinate y: ");
        Float y=sc.nextFloat();
        
        Coordinate1 co = new Coordinate1(x,y);
        Coordinate1 co1 = co.clo();
        log.info(Boolean.toString(co1.equals()));
    }
}
