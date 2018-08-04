
import java.util.*;

/**
 * 第一个测试类
 *
 * @author wanghao
 * @create 2018-07-07 下午2:04
 **/
public class Demo01 {

    public void test(){
        System.out.println("Hello Word");
    }

    public void test2(){
        String str = "3300|3300|3300";
        System.out.println(Arrays.toString(str.split("\\|")));
        System.out.println(str.split("\\|").length);
        str = "3300||3300";
        System.out.println(Arrays.toString(str.split("\\|")));
        System.out.println(str.split("\\|").length);

        str = "|3300|3300";
        System.out.println(Arrays.toString(str.split("\\|")));
        System.out.println(str.split("\\|").length);

        str = "3300|3300|";
        System.out.println(Arrays.toString(str.split("\\|")));
        System.out.println(str.split("\\|").length);

        str = "3300||";
        System.out.println(Arrays.toString(str.split("\\|")));
        System.out.println(str.split("\\|").length);
    }
    public void test3(){
        //CMREAD_iPhone_Appstore_\d+\*\d+_V6.1.*
        //CMREAD_iPhone_Appstore_91_V6.0.0_160709
        String str = "CMREAD_iPhone_Appstore_91_V6.1.0_160709";
        System.out.println(str.matches("CMREAD_iPhone_Appstore_\\d+_V6.1.*"));
    }
    public void test4(){
//        String gType = "10";
        for (int i = 0; i < 15; i++) {
            String gType = String.valueOf(i);
            System.out.println(gType.matches("[1-9]|10")+ "~~~~"+i);
        }

    }
    public void test5(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("7");
        list.add("9");
        list.add("3");
        list.add("4");
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list.removeAll(list2);
        Collections.sort(list);

        for (String str :
                list) {
            System.out.println(str);
        }

    }
    public void test6(){
        String regex = "[1238]";
        String e_value = "1,2,3,8";
        for (int i = 0; i < 10; i++) {
            System.out.println(String.valueOf(i).matches(regex));
        }

        System.out.println("1238".matches(regex));

    }

    public void test7(){
        String VERSION_ENUM = "1|2|1\\,2";
        String e_value = "1,2,3,8";
        System.out.println("1".matches(VERSION_ENUM));
        System.out.println("2".matches(VERSION_ENUM));
        System.out.println("1,2".matches(VERSION_ENUM));
        System.out.println("1,2".matches(VERSION_ENUM));
        System.out.println(",2".matches(VERSION_ENUM));
        System.out.println(",".matches(VERSION_ENUM));

    }
        public static char[] charSet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        public static void main(String[] args) {

            List<String> userAddPreferences = new ArrayList<>();
            if ((null == userAddPreferences) || (userAddPreferences.isEmpty()))
            {
                System.out.println(true);
            }else{
                System.out.println(false);

            }





//
//            String msisdn = "";
//            msisdn = "13003690767";
//            System.out.println("原msisdn："+msisdn);
//            msisdn = Demo01.encryptMsisdn(msisdn);
//            System.out.println("加密后msisdn："+msisdn);
//            msisdn = Demo01.decodeMsisdn(msisdn);
//            System.out.println("解密后msisdn："+msisdn);
        }
        //62进制转换成10进制
        public static String _62_to_10(String sixty_str,int length){
            int multiple=1;
            long resultnumber=0;
            Character c;
            for(int i=0;i<sixty_str.length();i++){
                c=sixty_str.charAt(sixty_str.length()-i-1);
                resultnumber+=_62_value(c)*multiple;
                multiple=multiple*62;
            }
            String result = new String();
            result = String.valueOf(resultnumber);
            int result_length = result.length();
            for (int i = 0; i < length - result_length; i++) {
                result = "0"+result;
            }

            return result;
        }

        private static int _62_value(Character c){
            for(int i=0;i<charSet.length;i++){
                if(c==charSet[i]){
                    return i;
                }
            }
            return -1;
        }
        //10进制转换成62进制
        public static String encryption(long number, int length) {
            Long rest = number;
            Stack<Character> stack = new Stack<Character>();
            StringBuilder result = new StringBuilder(0);
            while (rest != 0) {
                stack.add(charSet[new Long((rest - (rest / 62) * 62)).intValue()]);
                rest = rest / 62;
            }
            for (; !stack.isEmpty();) {
                result.append(stack.pop());
            }
            int result_length = result.length();
            StringBuilder temp0 = new StringBuilder();
            for (int i = 0; i < length - result_length; i++) {
                temp0.append('0');
            }

            return temp0.toString() + result.toString();
        }

        //字符串颠倒顺序
        public static String reverseStr(String str){
            char[] c = str.toCharArray();
            StringBuffer sb=new StringBuffer();
            int length =c.length;
            for(int i=length-1;i>=0;i--){
                sb.append(c[i]);
            }
            return sb.toString();
        }
        //解密
        public static String decodeMsisdn(String msisdn){
            StringBuffer result =new StringBuffer();
            String ml[] = msisdn.split("\\|");

            while(!"".equals(ml[0])){
                result.append(Demo01._62_to_10(ml[0].substring(0, 3), 5));
                ml[0] = ml[0].substring(3);
            }
            result.append(ml[1]);

            return Demo01.reverseStr(result.toString());
        }
        //加密
        public static String encryptMsisdn(String msisdn){
            msisdn = Demo01.reverseStr(msisdn);
            StringBuffer result =new StringBuffer();
            while(msisdn.length()>=5){
                result.append(Demo01.encryption(Long.parseLong(msisdn.substring(0, 5)), 3));
                msisdn=msisdn.substring(5);
            }
            result.append("|").append(msisdn);

            return result.toString();
        }


    public void test8(){
        System.out.println(fun(100));

    }

    public static long fun(int n){
        if (n <= 1){
            return 1;
        }else{
            return fun(n-1) + n;
        }
    }



}
