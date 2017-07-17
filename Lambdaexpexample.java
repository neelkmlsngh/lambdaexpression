package neel;
import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Lambdaexpexample {
public static void main(String args[])
{
	/*Thread th=new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
		System.out.println("thread started");	
		}
	});*/
	/*Thread th=new Thread(()->System.out.println("Started"));
	th.start();*/
	List<Integer> no=Arrays.asList(1,2,3,4,5,6,7,8,9);
	List<Person> people=Arrays.asList(new Person("shyam",21,Gender.MALE, 0),new Person("Ram",22,Gender.MALE, 0),new Person("shyam",23,Gender.MALE, 0));
	/*Collections.sort(people,(value1,value2)->value1.getName().compareTo(value2.getName()));
	people.forEach(System.out::println);*/
	/*Collections.sort(people,(value1,value2)->value1.getName().compareTo(value2.getName())!=0?value1.getName().compareTo(value2.getName()):value1.getAge()-value2.getAge());
	*/
	
	/*Collections.sort(people,(value1,value2)->
	{
		int compare=value1.getName().compareTo(value2.getName());
		if(compare!=0)
			return compare;
	
		else
			return value1.getAge()-value2.getAge();
			
	}); */
	people.forEach(System.out::println);
	/*for(int i=0;i<no.size();i++)
		System.out.println(no.get(i));*/
	/*for(Integer i:no)
		System.out.println(i);*/
	/*no.forEach((Integer value)->System.out.println(value));*/
	/*no.forEach(new Consumer<Integer>() {

		@Override
		public void accept(Integer arg0) {
			// TODO Auto-generated method stub
		System.out.println(arg0);	
		}
	
	
	});*/
	/*no.forEach((Integer t)->System.out.println(t));
	no.forEach((t)->System.out.println(t));
	no.forEach(System.out::println); */
}
}
