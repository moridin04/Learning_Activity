import java.util.Arrays;

public class MyStringBuilder2 {
    private char[] value;
    private int length;

    public MyStringBuilder2() {
        this.value = new char[0];
        this.length = 0;
    }

    public MyStringBuilder2(char[] chars) {
        this.value = chars;
        this.length = chars.length;
    }

    public MyStringBuilder2(String s) {
        this.value = s.toCharArray();
        this.length = s.length();
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        char[] newValue = new char[length + s.length];
        System.arraycopy(value, 0, newValue, 0, offset);
        System.arraycopy(s.value, 0, newValue, offset, s.length);
        System.arraycopy(value, offset, newValue, offset + s.length, length - offset);
        this.value = newValue;
        this.length = newValue.length;
        return this;
    }

    public MyStringBuilder2 reverse() {
        for (int i = 0; i < length / 2; i++) {
            char temp = value[i];
            value[i] = value[length - i - 1];
            value[length - i - 1] = temp;
        }
        return this;
    }

    public MyStringBuilder2 substring(int begin) {
        return new MyStringBuilder2(Arrays.copyOfRange(value, begin, length));
    }

    public MyStringBuilder2 toUpperCase() {
        for (int i = 0; i < length; i++) {
            value[i] = Character.toUpperCase(value[i]);
        }
        return this;
    }

}
