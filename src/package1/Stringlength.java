package package1;

public class Stringlength {
		static int ar[]={10,30,367,5,2,987};
		static int largest()
		{ 
		int i;
		int max=ar[0];

		for (i=1;i<ar.length;i++) {
			
		
		if(ar[i]>max){
		max=ar[i];
		}
		return max;
		}
		}
		public static void main(String[]args)
		{
		System.out.println("Largest element in the array is= " +largest);
		}
	}
static int ar[]={10,30,367,5,2,987};
static int largest()
{ 
int i;
int max=ar[0];

for (i=1;i<ar.length;i++)
if(ar[i]>max){
max=ar[i];
return max;
}
public static void main(String []args)
{
System.out.println("Largest element in the array is= " +largest);
}
}
