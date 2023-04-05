public class Ex08_03 {
    public static void main(String[] args) {
        int aa[] = {100,200,300,400}; // 한번에 중괄호로도 메모리에 올리기 가능
        int bb[] = new int[]{100,200,300}; //new 라는 명령어로 메모리에 옮길수 있고

        int cc[];
        cc = new int[]{100,200};
        int[]dd = new int[1];
        dd[0]=100;
        int i;

        System.out.println("aa 몇개 ? : "+aa.length);
        for (i = 0; i < aa.length ; i++)
            System.out.printf("aa[%d] ==> %d\t",i , aa[i]);
        System.out.printf("\n");

        System.out.println("bb 몇개 ? : "+bb.length);
        for (i = 0; i < bb.length ; i++)
            System.out.printf("bb[%d] ==> %d\t",i , bb[i]);
        System.out.printf("\n");

        System.out.println("cc 몇개 ? : "+cc.length);
        for (i = 0; i < cc.length ; i++)
            System.out.printf("cc[%d] ==> %d\t",i , cc[i]);
        System.out.printf("\n");



//
//        for (i = 0; i <4 ; i++)
//            System.out.printf("aa[%d] ==> %d\t",i , aa[i]);
//        System.out.printf("\n");
//
//        for (i = 0; i <3 ; i++)
//            System.out.printf("bb[%d] ==> %d\t",i , bb[i]);
//        System.out.printf("\n");
//
//        for (i = 0; i <2 ; i++)
//            System.out.printf("cc[%d] ==> %d\t",i , cc[i]);
//        System.out.printf("\n");
//
//        for (i = 0; i <1 ; i++)
//            System.out.printf("dd[%d] ==> %d\t",i , dd[i]);
//        System.out.printf("\n");
    }
}
