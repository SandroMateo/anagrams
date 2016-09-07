import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Anagrams {

  private String mUserSentence;
  private String[] mUserWords;
  private List<String> mAnagramList = new ArrayList<String>();

  public Anagrams(String sentence) {
    mUserSentence = sentence;
  }

  public List<String> runAnagrams(){
    mUserWords = mUserSentence.split(" ");
    for(int j = 0; j < mUserWords.length; j++) {
      String[] letterArray1 = mUserWords[j].split("");
      List<String> characterList1 = new ArrayList<String>(Arrays.asList(letterArray1));
      Collections.sort(characterList1);
      for(int i = 0; i < mUserWords.length ; i ++) {
        String[] letterArray2 = mUserWords[i].split("");
        List<String> characterList2 = new ArrayList<String>(Arrays.asList(letterArray2));
        Collections.sort(characterList2);
        if(characterList1.equals(characterList2) && (i != j)) {
          mAnagramList.add(mUserWords[j]);
        }
      }
    }
    return mAnagramList;
  }
}
