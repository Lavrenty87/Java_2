package Lassons_2;

import java.util.Random;

public class Lesson_2_HomeWork {
    public static void main(String[] args) throws MyArraySizeException {
        int sum = 0;
        Random random = new Random();
        String[][] goodArray = new String[4][4];
        for (int i = 0; i < goodArray.length; i++) {
            for (int j = 0; j < goodArray[i].length; j++) {
                goodArray[i][j] = String.valueOf(random.nextInt(50));
            }
        }
      //  goodArray[1][2] = "asf";
        try {
//            sum = sumArry(null);
            sum = sumArry(goodArray);
        } catch (MyArraySizeException r) {
            r.printStackTrace();
        } catch (MyArrayDataException r) {
            r.printStackTrace();
        }
        System.out.println(sum);
    }

    public static int sumArry(String[][] gArray) {
        int sum = 0;
        try {                                          // Первая проветка на nuii
            if (gArray != null)                                                    // как правильнее проверять?
             if (gArray.length != 4 || gArray == null) throw new MyArraySizeException();{// || gArray == null вторая проверка
                 for (int i = 0; i < gArray.length; i++) {
                    if (gArray[i].length != 4) throw new MyArraySizeException();{
                        for (int j = 0; j < gArray[i].length; j++) {
                            try {
                                sum += Integer.parseInt(gArray[i][j]);
                            } catch (NumberFormatException e) {
                                throw new MyArrayDataException(i, j);
                            }
                        }
                    }
                }
            }
       }catch (NullPointerException r){
            r.printStackTrace();
            r.getMessage();
        }

        return sum;
    }
}
