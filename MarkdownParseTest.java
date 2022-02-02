import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testMethod1() throws IOException{
        String fileName="test-file.md";
        Path filePath=Path.of(fileName);
        String fileContents=Files.readString(filePath);
        ArrayList<String> list1=new ArrayList<>();
        list1.add("https://something.com");
        list1.add("some-page.html");
        assertEquals(list1,MarkdownParse.getLinks(fileContents));
    
    }
    @Test
    public void testMethod2() throws IOException{
        String fileName="test-file2.md";
        Path filePath=Path.of(fileName);
        String fileContents=Files.readString(filePath);
        ArrayList<String> list2=new ArrayList<>();
        list2.add("https://something.com");
        assertEquals(list2,MarkdownParse.getLinks(fileContents));
    
    }

    @Test
    public void testMethod3() throws IOException{
        String fileName="test-file3.md";
        Path filePath=Path.of(fileName);
        String fileContents=Files.readString(filePath);
        ArrayList<String> list3=new ArrayList<>();
        list3.add("https://something.com");
        assertEquals(list3,MarkdownParse.getLinks(fileContents));
    
    }

    @Test
    public void testMethod4() throws IOException{
        String fileName="test-file4.md";
        Path filePath=Path.of(fileName);
        String fileContents=Files.readString(filePath);
        ArrayList<String> list4=new ArrayList<>();
        list4.add("https://something.com");
        list4.add("another.html");
        assertEquals(list4,MarkdownParse.getLinks(fileContents));
    
    }
}  

