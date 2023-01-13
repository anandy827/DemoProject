
public class T1 {

	public static void main(String[] args) {
		Document d1=new Text("qspider data","pdf",5);
		Text t=(Text)d1;
		System.out.println(d1.name);
		System.out.println(d1.extension);
		System.out.println(t.nooflines);
		Document d2=new Image("jspider data","jpg",10.00f,15.00f);
		Image i=(Image)d2;
		System.out.println(d2.name);
		System.out.println(d2.extension);
		System.out.println(i.height);
		System.out.println(i.width);
	}

}
