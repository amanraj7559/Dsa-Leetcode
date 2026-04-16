import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sample obj = new Sample();
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        obj.traverse(arr);
        System.out.println("Enter the element to be added");
        int ele=sc.nextInt();
        System.out.println("Enter the index position");
        int index=sc.nextInt();
        obj.insert(arr,ele,index);
    }
    void traverse(int arr[]){
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
    }
    void insert(int[] arr,int ele,int index){
        for(int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];

        }
        arr[index]=ele;
        System.out.println("\nArray after insertion");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" "); 
        }      
    }
    
}
