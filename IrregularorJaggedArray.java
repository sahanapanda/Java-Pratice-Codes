class JaggedArray
{
    public static void main(String args[])
    {
        int a[][] = new int[3][];

        a[0] = new int[2];
        a[1] = new int[3];
        a[2] = new int[4];

        a[0][0] = 10;
        a[0][1] = 20;

        a[1][0] = 30;
        a[1][1] = 40;
        a[1][2] = 50;

        a[2][0] = 60;
        a[2][1] = 70;
        a[2][2] = 80;
        a[2][3] = 90;

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
