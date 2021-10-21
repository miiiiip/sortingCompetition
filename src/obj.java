

public class obj {
    private int num1s;
    private int repeatLength;
    private int name;
    private String binRep;

    public obj(int name) {
        this.name = name;
    }

    public void setNum1s() {
        this.binRep = Integer.toBinaryString(this.name);
        this.num1s = Helper.numBinaryOnes(this.binRep);
    }

    public int getNum1s() {
        return num1s;
    }

    public int getRepeatLength() {
        return repeatLength;
    }

    public void setRepeatLength(int repeatLength) {

        this.repeatLength = Helper.lengthLongestRepeatedSubstring(this.binRep);
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public obj[] toArray(int[] a){
        int len = a.length;
        obj[] objArr = new obj[len];
        for (int i = 0; i < a.length; i++) {
            obj Integer.toString(i) = new obj;
            objArr[i] = ;
            setName(objArr[]);
        }
    }



}
