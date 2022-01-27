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
    public void testGetLinks() throws IOException{
        String fileName="test-file.md";
        Path filePath=Path.of(fileName);
        String fileContents=Files.readString(filePath);
        ArrayList<String> list1=new ArrayList<>();
        list1.add("https://something.com");
        list1.add("some-page.html");
        assertEquals(list1,MarkdownParse.getLinks(fileContents));
    
    }
}  

