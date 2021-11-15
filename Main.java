import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
      System.out.print ("Введите первое число: ");
    int a = in.nextInt ();
      System.out.print ("Введите второе число: ");
    int b = in.nextInt ();
      System.out.print ("Введите третье число: ");
    int c = in.nextInt ();
      System.out.print ("Введите четвертое число: ");
    int d = in.nextInt ();


    if (a <= b && a <= c && a <= d)
      {
	System.out.println (a);
      }
    else if (b <= c && b <= d && b <= a)
      {
	System.out.println (b);
      }
    else if (c <= d && c <= a && c <= b)
      {
	System.out.println (c);
      }
    else if (d <= a && d <= b && d <= c)
      {
	System.out.println (d);
      }
    else
      {
	System.out.println ("Ошибка ввода");
      }
  }
}
