// Write a Java program to check whether file is writable or not.
import java.io.*;
class demo{
	public static void main(String[] args) {
		File f1=new File("1.java");
		System.out.print(f1.canWrite() ? "file is writable" : "file isn't writable");
	}
}