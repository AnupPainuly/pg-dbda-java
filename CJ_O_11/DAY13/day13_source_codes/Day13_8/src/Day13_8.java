import java.io.File;
//display some information (Metadata) about the file 
import java.io.IOException;

public class Day13_8 {

	public static void main(String[] args) throws IOException
	{
		String path="C:/Users/sunbeam/Desktop/Code/DAY13/Day13_7/src/Day13_7.java";
		File fobj=new File(path);
		System.out.println(" Absolute Path = "+fobj.getAbsolutePath());
		System.out.println("Canonical Path = "+fobj.getCanonicalPath());
		System.out.println("Exists = "+fobj.exists());
		System.out.println("Get name = "+fobj.getName());
		System.out.println("Get Parent = "+fobj.getParent());
		System.out.println("Get Parent File = "+fobj.getParentFile());
		System.out.println("Get Path = "+fobj.getPath());
		System.out.println("is directory ? "+fobj.isDirectory());
		System.out.println("is File ? "+fobj.isFile());
		System.out.println("is hidden ? "+fobj.isHidden());
		System.out.println("Length = "+fobj.length());
	}
}

