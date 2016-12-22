import java.util.Scanner;
public class StopWatch
{
long StarTime=0;
long StopTime=0;
long Elapsed=0;
public void start()
{
StarTime=System.currentTimeMillis();
}
public void stop()
{
StopTime=System.currentTimeMillis();

}
public long getElapsed()
{
Elapsed=(StartTime-StopTime);
return elapsed;
}
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int StartChoice,int StopChoice;
StopWatch wc=new StopWatch();
System.out.println("please choose your option");
StartChoice=sc.nextInt();
wc.start();
System.out.println("please enter for stopping");
wc.stop();
System.out.println("Elapsed time :"+wc.getElapsed()+"millisecond");
}
}
