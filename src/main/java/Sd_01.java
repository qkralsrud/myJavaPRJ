import java.util.*;

public class Sd_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map =null;

        for (int i = 0; i< 3; i++){
            System.out.print("도서명 : ");
            String name =s.next();

            System.out.print(" 저자 : ");
            String author =s.next();

            System.out.print(" 출판사 : ");
            String publisher = s.next();

            map=new HashMap<>();

            map.put("name", name);
            map.put("author", author);
            map.put("publisher", publisher);

            list.add(map);

            map = null;
        }
        int listSize= list.size();
    }
}
