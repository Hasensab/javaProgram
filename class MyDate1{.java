class MyDate{
    private int day,month,year;
    public MyDate()//default constructor
    {
        day=20;
        month=3;
        year=2024;

    }
    public MyDate(int d,int m,int y)//parameterized constructor
    {
        day=d;
        month=m;
        year=y;
    }
    public void dispDate(){
        System.out.println("Date is:"+day+"/"+month+"/"+year);
    }
}