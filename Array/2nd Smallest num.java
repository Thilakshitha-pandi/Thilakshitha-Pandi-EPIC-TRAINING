import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int arr[] = new int[size];
		int temp ;
		
		for (int i = 0 ; i < size ; i++){
		    arr[i] = in.nextInt();
		}
		
		for(int i=0; i<size ;i++){
		    for (int j = i+1 ; j<size; j++){
		        if (arr[i] > arr[j]){
		            temp = arr[j];
		            arr[j] = arr[i];
		            arr[i] = temp;
		        }
		    }
		}
		
		for (int i = 1; i < size ; i++){
		    if(arr[i] != arr[0]){
		        System.out.println(arr[i]);
		        break;
		    }
		}
		
	}
}
