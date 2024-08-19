// josh/willis/processing/GTFSProcessor.java
package josh.willis.processing;

public abstract class GTFSProcessor {
    public final void processData(String filePath) {
        readData(filePath);
        parseData();
        processResults();
    }

    protected abstract void readData(String filePath);
    protected abstract void parseData();
    protected abstract void processResults();
}