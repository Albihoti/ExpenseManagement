

public class Anagram {
    static  final int MAX_CHAR = 26;
    public static void main(String[] args) {
        String s1 ="anagram";
        String s2 ="grammari";
        int k=2;
        if(janeAnagram(s1,s2,k))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
    static boolean janeAnagram(String s1, String s2, int k){
        int n=s1.length();
        if(s2.length()!=n)
            return false;
        int[] count1 = new int[MAX_CHAR];
        int [] count2 = new int[MAX_CHAR];
        int count=0;

        for(int i=0; i<n; i++)
            count1[s1.charAt(i)-'a']++;
            for(int i=0; i<n; i++)
                count2[s2.charAt(i)-'a']++;

                for (int i=0; i<MAX_CHAR; i++)
                    if (count1[i] >count2[i])
                        count = count+Math.abs(count1[i]-count2[i]);

                    return (count<=k);
                }

}
