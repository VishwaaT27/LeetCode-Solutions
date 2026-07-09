class Solution 
{
    public char findTheDifference(String s, String t) 
    {
        List<Character> s1 = s.chars().mapToObj(e -> (char) e).toList();
        List<Character> t1 = t.chars().mapToObj(e -> (char) e).toList();        
        List<Character> c = new ArrayList<>(t1);
        for (Character ch : s1)
            c.remove(ch); 
        char ch = c.get(0);
        return ch;
    }
}
