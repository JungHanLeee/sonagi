package sonagi;

import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

abstract public class Word {
	public ArrayList<String> arr=new ArrayList<>();
	abstract void create();
	abstract void shuffle();
}
class WordData extends Word{
	public void create() {
		try {
			Scanner inputStream=new Scanner(
					new File("C:\\Users\\dlwjd\\eclipse-workspace\\sonagi\\src\\sonagi\\word.txt"));
			
			while(inputStream.hasNextLine())
				this.arr.add(inputStream.nextLine());
			
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}

	@Override
	void shuffle() {
		Collections.shuffle(this.arr);
	}
}
