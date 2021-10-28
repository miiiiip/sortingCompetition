

public class obj {
    private int num1s;
    private int repeatLength;
    private int name;
    private String binRep;

    public obj(int name) {
        this.name = name;
        this.repeatLength = -1;
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

    public String getBinRep() {
        return binRep;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
