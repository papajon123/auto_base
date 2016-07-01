/**
 * Created by Alex2 on 27.06.2016.
 */
import java.io.*;
import java.util.*;
public class Programm {



    public static void main(String[] args) throws FileNotFoundException {
        List<car_easy> list_car_easy = new ArrayList<car_easy>();
        List<car_medium> list_car_medium = new ArrayList<car_medium>();
        List<car_hard> list_car_hard = new ArrayList<car_hard>();
        FileInputStream fstream = null;
        Scanner x=new Scanner(new File("src/main/resources/index.txt"));
        while (x.hasNext()){
            String a=x.next();
            String b=x.next();
            String c=x.next();
            String d=x.next();
            String e=x.next();
            list_car_easy.add(new car_easy(a,b,c,d,e));
            a="";b="";c="";d="";e="";
        }

            String w=list_car_easy.get(1).toString();
           System.out.print(list_car_easy.size()+"   ");
           System.out.print(w);
    }
}
