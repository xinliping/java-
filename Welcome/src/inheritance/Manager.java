package inheritance;

// extends是继承的关键字
public class Manager extends Employee{
	
	private double bonus;
	/**
	 * @param n the employee's name
	 * @param s the salary
	 * @param year the hire year
	 * @param month the hire month
	 * @param day the hire day
	 */
	public Manager(String n, double s, int year, int month, int day)
	{
		super(n, s, year, month, day);//super关键字引用父类
		bonus = 0;
	}
	
	public double getSalary()
	{
		double baseSalary = super.getSalary();
		return baseSalary = baseSalary + bonus;
	}
	
	public void setBonus(double b)
	{
		bonus = b;
	}

}
