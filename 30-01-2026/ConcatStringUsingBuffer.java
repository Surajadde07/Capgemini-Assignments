
class ConcatStringUsingBuffer {
    public static void main(String[] args) {
        String[] arr = {"Hello", "World", "How", "Are", "You?"};
        StringBuffer sb = new StringBuffer();
        for (String str : arr) {
            sb.append(str + " ");
        }
        System.out.println(sb.toString());
    }
}
