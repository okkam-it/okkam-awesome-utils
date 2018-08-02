package org.okkam.awesome.utils;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author simone
 *
 */
public class CsvParsingUtils {

  private CsvParsingUtils() {
    throw new IllegalStateException("Utility class");
  }


  /**
   * Parse a CSV
   * 
   * @param filePath The path to the file
   * @param delimiter The delimiter
   * @param quote The string quote
   * @return An iterable collection
   * @throws IOException If the input does not exists
   */
  public static Iterable<CSVRecord> parseFile(String filePath, char delimiter, char quote)
      throws IOException {
    try (Reader in = new FileReader(filePath);) {
      return CSVFormat.DEFAULT.withDelimiter(delimiter).withQuote(quote).parse(in);
    }
  }
}
