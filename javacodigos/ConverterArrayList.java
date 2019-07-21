
import  java.util.*;

public class ConverterArrayList{
public static void main(String [] args){


List<String> list1 = new ArrayList<>();
 list1.add("alan");
 list1.add("santos");
 Object[] objectArray = list1.toArray();
 System.out.println(objectArray.length); // 2
 String[] stringArray = list1.toArray(new String[0]);
 System.out.println(stringArray.length); // 2

String[] array = { "alan", "santos" }; // [alan, santos]
 List<String> list = Arrays.asList(array); // returns fixed size list
 System.out.println(list.size()); // 2
 list.set(1, "teste"); // [alan, teste]
 array[0] = "novo"; // [novo, test]
 for (String b : array) System.out.print(b + " "); // new test
 //list.remove(1); 
// throws UnsupportedOperation Exception

}
}