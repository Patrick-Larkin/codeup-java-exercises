
/*================== Absolute vs Relative Paths ==================
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
*/
public class FileIOLecture {
	/*
		- A file is a discrete container for data on a storage device
		- A path is the location of a file in a filesystem


================== Absolute vs Relative Paths ==================
	Paths consist of directory names, separated by /s. In addition there are several special characters in paths:
		/: when a path starts with /, it refers to the filesystem root, otherwise it is used to separate directories in a path
		.: current directory
		..: parent directory
		There are two types of paths:

	Absolute paths: specified from the filesystem root
		example:  /Users/codeup/IdeaProjects/java-exercises/data/data.txt
	Relative paths: relative to the current working directory
	  example:  ../../Documents/important-stuff.txt

	Will always refer to the same location, regardless of where the current working directory is.


================== Working With Files ==================
	The Java standard library contains many different classes for working with paths and files, located in the java.io and java.nio packages.
Paths
	The Path Interface
		- Defines an object that represents a filepath
		- Many file operations will expect to be passed an argument of type Path
		- Abstracts away differences between different filesystem paths (Windows vs MacOS)

	Paths class
		- Contains static methods for obtaining file paths
		- Can be used to obtain objects that implement Path

Files
	File class
		- Object that represents a file

	Files class
		- Contains static methods for manipulating files


================== Common Path and File Methods ==================
	Return a Path the corresponds to the passed string, or multiple strings representing directories and files
		Path Paths.get(String filename)
		Path Paths.get(String directory, String filename)
		Path Paths.get(String parentDir, String childDir, String filename)

	Tests for the existence of a file or directory
		boolean Files.exists(Path filepath)       |      .exists returns true if the given path exists
		boolean Files.notExists(Path filepath)    |      .notExists returns true if the given path does not exist.

	Create an empty file at the specified path
		Path Files.createFile(Path path)

	Create a directory or multiple specified directories if necessary
		Path Files.createDirectories(Path path)


	In Action:
*/
//	public static void main(String[] args) {
//		String directory = "data";
//		String filename = "info.txt";
//
//		Path dataDirectory = Paths.get(directory);
//		Path dataFile = Paths.get(directory, filename);
//					/*Importante: Notice that we pass multiple arguments to Paths.get. This way we can just specify the directory name and not the directory separator, which is different for different operating systems.
//					If you are writing code that needs to work cross-platform, be sure to pass each directory name as a separate string argument.
//					*/
//
//		if (Files.notExists(dataDirectory)) {
//			Files.createDirectories(dataDirectory);
//		}
//
//		if (!Files.exists(dataFile)) {
//			Files.createFile(dataFile);
//		}
	/*This will create the directory data in the current working directory, and, within that directory, create a file named info.txt.


	================== Writing a File ==================
		Write a list of strings to a file
			Path Files.write(Path filepath, List<String> lines[, StandardOpenOption option])
				- Each string in the lines parameter will become one line in the file
				- Default is to overwrite the existing file (or create a new one)
				- The last argument is optional
				- StandardOpenOption.APPEND can be used as the last argument to add to an existing file

		Here's how we would create a list and write its contents to a file:
			List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");	//This code uses the .asList static method of the Arrays class, which returns a new List created from the arguments passed to it.

			Path filepath = Paths.get("data", "groceries.txt");
			Files.write(filepath, groceryList);


	Add a line to an existing file:
		Files.write(
			Paths.get("data", "groceries.txt"),
			Arrays.asList("eggs"), // list with one item
			StandardOpenOption.APPEND
		);


	Replace "milk" with "cream":
		List<String> lines = Files.readAllLines(Paths.get("data", "groceries.txt"));
		List<String> newList = new ArrayList<>();

		for (String line : lines) {
			if (line.equals("milk")) {
		    newList.add("cream");
		    continue;
		  }
			newList.add(line);
		}

		Files.write(Paths.get("data", "groceries.txt"), newList);


	================== Reading a File ==================
		Read the contents of a file
			List<String> Files.readAllLines(Path filepath)
				- Transforms each line in the file into a string
				- Each element of the returned list is a string (one line from the file)

	 Print out each line in an existing file, along with the line number
		Path groceriesPath = Paths.get("data", "groceries.txt");
		List<String> groceryList = Files.readAllLines(groceriesPath);

		for (int i = 0; i < groceriesList.size(); i += 1) {
			System.out.println((i +1) + ": " + groceryList.get(i));
		}

		================== Further Reading ==================
		I/O Streams       https://docs.oracle.com/javase/tutorial/essential/io/streams.html
	 */
//	}


}
