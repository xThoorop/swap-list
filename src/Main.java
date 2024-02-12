import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    /*
    Napisz mechanizm, który skonwertuje listę typu String na listę typu Integer.
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> lista = new ArrayList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        System.out.println(swapStringList(lista));
    }



    public static List<Integer> swapStringList(List<String> input){
        List<Integer> list = new ArrayList<Integer>();
        for (String s : input){
            try {
                list.add(Integer.parseInt(s));
            }catch (Exception e){
                System.out.println("Wartosc nie jest intem!");
            }
        }
        return list;
    }
}