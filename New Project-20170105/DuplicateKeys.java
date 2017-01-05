import java.util.*;

class DuplicateKeys{

     public static void main(String []args){
         String s = new String("this is sparta");
         char[] strArray = s.toCharArray();
         int len = strArray.length;
         /*for (int i = 0;i<len;i++)
         {
            System.out.println(strArray[i] + "@");
         }*/
          Map<Character, Integer> hm = new HashMap<Character, Integer>();
        for(Character ch:strArray)
        {
            if (hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else
            {
                hm.put(ch,1);
            }
        }
        Set<Character> so = hm.keySet();
        for(Character ch:so)
        {
           if(hm.get(ch) > 1)
           {
               System.out.println("Char "+ch+" "+hm.get(ch));
            }
        }
}
}