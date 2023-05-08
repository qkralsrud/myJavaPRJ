import java.util.*;

public class Sd_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map1 =new HashMap<>();
        map1.put("name", "해리포터");
        map1.put("author", "조앤");
        map1.put("publisher", "한빞");

        Map<String, String> map2 =new HashMap<>();
        map2.put("name", "트와일라잇");
        map2.put("author", "조앤 게인");
        map2.put("publisher", "준상이정글");

        Map<String, String> map3 =new HashMap<>();
        map3.put("name", "준상이 서폿");
        map3.put("author", "조이");
        map3.put("publisher", "정글차이");

        list.add(map1);
        list.add(map2);
        list.add(map3);

        Integer abc = 0;
        System.out.println("도서 검색하세요");
        String search = s.next();
        list.forEach(title ->
                {
                    if (title.get("name").equals(search)) {
                        System.out.println(title.get("name"));
                        System.out.println(title.get("author"));
                        System.out.println(title.get("publisher"));
                    }
                }
        );
    }
}
