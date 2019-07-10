// Write a Java program to check file is readable or not.
import java.io.*;
class demo{
	public static void main(String[] args) {
		File f1=new File("1.java");
		System.out.print(f1.canRead() ? "file is readable" : "file is not readable");
	}
}