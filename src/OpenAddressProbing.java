

public class OpenAddressProbing {
	
	
	
	public HashNode hasttabel[];
	public int m;
	
	public OpenAddressProbing(int m)
	{
		this.m=m;
		
		hasttabel=new HashNode[m];
		for(int i=0; i<m; i++)
		{
			hasttabel[i]=new HashNode();
		}
		
	}
	
	
	public void linearProbing(int keys[])
	{
	
		
		for(int j=0; j<keys.length; j++)
		{
			int i=0;
			while(true)
			{
				int positon=keys[j]%m+i;
				
				if(hasttabel[positon].isempty==true)
				{
					hasttabel[positon].key=keys[j];
					hasttabel[positon].isempty=false;
					break;
					
				}
				
				i++;
				
			}
			
			
		}
		
	}
	
	public void squarProbing(int keys[], int c1, int c2)
	{
	
		
		for(int j=0; j<keys.length; j++)
		{
			int i=0;
			while(true)
			{
				int positon=(keys[j]+c1*i+c2*i*i)%m;
				
				if(hasttabel[positon].isempty==true)
				{
					hasttabel[positon].key=keys[j];
					hasttabel[positon].isempty=false;
					break;
					
				}
				
				i++;
				
			}
			
			
		}
		
	}
	
	
	public void DoubelHashing(int keys[])
	{
		
		for(int j=0; j<keys.length; j++)
		{
			int i=0;
			while(true)
			{
				int positon=(keys[j]+i*(1+(keys[j]%(m-1))))%m;
				
				if(hasttabel[positon].isempty==true)
				{
					hasttabel[positon].key=keys[j];
					hasttabel[positon].isempty=false;
					break;
					
				}
				
				i++;
				
			}
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public void print()
	{
		
		for(int i=0; i<m; i++)
		{
			if(hasttabel[i].isempty==false)
			{
				System.out.print(hasttabel[i].key+" ");
			}
			
		}
		System.out.println();
		
	}
	
	
	
	
	
	

}
