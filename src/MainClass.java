import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Zero");
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Fourth");
        arrayList.add("Fifth");

       Iterator numbers = arrayList.iterator();
       int count = 0;
       while (numbers.hasNext()){
           System.out.println(numbers.next()+ " "+count);
           count++;
       }

    }
}
