public class ConditionalActions {

//    public static void main(String[] args) {
//        System.out.println(conditionalActions(-21));
//    }

    public String conditionalActions (int m){

        if (m != 0){
            if (m % 7 == 0 && m % 9 == 0) {
                return "Good Number";
            }else if (m % 9 == 0) {
                return "Bad Number";
            }else if (m % 11 == 0) {
                return "Poor Number";
            }else {
                return "-1";
            }
        } else {
            return "Zero is always multiple of every number";
        }
    }
}
