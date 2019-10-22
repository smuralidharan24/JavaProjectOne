package FilesHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		Path fileLocation = Paths.get("./resources/Data.txt");
		Files.lines(fileLocation).forEach(System.out::println);

		Files.lines(fileLocation).map(String::toUpperCase).forEach(System.out::println);

		Files.lines(fileLocation).filter(element -> element.contains("Name")).forEach(System.out::println);
	}

}
