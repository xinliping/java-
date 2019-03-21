package clone;

public class CloneTest 
{
	public static void main(String[] args)
	{
		try
		{
			Employee original = new Employee("John Q.Public", 50000);
			original.setHireDay(2000, 1, 1);
			System.out.println("orignal=" + original);
			
			Employee clone1 = original.clone();
			clone1.raiseSalary(10);
			clone1.setHireDay(2002, 12, 31);
			System.out.println("orignal_afterclone=" + original);
			System.out.println("clone=" + clone1);//原对象没变
			
			Employee copy = original;
			copy.raiseSalary(10);
			copy.setHireDay(2002, 12, 31);
			System.out.println("orignal_aftercopy=" + original);
			System.out.println("copy=" + copy);//原对象也被改变了
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
	}

}
