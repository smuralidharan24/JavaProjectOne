package FilesHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		Path fileLocationToWrite = Paths.get("./resources/FileWrite.txt");

		List<String> list = List.of("Apple", "Bat", "Cat", "Dog", "Elephant");
		Files.write(fileLocationToWrite, list);

	}

}
