public class MyArrayList {  //삽입 , 삭제 , 값 얻기 , 원소로 인데스 얻기
    int size;
    int index;
    private int[] arrayList;

    public MyArrayList(int size){
        index = -1;
        this.size = size;
        arrayList = new int[size];
    }

    public int getSize(){
        return index;
    }

    public Boolean isFull(){
        return index == arrayList.length-1;
    }

    public Boolean isEmpty(){
        return index == -1;
    }

    public void addLast(int num){
        if(isFull()){
            System.out.println("List is full!");
        }
        else {
            index++;
            arrayList[index] = num;
            System.out.println("삽입 성공");

        }
    }

    public void add(int currentIndex, int num){
        if(isFull()){
            System.out.println("List is full!");
        }
        else {
            for (int i = arrayList.length-2;currentIndex <= i;i--){
                arrayList[i+1] = arrayList[i];
            }
            arrayList[currentIndex] = num;
            index++;
            System.out.println("삽입 성공");
        }

    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("List is Empty!! , Can't remove value , Try again insert value..");
        }
        else{
            int removeValue = arrayList[index];
            arrayList[index] = 0;
            index --;
            System.out.println("삭제된 값 : "+removeValue);
        }

    }

    public void remove(int currentIndex){
        if(isEmpty()){
            System.out.println("List is Empty!! , Can't remove value , Try again insert value..");
        }
        else{
            int removeValue = arrayList[currentIndex];
            for(int i = currentIndex; i<arrayList.length-1; i++){
                arrayList[i] = arrayList[i+1];
            }
            index --;
            System.out.println("삭제된 값 : " +removeValue);
        }
    }

    public void getIndex(int num){
        int currentIndex = -1;

        for(int i = 0 ; i < arrayList.length; i++){
            if(num == arrayList[i]){
                currentIndex = i;
                break;
            }
        }
        if(currentIndex == -1){
            System.out.println("검색된 값이 없습니다.");
        }
        else
            System.out.println("검색된 인덱스 : " + currentIndex);
    }

    public void get(int currentIndex){
        if(currentIndex <0 || currentIndex>arrayList.length-1){
            System.out.println("인덱스 오류.");
        }
        else
            System.out.println("검색 한 값 : " + arrayList[currentIndex]);
    }

    public void printArray(){
        for(int i = 0; i<=index ; i++){
            System.out.print(arrayList[i]+ " ");
        }
        System.out.println();
    }

}
