
public class OopsConcept {
	
	private String nameString;
	private int age;
	private int serialnum;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSerialnum() {
		return serialnum;
	}
	public void setSerialnum(int serialnum) {
		this.serialnum = serialnum;
	}
	@Override
	public String toString() {
		return "OopsConcept [nameString=" + nameString + ", age=" + age + ", serialnum=" + serialnum + "]";
	}
	

}
