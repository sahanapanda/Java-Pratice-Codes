class StringBufferDemo
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("Append: " + sb);

        sb.insert(5, " Java");
        System.out.println("Insert: " + sb);

        sb.reverse();
        System.out.println("Reverse: " + sb);

        sb.reverse();
        sb.delete(5, 10);
        System.out.println("Delete: " + sb);

        sb.replace(0, 5, "Welcome");
        System.out.println("Replace: " + sb);
    }
}
