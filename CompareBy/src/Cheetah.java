
public class Cheetah extends Animal implements Runable,Cloneable{

	private int numberOf;
	private double high;
	private static int numberOfCheetah;
	public Cheetah(String name,double high,int numberOf) {
		super(name);
		setHigh(high);
		setNumberOf(numberOf);
		Cheetah.numberOfCheetah++;
	}
	public static int getNumberOfCheetah()
	{
		return Cheetah.numberOfCheetah;
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
	public boolean equals(Object other)
	{
		if(!(other instanceof Cheetah))
			return false;
		Cheetah temp= (Cheetah)other;
		return (temp.name==this.name&&temp.high==this.high&&temp.numberOf==this.numberOf);
	}
	public String toString()
	{
		return "The Cheetah " +super.toString()+ " the high is : " +getHigh()+"," + 
				" Number of times arrested " + getNumberOf()+"\n";
	}

	@Override
	public void run() {
		System.out.println(getName()+" is running");
	}
	public Cheetah clone() throws CloneNotSupportedException
	{
		Cheetah temp =(Cheetah)super.clone();
		temp.high=this.high;
		temp.numberOf=this.numberOf;
		return temp;
	}
}
