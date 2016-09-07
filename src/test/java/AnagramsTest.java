import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;


public class AnagramsTest {
  @Test
  public void runAnagrams_checkSingleWord_AnagramList1() {
    Anagrams tester = new Anagrams("cat act");
    List<String> checker = new ArrayList<String>();
    checker.add("cat");
    checker.add("act");
    assertEquals(checker, tester.runAnagrams());
  }

  @Test
  public void runAnagrams_checkSingleWord_AnagramList2() {
    Anagrams tester = new Anagrams("this cat is an act");
    List<String> checker = new ArrayList<String>();
    checker.add("cat");
    checker.add("act");
    assertEquals(checker, tester.runAnagrams());
  }
}
