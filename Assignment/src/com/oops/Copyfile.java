package com.oops;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Copyfile {

	public static void main(String[] args) {
		Path sourceFile=Paths.get("abc.txt");
		Path targetFile=Paths.get("myfile.txt");
	try {
		Files.copy(sourceFile,targetFile,StandardCopyOption .REPLACE_EXISTING);
		System.out.println("done");
	}
	catch(IOException ex) {
		System.err.format("I/o error copingfile");
	}

}
}
