class MarkException extends RuntimeException
{
    String msg;
    int mark;
    MarkException(String msg, int m)
    {
        this.msg = msg;
        mark = m;
    }
    public String toString()
    {
        return msg;
    }
}
 

class Grading
{
    public static void exception1(String[] args)
    {
        int marks[] = {56, 72, 89, 93, -1, 134,75,84};
        for(int i =0; i<marks.length;i++)
           gradeMark(marks[i]);
    }
    static void gradeMark(int mark)
    {
        if(mark>100)
            throw new MarkException("Mark above 100", mark);
        else if(mark>75 && mark<=100)
            System.out.println("A");
        else if(mark>50 && mark<=74)
            System.out.println("B");
        else if(mark>=0)
            System.out.println("C");
        else
            throw new MarkException("Mark less than 0",mark);
    }
}
