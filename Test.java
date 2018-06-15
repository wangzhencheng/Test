import java.io.File;

public class Test{
	
	public static void main(String args[]){
		System.out.println("path:"+new File(args[0]).getAbsolutePath());
	}
	
}