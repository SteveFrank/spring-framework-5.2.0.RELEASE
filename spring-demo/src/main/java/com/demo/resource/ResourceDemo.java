package com.demo.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.*;

/**
 * @author yangqian
 * @date 2021/1/11
 */
public class ResourceDemo {

	public static void main(String[] args) throws IOException {
		FileSystemResource fileSystemResource = new FileSystemResource(
				"/Users/qian/WorkSpaces/own-workspace/2021/spring/spring-framework-5.2.0.RELEASE/spring-demo/src/main/java/com/demo/resource/test.txt"
		);
		File file = fileSystemResource.getFile();
		System.out.println(file.length());
		OutputStream outputStream =  fileSystemResource.getOutputStream();
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
		bufferedWriter.write("Hello World");
		bufferedWriter.flush();
		outputStream.close();
		bufferedWriter.close();
	}

}
