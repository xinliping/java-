package inheritance;

/**
 * 继承、覆盖
 */

public class ManagerTest {
	public static void main(String[] args)
	{
		Manager boss = new Manager("Bob", 80000, 2017, 12, 15);
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[3];
		
		//在staff中填入员工和管理者对象
		staff[0] = boss;
		staff[1] = new Employee("Alice", 50000, 2018, 10, 1);
		staff[2] = new Employee("Tom", 40000, 2018, 3, 15);
		
		//输出薪资
		for(Employee e: staff)
		{
			System.out.println("name: " + e.getName() + ", salary: " + e.getSalary());
		}
	}
}
