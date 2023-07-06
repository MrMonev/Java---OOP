package Inheritance_Lab.StackOfStrings_04;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push("Ivaylo");
        stack.push("Misho");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
