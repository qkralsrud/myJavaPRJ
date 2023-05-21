import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BookSearchSystem {
    public static void main(String[] args) {
        // 도서 정보 저장용 HashMap 생성
        List <HashMap<String, String>> bookMap = new ArrayList<>(); //list는 한개만 넣기 가능 hashmap은 키와 값 두개 다 넣기 가능.

        // 도서 정보 추가 정보를 미리 저장
        HashMap<String, String> book1 = new HashMap<>();

        book1.put("저자", "조앤 k 롤링");
        book1.put("도서명", "해리포터");
        book1.put("출판사", "동원참치");
        bookMap.add(book1);

        HashMap<String, String> book2 = new HashMap<>();
        book2.put("저자", "스테파니");
        book2.put("도서명", "트와일라잇");
        book2.put("출판사", "리틀");
        bookMap.add(book2);

        HashMap<String, String> book3 = new HashMap<>();
        book3.put("저자", "댄 브라운");
        book3.put("도서명", "다빈치 코드");
        book3.put("출판사", "더블데이");
        bookMap.add(book3);

        // 도서 검색
        Scanner scanner = new Scanner(System.in);
        System.out.print("도서 제목을 입력하세요: ");
        String title = scanner.nextLine();

//        for(int i = 0; ;)
//        if (bookMap()) {
//            HashMap<String, String> book = bookMap.get(title);
//            System.out.println("도서 정보: ");
//            System.out.println("  저자: " + book.get("author"));
//            System.out.println("  제목: " + book.get("title"));
//            System.out.println("  출판사: " + book.get("publisher"));
//        } else {
//            System.out.println("해당 도서를 찾을 수 없습니다.");
//        }
    }
}
