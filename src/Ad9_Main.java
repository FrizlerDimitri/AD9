import java.util.Random;

public class Ad9_Main {

	public static void main(String[] args) {
		
		
		//Task 3
		
		int m=11;
		int a[]={10, 22, 31, 4, 15, 28, 17, 88, 59};
		
		OpenAddressProbing h1= new OpenAddressProbing(m);
		OpenAddressProbing h2= new OpenAddressProbing(m);
		OpenAddressProbing h3= new OpenAddressProbing(m);
		
		h1.linearProbing(a);
		h1.print();
		
		int c1=1,c2=3;
		
		h2.squarProbing(a,c1, c2);
		h2.print();
		
		
		h3.DoubelHashing(a);
		h3.print();
		
		
		
		
		// Task 4
		
		SkipList sl= new SkipList();
	
		Random rand = new Random();
		int j=20;
		int n=8;
		
		/*
		// insert  n numbers from [0,j]
		for(int i=0; i<n; i++)
		{
		
			int randomNum=rand.nextInt(j+1);
			
			while(sl.search(randomNum) == true)
			{
				
				randomNum=rand.nextInt(j+1);
				
			}
			
			sl.insert(randomNum);	
		}
		*/
		
		sl.insert(0);
		sl.insert(3);
		sl.insert(18);
		sl.insert(20);
		sl.insert(8);
		sl.insert(9);
		sl.insert(13);
		sl.insert(17);
		
		sl.printlist();
		System.out.println();
		
		sl.delete(17);
		sl.printlist();
		
		
	}
	

}
