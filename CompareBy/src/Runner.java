

public class Runner extends Person implements Runable,Breathable,Cloneable,Comparable<Runner>{

	private double avgSpeed;
	private static int numberOfRunner;
	
	public Runner(String name,double avgSpeed) {
		super(name);
		setAvgSpeed(avgSpeed);
		Runner.numberOfRunner++;
	}

	public static int getNumberOfRunner()
	{
		return Runner.numberOfRunner;
	}
	public double getAvgSpeed() {
		return avgSpeed;
	}
	public void setAvgSpeed(double avgSpeed) {
		this.avgSpeed = avgSpeed;
	}
	@Override
	public void run() {
		
		System.out.println(getName()+" is running");
	}
	@Override
	public void breath() {

		System.out.println(getName()+" is breathing");
		
	}

	public boolean equals(Object other)
	{
		if(!(other instanceof Runner))
			return false;
		Runner temp= (Runner)other;
		return (temp.name==this.name&&temp.avgSpeed==this.avgSpeed);
	}
	public String toString()
	{
		return "The Runner " +super.toString()+ " the avarege Speed is : "+ getAvgSpeed()+"\n";
	}
	public Runner clone() throws CloneNotSupportedException
	{
		Runner temp = (Runner)super.clone();
		temp.avgSpeed=this.avgSpeed;
		return temp;
	}

	@Override
	public int compareTo(Runner o) {
	
		return this.name.compareTo(o.name);
	}
	
	
	
	
	
	



}
