import java.util.Scanner;

public class MyArrayListTest {
    public static void main(String[] args){
        int menu = 0;
        int listSize = 0;
        int index = 0;
        int value = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("생성할 리스트의 크기를 입력해주세요");
        listSize = scan.nextInt();
        MyArrayList myArrayList = new MyArrayList(listSize);
        System.out.println(listSize+" 크기의 리스트가 생성되었습니다.!");

        do{
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.삽입 2.중간 삽입 3.삭제 4.중간삭제 5.현재인덱스 6.인덱스로 값 검색 7.값으로 인덱스 검색 8.전체출력 9.나가기" );
            menu = scan.nextInt();

            switch (menu){
                case 1:
                    System.out.println("삽입할 원소를 입력하세요");
                    value = scan.nextInt();
                    myArrayList.addLast(value);
                    break;
                case 2:
                    System.out.println("삽입할 인덱스를 입력하세요");
                    index = scan.nextInt();
                    System.out.println("삽입할 원소를 입력하세요");
                    value = scan.nextInt();
                    myArrayList.add(index,value);
                    break;
                case 3:
                    myArrayList.removeLast();
                    break;
                case 4:
                    System.out.println("삭제할 인덱스를 입력하세요.");
                    index = scan.nextInt();
                    myArrayList.remove(index);
                    break;
                case 5:
                    System.out.println("현재 인덱스 : "+myArrayList.getSize() );
                    break;
                case 6:
                    System.out.println("검색할 인덱스를 입력해주세요.");
                    index = scan.nextInt();
                    myArrayList.get(index);
                    break;
                case 7:
                    System.out.println("검색할 값을 입력해주세요.");
                    value = scan.nextInt();
                    myArrayList.getIndex(value);
                    break;
                case 8:
                    myArrayList.printArray();
                    break;
                case 9:
                    System.out.println("종료 합니다.");
                    break;
                default:
                    System.out.println("메뉴 선택을 다시 해주세요.");
                    break;
            }
        }while(menu != 9);
    }
}
