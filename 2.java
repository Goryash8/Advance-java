// Write a Java program to list out files in given directories.
import java.io.*;
class demo{
	public static void main(String[] args) {
		File f1 = new File("E:/programs/java2");
		String[] files = f1.list();
			if (files.length == 0) {
			    System.out.println("The directory is empty");
			}
			else 
			{
		    	for (String allfiles : files) {
		        	System.out.println(allfiles);
    			}
			}
	}
}
/*
class Exercise {
     public static void main(String args[])
     {
        File file = new File("/home/students/");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}
*/