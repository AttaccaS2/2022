package html2.pdf;

public class H {
	public String id;
	public String name;
	public int age;
	public String ch;
	
	H (String id, String name, int age, String ch){
		//생성자 메소드 선언으로 객체가 선언
		this.id=id;
		this.name=name;
		this.age=age;
		this.ch=ch;
		
		System.out.println(this.id + ":" + this.name + "-" + this.age + "=>" + "총무" + this.ch);
	}

}//public class H 선언


 class ex{
	 public static void main(String[] args) {
		//인수를 동반한 객체 3
		H h1 = new H("2019","홍",20,"김");
		H h2 = new H("2020","이",21,"김");
		H h3 = new H("2021","감",22,"김");
	}
 }
