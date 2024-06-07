public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    public boolean arrayStringsAreEqual(String[] arr1, String[] arr2) {

        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        for(String s: arr1){
            sb1.append(s);
        }

        for (String s: arr2){
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());

    }
}
