package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        
//        input.getString();
        input.yesNo();
        input.getInt(2,10);
        input.getInt();
        input.getDouble(4,15);
        input.getDouble();
    }
}
