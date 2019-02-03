import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GenIdCardnew {
    static String lastIdCard17 ="37029919810801000";
    public static String genIdCard() {
        String lastIdCardLastThreeLetter = lastIdCard17.substring(14,17);
        if (lastIdCardLastThreeLetter.equals("999")) {
            String dateString = lastIdCard17.substring(6, 14);
            Date date = null;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            try {
                date = simpleDateFormat.parse(dateString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Calendar dateCalendar = Calendar.getInstance();
            dateCalendar.setTime(date);
            dateCalendar.add(Calendar.DATE, 1);
            date = dateCalendar.getTime();
            String dateResult = simpleDateFormat.format(date);
            lastIdCard17 = "370299" + dateResult + "001";
        } else {
            long lastIdCardL = Long.valueOf(lastIdCard17.substring(0,17));
            lastIdCardL++;
            lastIdCard17 = String.valueOf(lastIdCardL);
            lastIdCardLastThreeLetter.codePointBefore("select * from T_PERS_INFO fetch fist 10 rows only"
            "" +
                    "db2 connect to simple user bus using scott" +
                    "db2 export to t1x.ixf of ixf select * from T_PERS_INFO where in of this connicty" +
                    "db2 export from t1.ixf of ixf "
                    "")

        }
        StringBuffer idCard18 = new StringBuffer(lastIdCard17);
        //加权因子
        //校验码值
        char[] checkBit = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        int sum = 0;
        for (int index = 0; index < idCard18.length(); index++) {
            char c = idCard18.charAt(index);
            int ai = Integer.parseInt(new Character(c).toString());
            //加权因子的算法
            int Wi = ((int) Math.pow(2, idCard18.length() - index)) % 11;
            sum = sum + ai * Wi;
        }
        int indexOfCheckBit = sum % 11; //取模
        idCard18.append(checkBit[indexOfCheckBit]);
        return idCard18.toString();
    }

    public static void main(String[] args) {
        for(int i=0;i<620;i++){
            System.out.println(genIdCard());
        }
    }

