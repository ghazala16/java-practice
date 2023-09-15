public class this_keyword {
    
    /*
    void show()//method
    {
        System.out.println(this);
    }
    public static void main(String[] args) {
        this_keyword r=new this_keyword();//r is current object
        System.out.println(r);
        r.show();
    }
    */

   
   
   
   /*
    int a;//(instance var)/......../not initialised hence 0 will be print
    this_keyword(int a)
    {
        a=a;//by this the compiler got confused because instance var and reference var are named same and it will print instance var
        this.a=a;
    }
    void show()//method
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        this_keyword r=new this_keyword(100);//r is current object
        r.show();
    }

    */






    /*this_keyword()//constroctor
    {
        System.out.println("learn coading");
    }
    this_keyword(int a)
    {
        //this();//this will call default constructor
        System.out.println(a);//only this stament will only print the val 100
    }
    public static void main(String[] args) {
         this_keyword r=new this_keyword(100);

    }*/





    this_keyword()
    {
        this(10);// this will call parametrized constroctor
    }
    this_keyword(int a)
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        this_keyword r= new this_keyword();
    }

}