// 方法参数调用区分
// 按值调用与对象引用调用
public class ParamTest {
	public static void main(String[] args)
	{
		/*
		 * test1:方法不能传递参数变量
		 */
		System.out.println("Testing tripleValue:");
		double percent = 10;
		System.out.println("Before：percent = "+percent);
		tripleValue(percent);
		System.out.println("After：percent = "+percent);
		
		/*
		 * test2:方法能够改变对象参数状态
		 */
		System.out.println("\nTesting tripleSalary:");
		Employee harry = new Employee("Harry",50000);
		System.out.println("Before：salary = "+harry.getSalary());
		tripleSalary(harry);
		System.out.println("After：salary = "+harry.getSalary());
		
		/*
		 * test3:方法不能将一个对象赋给另一个对象
		 */
		System.out.println("\nTesting swap:");
		Employee a = new Employee("Alice",70000);
		Employee b = new Employee("Bob",80000);
		System.out.println("Before：a = "+a.getName());
		System.out.println("Before：b = "+b.getName());
		swap(a,b);
		System.out.println("After：a = "+a.getName());
		System.out.println("After：b = "+b.getName());	
	}
	public static void tripleValue(double x)//无效
	{
		x = 3*x;
		System.out.println("End of method: x=" + x);
	}
	
	public static void tripleSalary(Employee x)//有效
	{
		x.raiseSalary(200);
		System.out.println("End of method: Salary=" + x.getSalary());
	}
	
	public static void swap(Employee x, Employee y)//无效
	{
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("End of method: x=" + x.getName());
		System.out.println("End of method: y=" + x.getName());
	}
}

class Employee //简单定义Employee类
{
	private String name;
	private double salary;
	
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
