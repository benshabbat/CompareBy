import java.util.Comparator;

public class CompareBy implements Comparator<Object> {
	private String type;
	

	private CompareByNumberOf cNumberOf= new CompareByNumberOf();
	private CompareByHigh cHigh = new CompareByHigh();
	private CompareByName cName = new CompareByName();
	private CompareByAvgSpeed cAvgSpeed = new CompareByAvgSpeed();
	
	public CompareByHigh high()
	{
		sortHigh();
		return cHigh;
	}
	public CompareByNumberOf numberOf()
	{
		sortNumberOf();
		return cNumberOf;
	}
	public CompareByName name()
	{
		sortName();
		return cName;
	}
	public CompareByAvgSpeed avgSpeed()
	{
		sortAvgSpeed();
		return cAvgSpeed;
	}
	
	private void sortHigh()
	{
		this.type="high";
	}
	private void sortNumberOf()
	{
		this.type="numberOf";
	}
	private void sortName()
	{
		this.type ="name";
	}
	private void sortAvgSpeed()
	{
		this.type ="name";
	}
	
	private int compareRunner(Runner o1,Runner o2)
	{
		if(type=="name")
		{
			return o1.name.compareTo(o2.name);
		}
		else if(type=="avgSpeed")
		{
			if(o1.getAvgSpeed()<o2.getAvgSpeed()) return -1;
			else if(o1.getAvgSpeed()>o2.getAvgSpeed()) return 1;
			else return 0;
		}
		return 0;
	}
	private int compareThief(Thief o1, Thief o2)
	{
		if(type=="high")
		{
			if(o1.getHigh()<o2.getHigh()) return -1;
			else if(o1.getHigh()>o2.getHigh()) return 1;
			else return 0;
		}
		else if(type=="numberOf") 
		{
			if(o1.getNumberOf()<o2.getNumberOf()) return -1;
			else if(o1.getNumberOf()>o2.getNumberOf()) return 1;
			else return 0;
				}
		else if(type=="name")
		{
			return o1.name.compareTo(o2.name);
		}
		return 0;
	}
	private int compareCheetah(Cheetah o1, Cheetah o2)
	{
		if(type=="high")
		{	if(o1.getHigh()<o2.getHigh()) return -1;
			else if(o1.getHigh()>o2.getHigh()) return 1;
			else return 0;
		}
		else if(type=="numberOf") 
		{
			if(o1.getNumberOf()<o2.getNumberOf()) return -1;
			else if(o1.getNumberOf()>o2.getNumberOf()) return 1;
			else return 0;
		}
		else if(type=="name")
		{
			return o1.name.compareTo(o2.name);
		}
		return 0;
	}
	public int comparePerson(Person o1, Person o2) {
		 if(type=="name")
			{
				return o1.name.compareTo(o2.name);
			}
			return 0;
	}
	private int compareAnimal(Animal o1, Animal o2) {
		 if(type=="name")
			{
				return o1.name.compareTo(o2.name);
			}
			return 0;
	}

	private int compareObject(Object o1, Object o2) {
		 if(type=="name")
			{
			 if(o1 instanceof Person&&o2 instanceof Animal) {
			 return ((Person)o1).name.compareTo(((Animal)o2).name);
			 }
			 else if(o2 instanceof Person&&o1 instanceof Animal) {
				 return ((Animal)o1).name.compareTo(((Person)o2).name);
				 }
			}
		
		return 0;
	}
	@Override
	public int compare(Object o1, Object o2) {
	
		if(o1 instanceof Thief&&o2 instanceof Thief) {
	
		return compareThief((Thief)o1,(Thief)o2);
		}
		else if(o1 instanceof Cheetah&&o2 instanceof Cheetah) {

		return compareCheetah((Cheetah)o1,(Cheetah)o2);}
	
		else if(o1 instanceof Runner&&o2 instanceof Runner) {

		return compareRunner((Runner)o1,(Runner)o2);}
	
		else if(o1 instanceof Person&&o2 instanceof Person) {

		return comparePerson((Person)o1,(Person)o2);}
		
		else if(o1 instanceof Animal&&o2 instanceof Animal) {

			return compareAnimal((Animal)o1,(Animal)o2);}
		
		else if(o1 instanceof Object&&o2 instanceof Object) {

			return compareObject(o1,o2);}
		return 0;
		}
	

public class CompareByNumberOf implements Comparator<Object> {
	/*
	private int compareThief(Thief o1, Thief o2)
	{
		if(o1.getNumberOf()<o2.getNumberOf()) return -1;
		else if(o1.getNumberOf()>o2.getNumberOf()) return 1;
		else return 0;

	}
	private int compareCheetah(Cheetah o1, Cheetah o2)
	{
		if(o1.getNumberOf()<o2.getNumberOf()) return -1;
		else if(o1.getNumberOf()>o2.getNumberOf()) return 1;
		else return 0;

	}
	*/

	@Override
	public int compare(Object o1, Object o2) {

		if(o1 instanceof Thief&&o2 instanceof Thief) {
	
		return compareThief((Thief)o1,(Thief)o2);
		}
		else if(o1 instanceof Cheetah&&o2 instanceof Cheetah) {

		return compareCheetah((Cheetah)o1,(Cheetah)o2);}
	
		return 0;
	
	}
}
public class CompareByHigh implements Comparator<Object> {
	/*
	private int compareThief(Thief o1, Thief o2)
	{
		if(o1.getHigh()<o2.getHigh()) return -1;
		else if(o1.getHigh()>o2.getHigh()) return 1;
		else return 0;
	}
	private int compareCheetah(Cheetah o1, Cheetah o2)
	{
		if(o1.getHigh()<o2.getHigh()) return -1;
		else if(o1.getHigh()>o2.getHigh()) return 1;
		else return 0;
		

	}
	*/
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Thief&&o2 instanceof Thief) {
			
		return compareThief((Thief)o1,(Thief)o2);
		}
		else if(o1 instanceof Cheetah&&o2 instanceof Cheetah) {

		return compareCheetah((Cheetah)o1,(Cheetah)o2);}
	
		return 0;}
	}
public class CompareByName implements Comparator<Object> {
	/*
	private int compareRunner(Runner o1,Runner o2)
	{
		return o1.name.compareTo(o2.name);
	}
	private int compareThief(Thief o1, Thief o2)
	{
		return o1.name.compareTo(o2.name);

	}
	private int compareCheetah(Cheetah o1, Cheetah o2)
	{
		return o1.name.compareTo(o2.name);

	}
	*/
	@Override
	public int compare(Object o1, Object o2) {
			
		if(o1 instanceof Thief&&o2 instanceof Thief) {
		
		return compareThief((Thief)o1,(Thief)o2);
		}
		else if(o1 instanceof Cheetah&&o2 instanceof Cheetah) {

		return compareCheetah((Cheetah)o1,(Cheetah)o2);}
		
		else if(o1 instanceof Runner&&o2 instanceof Runner) {

		return compareRunner((Runner)o1,(Runner)o2);}
		
		else if(o1 instanceof Person&&o2 instanceof Person) {

		return comparePerson((Person)o1,(Person)o2);}
		
		else if(o1 instanceof Animal&&o2 instanceof Animal) {

		return compareAnimal((Animal)o1,(Animal)o2);}
		
		else if(o1 instanceof Object&&o2 instanceof Object) {

		return compareObject(o1,o2);}
		return 0;
		}



	}
public class CompareByAvgSpeed implements Comparator<Object>{
	/*
	private int compareRunner(Runner o1,Runner o2)
	{
		if(o1.getAvgSpeed()<o2.getAvgSpeed()) return -1;
		else if(o1.getAvgSpeed()>o2.getAvgSpeed()) return 1;
		else return 0;

	}
*/
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Runner&&o2 instanceof Runner) {

			return compareRunner((Runner)o1,(Runner)o2);}
			
			return 0;
	
	}


	
}





}


