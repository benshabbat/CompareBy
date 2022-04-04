
public class Person {
	protected String name;
	
	public Person(String name)
	{
		setName(name);
	}
	public Person(Person other)
	{
		other.name=this.name;
	}
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object other)
	{
		if(!(other instanceof Person))
			return false;
		Person temp= (Person)other;
		return (temp.name==this.name);
	}
	public String toString()
	{
		return "name is : " +getName();
	}
}
