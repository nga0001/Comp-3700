public class Finder {


   public static Integer findMax(int[] intArray) {
       int currentMax;
       int finalMax;
       if (intArray.length == 0) {
           return null;
       }
       else {
           currentMax = intArray[0];

           for (int i = 0; i < intArray.length; i++) {
               if (intArray[i] > currentMax) {
                   currentMax = intArray[i];
               }
           }
       }

       finalMax = currentMax;
       return finalMax;
   }

    public static Integer findMin(int[] intArray) {
        int currentMin;
        int finalMin;
        if (intArray.length == 0) {
            return null;
        }
        else {
            currentMin = intArray[0];

            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] < currentMin) {
                    currentMin = intArray[i];
                }
            }
        }

        finalMin = currentMin;
        return finalMin;
    }


}
