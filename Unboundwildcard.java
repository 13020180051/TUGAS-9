package unboundwildcard;
import java.util.Arrays;
import java.util.List;

class Unboundwildcard {
    public static void main(String[] args) {
        // TODO code application logic here
        //integer list
        List<Integer> list1= Arrays.asList(1,2,3,4);
        
        //double list
        List<Double> list2=Arrays.asList(1.1,2.2,3.3,4.4);
        
        printlist (list1);
        
        printlist (list2);
        
    }
    
    private static void printlist(List<?> list){
        System.out.println(list);
    }
}
