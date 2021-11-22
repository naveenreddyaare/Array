
public class Array {
     
	public static void main(String[] args) {
		int a[]= {0,1,5,9,-1,-7,10,56,76};
		int smallest=a[0];
		int largest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if (a[i]>largest)
				largest=a[i];
			else if(a[i]<smallest)
				smallest=a[i];
		}
		System.out.println("smallest number is"+smallest);
		
		System.out.println("largest number is"+largest);

}
}