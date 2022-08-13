package ShortCircuitTestAnd;

public class ShortCircuitTestAnd {
  public static void main(String[] args) {
	if (FalseMethod() && TrueMethod()) {
		System.out.println("Both are true");
	}
	else {
		System.out.println("Both are not true");
	}
}
  public static boolean TrueMethod() 
  {
	System.out.println("Within TrueMethod()");
	return true;
  }
  public static boolean FalseMethod() 
  {
	System.out.println("Within FalseMethod()");
	return false;
  }
}
