package AdapterTest2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties  implements FileIO{
	private Properties list = new Properties();
	
	@Override
	public void readFromFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		list.load(new FileInputStream(filename));
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		list.store(new FileOutputStream(filename), "written by FileProperties");
	}

	@Override
	public void setValue(String key, String value) {
		// TODO Auto-generated method stub
		this.list.setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		// TODO Auto-generated method stub
		return this.list.getProperty(key);
	}
	

}
