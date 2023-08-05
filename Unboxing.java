class HelloWorld {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num;
        
        int num2 = num1.intValue();//unboxing
        System.out.println(num2);
    }
}
