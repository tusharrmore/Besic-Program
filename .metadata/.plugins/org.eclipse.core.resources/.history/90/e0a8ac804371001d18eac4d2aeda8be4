package SingletoneClass;

public class ASingletone {
	
	private static ASingletone a;
	private ASingletone() {
		
	}
	
	public static ASingletone getInsatance() {
		
		if (a == null) 
		{
			a=new ASingletone();
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		ASingletone s = ASingletone.getInsatance();
		ASingletone s1 = ASingletone.getInsatance();
		ASingletone s2 = new ASingletone();
		
		System.out.println(s2.getInsatance().hashCode());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
	}

}
