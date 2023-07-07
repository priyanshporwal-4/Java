class display
{
    public syncronized void wish(String name)
    {
        syncronized(this)
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("good morning");
                try
                {
                    Thread.sleep(2000);

                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                System.out.println(name);
                }
            }
        }
    }
    class my extends Thread
    {
        display d;
        String name;
        my(display d,String name)
        {
            this.d=d;
            this.name=name;
        }
    }
    class jason
    {
        public static void main(String args)
        {display b1=new display();
        my t1=new my(d,"young");
        my t2=new my(d,"dhoni");
        t1.start();
        t2.start();}
    }
