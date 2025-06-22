import java.awt.Desktop;
import java.io.File;

// Step 1: Document Interface
interface Document {
    void open();
}

// Step 2: Concrete Word Document Class
class WordDocument implements Document {
    public void open() {
        openFile("SingletonPatternExample.docx");  
    }

    private void openFile(String filename) {
        try {
            File file = new File(filename);
            if (file.exists()) {
                Desktop.getDesktop().open(file);
                System.out.println("Opening Word document...");
            } else {
                System.out.println("Word file not found: " + filename);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Step 3: Abstract Factory
abstract class DocumentFactory {
    public abstract Document createDocument();
}

// Step 4: Concrete Factory for Word
class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

// Step 5: Test the Factory Method
public class FactoryMethodPattern {
    public static void main(String[] args) {
        DocumentFactory factory = new WordFactory();
        Document wordDoc = factory.createDocument();
        wordDoc.open();  
    }
}
