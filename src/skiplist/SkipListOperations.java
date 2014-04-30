/**
 * 
 */
package skiplist;

import java.io.File;
import java.util.Scanner;

/**
 * @author Dinesh Appavoo
 * ver 1.0
 *
 */
public class SkipListOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long inTime=System.currentTimeMillis();
		//Long result=new SkipListOperations().operateOnBalancedTrees("/users/dany/downloads/sskew.txt");
		//System.out.println("Total Result : "+result);
		long pTime=System.currentTimeMillis();
		System.out.println("Time in Milli Secs "+(pTime-inTime));
		new SkipListOperations().testSkipList();
		
	}
	
	public Long operateOnBalancedTrees(String inFile)
	{
		File infile=new File(inFile);
		Long nTotalOperationResult=(long) 0;
		String sOperation="";
        //DSL sList=new DSL(9223372036854775807L,9223372036854775807L);
		SkipList<Long, Long> sList=new SkipList<Long, Long>();

		try{
			Scanner fileScanner=new Scanner(infile);
			while(fileScanner.hasNext())
			{
				if(!(Character.isDigit((sOperation=fileScanner.next()).charAt(0))))
				{
					//System.out.println(sOperation);
					if(sOperation.compareTo("Insert")==0)
					sList.add(fileScanner.nextLong(), fileScanner.nextLong());
					else if(sOperation.compareTo("Find")==0)
					sList.get(fileScanner.nextLong());
					else if(sOperation.compareTo("FindMin")==0)
					nTotalOperationResult+=sList.findMin();
					else if(sOperation.compareTo("FindMax")==0)
					nTotalOperationResult+=sList.findMax();
					else if(sOperation.compareTo("Remove")==0)
					sList.remove(fileScanner.nextLong());
					else if(sOperation.compareTo("RemoveValue")==0)
					nTotalOperationResult+=sList.removeValue(fileScanner.nextLong());
					else if(sOperation.compareTo("Size")==0)
					nTotalOperationResult+=sList.size();
					else if(sOperation.compareTo("IsEmpty")==0)
						;
						//sList.isEmpty();
				}
			}
		

		}catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		
		

		return nTotalOperationResult;
	}
	
	public void testSkipList()
	{
		SkipList<Long, Long> sList=new SkipList<Long, Long>();
		sList.add(10L, 25L);
		sList.add(12L, 55L);
		sList.add(14L, 45L);
		sList.add(16L, 55L);
		System.out.println(sList.findMin());
		System.out.println(sList.findMax());
		sList.remove(14L);
		System.out.println(sList.get(14L));
		System.out.println(sList.size());
		


	}

}
