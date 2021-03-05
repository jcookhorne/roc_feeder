package Array;

public class CrudArray {

	//create, read, update and delete.
	public static void main(String[] args) {
	
		
		int ar[]=new int[6];
		ar[0] = 15;
		ar[1] = 75;
		ar[2] = 82;
		ar[3] = 36;
		ar[4] = 72;
		ar[5] = 55;
		ar[6] = 33;
		int n=7; //use n to keep track of elements in array
		System.out.println("Before Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		
		int ele=8;
		int pos=3;
		for(int i=n;i>pos-1;i--) {
			ar[i]=ar[i-1];   //updating
		}
		ar[pos-1]=ele; //inserting 
		n++;
		
		System.out.println("\n\nAfter Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		
		int delpos=2;
		for (int i = delpos-1; i < n; i++) {
			ar[i]=ar[i+1];
		}
		n--;
		System.out.println("\n\nAfter Deletion from positon "+delpos);
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		
		
		
		
		
	}
	//Perform CRUD operations on Array
}}
