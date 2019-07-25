package twelve;

public  final  class CaseInsensitiveString implements Comparable<CaseInsensitiveString>{

    private final String s;

    public CaseInsensitiveString(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        this.s = s;
    }
    @Override
    public boolean equals(Object o){
        boolean flag = true;
        if(o instanceof CaseInsensitiveString) {
            flag =  s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }
        if(o instanceof String) {
            flag =  s.equalsIgnoreCase((String) o);
        }
        return flag;
    }

    /**
     * 编写自己的comparator
     * @param o
     * @return
     */
    @Override
    public int compareTo(CaseInsensitiveString o) {
        return String.CASE_INSENSITIVE_ORDER.compare(s,o.s);
    }
}
