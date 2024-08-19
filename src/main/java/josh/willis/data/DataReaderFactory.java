package josh.willis.data;

public class DataReaderFactory {
    public static DataReader createReader(String type) {
        if (type.equalsIgnoreCase("CSV")) {
            return new CSVReader();
        }
        else if (type.equalsIgnoreCase("JSON")) {
            return new JSONReader();
        }
        else if (type.equalsIgnoreCase("TXT")) {
            return new TXTReader();
        }
        // Add more types if needed
        return null;
    }
}
