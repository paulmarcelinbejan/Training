package com.paulmarcelinbejan.training.designpattern.behavioral.command.example;

public class FileSystemReceiverUtil {

	public static FileSystemReceiver getUnderlyingFileSystem() {
		String osName = System.getProperty("os.name");
		System.out.println("Underlying OS is:" + osName);
		if (osName.contains("Windows")) {
			return new WindowsFileSystemReceiver();
		}
		return new UnixFileSystemReceiver();
	}

}
