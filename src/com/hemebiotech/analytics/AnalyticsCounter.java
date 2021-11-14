package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	final ReadSymptomDataFromFile ReadSymptomDataFromFile = new ReadSymptomDataFromFile(
			"C:/Users  /symptoms.txt       ");

	static List<String> list = new ArrayList<String>();
	static Map<String, Integer> map = new HashMap<String, Integer>();

	private static final int Integer = 0;
	private static int headacheCount = 0; // initialize to 0Project02Eclipse
	private static int rashCount = 0; // initialize to 0
	private static int pupilCount = 0; // initialize to 0
	private static int countEachWord;

	private static Object reader;

	private static Object getSymptoms;

	private static OutputStreamWriter writer;

	public static void main(String[] args) throws Exception {

		Map<String, Integer> words = new HashMap<String, Integer>();

		// appel la fonction countEachWords

		// count EachWord("symptoms.txt", words);

		AnalyticsCounter counter = new AnalyticsCounter();

		// créer a TreeMap
		Map<String, Integer> sortedWords = new TreeMap<>(words);

		// sortir la map
		sortedWords.entrySet().forEach(System.out::println);

//Determine the path

		Path path = Paths.get("text.txt");
		String texte = "hello world";

		try {
			Files.write(path, texte.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE,
					StandardOpenOption.APPEND);

		} catch (IOException e) {

			System.out.println("Files does not exist");
			// e.printStackTRace();
		}

		// Read Files

		AnalyticsCounter.readFile("symptoms.txt");

		// first get input
		BufferedReader Reader = new BufferedReader(new FileReader("symptoms.txt"));

		String line = new String();

		int i = 0; // set i to 0

		int headCount = 0; // counts headaches

		while (line != null) {

			i++; // increment i

			System.out.println("symptom from file: " + line);

			if (line.equals("headache")) {

				headCount++;
				System.out.println("number of headaches: " + headCount);

			} else if (line.equals("rash")) {

				rashCount++;
			} else if (line.contains("pupils")) {
				pupilCount++;
			}

			int readLine = ((Reader) reader).read(); // get another symptom
		}

		// next generate output

		FileWriter writer = new FileWriter("result.out");

		writer.write("headache: " + headacheCount + "\n");

		writer.write("rash: " + rashCount + "\n");

		writer.write("dialated pupils: " + pupilCount + "\n");

		writer.close();
	}

	private static void readFile(String string) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the countEachWord
	 */
	public static int getCountEachWord() {
		return countEachWord;
	}

	/**
	 * @param countEachWord the countEachWord to set
	 */
	public static void setCountEachWord(int countEachWord) {
		AnalyticsCounter.countEachWord = countEachWord;
	}

	/**
	 * @return the integer
	 */
	public static int getInteger() {
		return Integer;
	}

}