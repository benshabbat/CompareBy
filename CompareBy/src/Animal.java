
public class Animal {

	protected String name;
	public Animal(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean equals(Object other)
	{
		if(!(other instanceof Animal))
			return false;
		Animal temp= (Animal)other;
		return (temp.name==this.name);
	}
	public String toString()
	{
		return "name is : " +getName()+",";
	}
}
