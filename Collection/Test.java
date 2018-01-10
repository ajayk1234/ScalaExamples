package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {

    public static void main(String ar[]){
        for(int k=1;k<=3;k++){
            for (int j=1;j<=3;j++){
                if(k+j>3){
                    System.out.println(k*10+j);
                }
            }
        }

        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);

        System.out.println(a);

        ListIterator ltr = a.listIterator();

        Iterator itr = a.iterator();

        System.out.println(itr);

        System.out.println(ltr);
        while(ltr.hasNext())
        {
            System.out.println(ltr.next());
//            ltr.next();
        }

        System.out.println(ltr);

        while(ltr.hasNext())
        {
            System.out.println(ltr.next());
//            ltr.next();
        }

    }
}
