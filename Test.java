import java.io.File;
import java.util.Arrays;

public class Test{
	
	public static void main(String args[]){
		System.out.println("params:"+ Arrays.asList(args));
		
		System.out.println("path:"+new File(args[0]).getAbsolutePath());
		System.out.println("path:"+new File(args[0]).getAbsolutePath());
	}
	
}