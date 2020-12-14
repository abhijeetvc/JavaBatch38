// Collection: Grouping of data of similar type

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionPrg {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(25);

        List<Integer> list1=new ArrayList();
        list1.add(40);
        list1.add(50);
        list1.add(60);

        list.addAll(list1);
        System.out.println(list);

//        Iterator itr=list.iterator();
//
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        //Normal Way of implementation
//        for(Integer i:list){
//            System.out.println(i);
//        }

        //Java 8, lambda expression
     //   list.forEach(val-> System.out.println(val));

        // Java 8, method reference
        list.forEach(System.out::println);
    }
}
