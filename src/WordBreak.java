import java.util.*;
import java.io.*;

public class WordBreak {
    public boolean wordBreak(String s, ArrayList<String> wordDict) {
        
        for(int i = 0; i<wordDict.size(); i++)
        {
            String sub = "";
            for(int j = 0; j<wordDict.size(); j++)
            {
                sub = sub + wordDict.get(j);
                if(sub.length() > s.length())
                {
                    break;
                }
                else
                {
                    if(sub.equals(s))
                    {
                        return true;
                    }
                }
            }
            sub = ""; // reset sub;
        }

        return false;
    }
}
