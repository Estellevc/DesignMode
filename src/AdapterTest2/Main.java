package AdapterTest2;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileIO f = new FileProperties();
		try {
			f.readFromFile("D:\\code\\javaweb-workplace\\DesignMode\\src\\AdapterTest2\\file.txt");
			f.setValue("year", "2019");
			f.setValue("month", "11");
			f.setValue("day", "28");
			f.writeToFile("D:\\code\\javaweb-workplace\\DesignMode\\src\\AdapterTest2\\newfile.txt");
			System.out.println("done");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
