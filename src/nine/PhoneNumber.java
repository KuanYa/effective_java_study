package nine;

public class PhoneNumber {

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;
    private volatile int hashCode;
    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode,999,"area code");
        rangeCheck(prefix,999,"prefix");
        rangeCheck(lineNumber,9999,"line number");
        this.areaCode = (short)areaCode;
        this.prefix = (short)prefix;
        this.lineNumber = (short)lineNumber;
    }

    private static void rangeCheck(int arg, int max, String name) {
        if (arg < 0 || arg > max) {
            throw new IllegalArgumentException(name + ":" + arg);
        }
    }

    /**
     * 覆盖equals 方法
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o){
        if (o == this) {
            return true;
        }
        if(!(o instanceof PhoneNumber)){
            return false;
        }
        PhoneNumber pn = (PhoneNumber)o;
        return pn.lineNumber == lineNumber && pn.prefix == prefix && pn.areaCode == areaCode;
    }

    /**
     * 覆盖 hashCode
     */
    @Override
    public int hashCode() {
        int result = hashCode;
        if(result==0) {
            result = 31 * result + areaCode;
            result = 31 * result + prefix;
            result = 31 * result + lineNumber;
            hashCode = result;
        }
        return result;
    }

    /**
     * 第10条中的建议,覆盖toString 方法
     */
    @Override
    public String toString(){
        return String.format("(%03d) %03d-%04d",areaCode,prefix,lineNumber);
    }
}
