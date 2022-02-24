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
        ArrayList<String> list=new ArrayList<>();
        list.add("https://something.com");
        list.add("some-page.html");
        assertEquals(list,MarkdownParse.getLinks(fileContents));
    
    }
    @Test
    public void testMethod2() throws IOException{
        String fileName="test-file2.md";
        Path filePath=Path.of(fileName);
        String fileContents=Files.readString(filePath);
        ArrayList<String> list=new ArrayList<>();
        list.add("https://something.com");
        assertEquals(list,MarkdownParse.getLinks(fileContents));
    
    }

    @Test
    public void testMethod3() throws IOException{
        String fileName="test-file3.md";
        Path filePath=Path.of(fileName);
        String fileContents=Files.readString(filePath);
        ArrayList<String> list=new ArrayList<>();
        list.add("https://something.com");
        assertEquals(list,MarkdownParse.getLinks(fileContents));
    
    }

    @Test
    public void testMethod4() throws IOException{
        String fileName="test-file4.md";
        Path filePath=Path.of(fileName);
        String fileContents=Files.readString(filePath);
        ArrayList<String> list=new ArrayList<>();
        list.add("https://something.com");
        list.add("another.html");
        assertEquals(list,MarkdownParse.getLinks(fileContents));
    
    }

    @Test
    public void testFirstSnippet() throws IOException{
        String fileName="test-snippet1.md";
        Path filePath=Path.of(fileName);
        String fileContents=Files.readString(filePath);
        ArrayList<String> list=new ArrayList<>();
        list.add("`google.com");
        assertEquals(list,MarkdownParse.getLinks(fileContents));
    }

    @Test
    public void testSecondSnippet() throws IOException{
        String fileName="test-snippet2.md";
        Path filePath=Path.of(fileName);
        String fileContents=Files.readString(filePath);
        ArrayList<String> list=new ArrayList<>();
        list.add("a.com");
        list.add("a.com(())");
        list.add("example.com");
        assertEquals(list,MarkdownParse.getLinks(fileContents));
    }

    @Test
    public void testThirdSnippet() throws IOException{
        String fileName="test-snippet3.md";
        Path filePath=Path.of(fileName);
        String fileContents=Files.readString(filePath);
        ArrayList<String> list=new ArrayList<>();
        list.add("https://ucsd-cse15l-w22.github.io/");
        assertEquals(list,MarkdownParse.getLinks(fileContents));
    }

}  

