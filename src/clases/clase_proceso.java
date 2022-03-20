package clases;

public class clase_proceso {

    public String proceso(int a, int b, int c) {
        String res = "";
        //int a,b,c;
        /*a=3;
       b=2;
       c=4;*/
        int[] array_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array_2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array_1.length; i++) {
            for (int j = 0; j < array_2.length; j++) {
                if (array_2[j] - array_1[i] == b) {
                    res += "Resta " + (array_2[j] - array_1[i]);
                    if (array_2[j] * array_1[i] == c) {
                        res +="\nmulti " + (array_2[j] * array_1[i]);
                      // return res;
                    }
                  //return res;
                }
               //return res;
            }
            return res;
        }
        return null;
    }

    public static void main(String[] args) {
        clase_proceso c = new clase_proceso();
        System.out.println(  c.proceso(3, 2, 4));
    }
}
