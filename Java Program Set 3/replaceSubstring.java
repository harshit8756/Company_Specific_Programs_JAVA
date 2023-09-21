public class replaceSubstring {
    public static void main(String[] args) {
        String original = "Hello World";
        String toReplace = "World";
        String replacement = "Harshit";

        String modified = replaceString(original,toReplace , replacement);
        System.out.println(original);
        System.out.println(modified);
    }
     public static String replaceString(String original , String toReplace , String replacement)
     {
         if(!original.contains(toReplace))
         {
             return original;
         }
         String modified = original.replaceAll(toReplace,replacement);
         return modified;
     }

}
