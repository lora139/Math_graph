package Math_graph;
import java.util.*;
public class test {
    public static void main(String[] args) {

                int x;
                int y;
                double dy;
                double dx;
                for(x=0; x<200;x++){
                dx = x;
                dy = Math.sin(dx);
                y=(int)Math.round(dy); // convert to the bigger number
                
                System.out.print(y);
                }
    }
    
}
