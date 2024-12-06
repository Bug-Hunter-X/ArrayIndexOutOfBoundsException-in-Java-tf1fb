public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if(arr.length > 5 && 5 >= 0){
          arr[4] = 10; 
        }else{
          System.out.println("Index out of bound");
        }
        System.out.println(arr[4]);
    }
}