package neel;

public class Person {
String name;
int age;
Gender gender;
double sallery;
public Person(String name, int age, Gender gender,double sallery) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
	this.gender = gender;
}

public double getSallery() {
	return sallery;
}
public void setSallery(double sallery) {
	this.sallery = sallery;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", sallery=" + sallery + "]";
}

}