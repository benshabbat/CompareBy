import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
	//public static int numOfRunner = 0;
	//public static int numOfThief = 0;
	//public static int numOfCheetah = 0;
	public static void main(String[] args) throws CloneNotSupportedException,InputMismatchException {
		
		Scanner s = new Scanner(System.in);
		int number;
		Object []o;
		
		System.out.println("test input" );
		boolean b=s.nextBoolean();
		
		if(b==true)
		{

			o = new Object[5];
			o[0]=new Runner("gogo",60);
			o[1]=new Thief("momo",180,6);
			o[2]=new Cheetah("aa",60,77);
			o[3]=new Runner("dd",60);
			o[4]=new Runner("cc",60);
		}
		else
		{
			System.out.println("how much objects do you want?" );
			number=s.nextInt();
			o = new Object[number];
			
			for(int i=0;i<o.length;i++)
			{
				
				System.out.println("choise 1 for Runner , 2 for Thief, 3 for Cheetah");
				int choose =s.nextInt();
				switch(choose)
				{
					case 1:
					{
						System.out.println("what is your Runner's name?");
						String nameR= s.next();
						System.out.println("what is  your avg Speed?");
						double speed= s.nextDouble();
						o[i]=new Runner(nameR,speed);
						break;
					}
					case 2:
					{	
						System.out.println("what is your Thief's name?");
						String nameT= s.next();
						System.out.println("what is your High?");
						double highT= s.nextDouble();
						System.out.println("how much is your numberOf?");
						int numberOfT= s.nextInt();
						o[i]=new Thief(nameT,highT,numberOfT);
						break;
					}
					case 3:
					{
						System.out.println("what is your Cheetah's name?");
						String nameC= s.next();
						System.out.println("what is your High?");
						double highC= s.nextDouble();
						System.out.println("how much is your numberOf?");
						int numberOfC= s.nextInt();
						o[i]=new Cheetah(nameC,highC,numberOfC);
						break;
					}
				
				}
							
			}
			System.out.println("Thank You =]");
		}		
/*
		for(int i=0;i<o.length;i++)
		{
			if(o[i] instanceof Runner)
			{
				numOfRunner++;
			}
			else if(o[i] instanceof Thief)
			{
				numOfThief++;
			}
	
			else if(o[i] instanceof Cheetah)
			{
				numOfCheetah++;
			}
		}
		*/
		
		System.out.println(Arrays.toString(o));
		
		for(int i=0;i<o.length;i++)
		{
			if(o[i] instanceof Stealable)
			{
				((Stealable)o[i]).steal();
			}
		}
		
		for(int i=0;i<o.length;i++)
		{
			if(o[i] instanceof Runable)
			{
				((Runable)o[i]).run();
			}

		}
		
		Object o2[]=o.clone();
		System.out.println(Arrays.toString(o2));
		/*
		Object oRunner[]=new Object[o2.length];
		
		for(int i=0,j=0;i<o.length;i++)
		{			
			if(o2[i] instanceof Runner)
			{
				oRunner[j]=o2[i];
				j++;
			}	
		}
		
		System.out.println("after sort runners by name:");
		CompareBy c1 = new CompareBy();
		Arrays.sort(oRunner,c1.name());
		System.out.println(Arrays.toString(oRunner));
		*/
	
		System.out.println("after sort  by name:");
		CompareBy c = new CompareBy();
		Arrays.sort(o,c.name());
		System.out.println(Arrays.toString(o));
		System.out.println("after sort runners by name:");
		
		for(int i=0;i<o.length;i++)
		{			
			if(o[i] instanceof Runner)
			{
				System.out.print(o[i]);
					}
			
		}
		Object []oTemp = new Object[Runner.getNumberOfRunner()];
		for(int i=0,j=0;i<o.length;i++)
		{			
			if(o[i] instanceof Breathable)
			{
				oTemp[j++]=o[i];
				
			}
			
		}
		//System.out.println(numOfRunner);
		System.out.println(Runner.getNumberOfRunner());
		System.out.println(Arrays.toString(oTemp));
		
		System.out.println(Runner.getNumberOfRunner());
		

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		CompareBy c = new CompareBy();
		Runner []runners= new Runner[3];
		runners[0]= new Runner("ahmad",90);
		runners[1]= new Runner("ibrahim",87.5);
		runners[2]= new Runner("david",78.5);
		Arrays.sort(runners);
		System.out.println(Arrays.toString(runners));
		Arrays.sort(runners, c.name());
		System.out.println(Arrays.toString(runners));
		Arrays.sort(runners, c.avgSpeed());
		System.out.println(Arrays.toString(runners));
*/
		/*
		CompareBy c= new CompareBy();
		Thief []thiefes= new Thief [3];
		thiefes[0]= new Thief("ahmad",90,10);
		thiefes[1]= new Thief("ibrahim",99,7);
		thiefes[2]= new Thief("david",12,18);
		//Arrays.sort(thiefes);
		//c.high();
		Arrays.sort(thiefes,c.high());
		System.out.println(Arrays.toString(thiefes));
		//c.numberOf();
		Arrays.sort(thiefes,c.numberOf());
		System.out.println(Arrays.toString(thiefes));
		//c.name();
		
		Arrays.sort(thiefes,c.name());
		System.out.println(Arrays.toString(thiefes));
		//System.out.println(thiefes[0].toString());
		
		//Arrays.sort(thiefes, new CompareBy("NUMBEROF"));
	//	System.out.println(Arrays.toString(thiefes));

		*/
		/*
		Cheetah ch = new Cheetah("Cheetah",24.5,6);
		System.out.println(ch.toString());
		Cheetah ch1 = ch.clone();
		System.out.println(ch1.toString());
		ch.setName("haji");
		System.out.println();
		System.out.println(ch.toString());
		System.out.println(ch1.toString());		
		*/
		
		
		//Thief th = new Thief("jojo", 12.5, 4);
		//System.out.println(th.toString());
		/*-
		Thief th1 = th.clone();
		System.out.println(th1.toString());
		System.out.println();
		th.setNumberOf(9);
		System.out.println(th.toString());
		System.out.println();
		*/
		//System.out.println(th2.equals(th));
		//th.setName("momi");
		//Thief th2 = new Thief(th);
		//System.out.println(th2.toString());
		//System.out.println(th2.toString());
		//System.out.println(th.toString());
		
		/*
		Runner r = new Runner("ahmad",89.5);
		System.out.println(r.toString());
		Runner r1 =r.clone();
		System.out.println(r1.toString());
		System.out.println();
		r.setAvgSpeed(105.2);
		System.out.println(r.toString());
		*/
	}

}
