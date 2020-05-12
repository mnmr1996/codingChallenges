public class codingChallenges {
    public static void main(String[] args) {
        //System.out.print("hello");
        String k = "HELLO";
        String l = "HELlo";
        System.out.println(isUnique(k));
        System.out.println(isUnique(l));
    }

//cracking the coding interview
    public static boolean isUnique(String S){
        int[] array = new int[256];
        for(int i=0; i < S.length(); i++){
            if(array[(int)S.charAt(i)] == 1){
                return false;
            }
            else{
                array[(int)S.charAt(i)] = 1;
            }
        }
        return true;
    }
}
