
public class Thief extends Person implements Runable,Stealable,Cloneable,Comparable<Thief>{
	private static int numberOfThief;
	
	private int numberOf;
	private double high;
	
	public Thief(String name,double high,int numberOf) {
		super(name);
		setHigh(high);
		setNumberOf(numberOf);
		Thief.numberOfThief++;
		
	}
	public static int getNumberOfThief()
	{
		return Thief.numberOfThief;
	}
	public Thief(Thief other)
	{
		super(other.name);
		this.high=other.high;
		this.numberOf=other.numberOf;
	}
	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public int getNumberOf() {
		return numberOf;
	}

	public void setNumberOf(int numberOf) {
		this.numberOf = numberOf;
	}
	public void stop()
	{
		this.numberOf++;
	}
	public boolean equals(Object other)
	{
		if(!(other instanceof Thief))
			return false;
		Thief temp= (Thief)other;
		return (temp.name==this.name&&temp.high==this.high&&temp.numberOf==this.numberOf);
	}
	public String toString()
	{
		return "The Thief " +super.toString()+ " the high is : " +getHigh() + 
				" Number of times arrested " + getNumberOf() + "\n";
	}

	@Override
	public void steal() {
		
		System.out.println(getName()+" is stole");
	}

	@Override
	public void run() {
		
		System.out.println(getName()+" is running");
	}
	@Override
	public Thief clone() throws CloneNotSupportedException
	{
		Thief temp =(Thief)super.clone();
		temp.high=this.high;
		temp.numberOf=this.numberOf;
		return temp;
	}
	
	@Override
	public int compareTo(Thief o) {
		
		return this.name.compareTo(o.name);
	
	}
}
