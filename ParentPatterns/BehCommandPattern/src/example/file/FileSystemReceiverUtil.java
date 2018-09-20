package example.file;

import example.file.receiver.FileSystemReceiver;
import example.file.receiver.UnixFileSystemReceiver;
import example.file.receiver.WindowsFileSystemReceiver;

public class FileSystemReceiverUtil {
	public static FileSystemReceiver getUnderlyingFileSystem() {
		String osName = System.getProperty("os.name");
		System.out.println("Underlying OS is:" + osName);
		if (osName.contains("Windows")) {
			return new WindowsFileSystemReceiver();
		} else {
			return new UnixFileSystemReceiver();
		}
	}
}
