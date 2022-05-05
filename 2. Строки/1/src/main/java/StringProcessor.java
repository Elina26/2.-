public class StringProcessor {
    /*На входе строка s и целое число N. Выход - строка, состоящая из N копий строки s, записанных
    подряд. При N=0 результат - пустая строка. При N<0 выбрасывается исключение.*/
    public static String String_1(String s, int N) {
        String result = "";
        try{
            if(N<0) {
                throw new Exception();
            }
            else {
                for (int i=0; i<N; i++) {
                    result += s;
                }
            }
        }
        catch(Exception ex){
            System.out.println("N<0, сработало исключение.");
        }
        return result;
    }


    /*На входе две строки. Результат - количество вхождений второй строки в первую.
    * Если вторая строка пустая или null выбросить исключение.*/
    public static int String_2(String str1, String str2) {
        int count = 0;
        try {
            if (str2.isEmpty() || str2.equals(null)){
                throw new Exception();
            }
            else {
                count = (str1.length() - str1.replace(str2, "").length()) / str2.length();
            }
        }
        catch(Exception ex){
            System.out.println("Вторая строка str2 пустая или null, сработало исключение.");
        }
        return count;
    }


    /*Постройте по строке новую строку, которая получена из исходной заменой каждого символа "1" на
    подстроку "один", символа "2" на подстроку "два" и символа "3" на подстроку "три".*/
    public static String String_3(String str) {
        String result; String s;
        result = str.replace("1", "один");
        result = result.replace("2", "два");
        result = result.replace("3", "три");
        return result;
    }


    /*В строке типа StringBuilder удалите каждый второй по счету символ. Должна быть модифицирована
    * входная строка, а не порождена новая.*/
    public static StringBuilder String_4(StringBuilder str){
        for (int i=1; i<str.length(); i++) {
            str.deleteCharAt(i);
        }
        return str;
    }
}