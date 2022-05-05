import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringProcessorTest {

    //N>0
    @org.junit.jupiter.api.Test
    void String_1_test_1() {
        String actual = StringProcessor.String_1("abc", 3);
        String expected = "abcabcabc";
        assertEquals(expected, actual);
    }

    //N=0
    @org.junit.jupiter.api.Test
    void String_1_test_2() {
        String actual = StringProcessor.String_1("abc", 0);
        String expected = "";
        assertEquals(expected, actual);
    }

    //N<0
    @org.junit.jupiter.api.Test
    void String_1_test_3() {
        try {
            StringProcessor.String_1("abc",-1);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    //Вторая строка входит в первую 3 раза.
    @org.junit.jupiter.api.Test
    void String_2_test_1() {
        int actual = StringProcessor.String_2("abcabcabc", "abc");
        int expected = 3;
        assertEquals(expected, actual);
    }

    //Вторая строка входит в первую 0 раз.
    @org.junit.jupiter.api.Test
    void String_2_test_2() {
        int actual = StringProcessor.String_2("", "abc");
        int expected = 0;
        assertEquals(actual, expected);
    }

    //Срабатывает исключение с сообщением: "Вторая строка str2 пустая или null, сработало исключение.".
    @org.junit.jupiter.api.Test
    void String_2_test_3() throws Exception {
        try {
            StringProcessor.String_2("abc","");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    void String_3_test(){
        String actual = StringProcessor.String_3("123123");
        String expected = "одиндватриодиндватри";
        assertEquals(actual, expected);
    }

    //метод String_4 для четного числа символов - 10
    @org.junit.jupiter.api.Test
    void String_4_test_1(){
        StringBuilder actual = new StringBuilder("HelloWorld");
        StringProcessor.String_4(actual);
        StringBuilder expected = new StringBuilder("Hlool");

        boolean res_actual = false, res_expected = true;
        for (int i=1; i<actual.length(); i++) {
            if (actual.charAt(i)==expected.charAt(i)) {
                res_actual = true;
            }
        }
        assertTrue(res_actual);
    }

    //метод String_4 для нечетного числа символов - 11
    @org.junit.jupiter.api.Test
    void String_4_test_2(){
        StringBuilder actual = new StringBuilder("HelloWorld!");
        StringProcessor.String_4(actual);
        StringBuilder expected = new StringBuilder("Hlool!");

        boolean res_actual = false, res_expected = true;
        for (int i=1; i<actual.length(); i++) {
            if (actual.charAt(i)==expected.charAt(i)) {
                res_actual = true;
            }
        }
        assertTrue(res_actual);
    }
}
