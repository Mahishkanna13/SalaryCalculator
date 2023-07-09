// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] hours=new int[7];
        double salary=0;
        int salary1=0;
        int extraWage=0;
        int NumberOfHours=0;
        for(int i=0;i<7;i++)
        {
            hours[i]=scan.nextInt();
        }
        for(int i=0;i<7;i++)
        {
            NumberOfHours+=hours[i];
            if(i==0 && hours[i]>=1)
            {
                salary+=hours[i]*100;
                salary+=(salary*0.50);

            }

            if(i>=1 && i<=5)
            {
                if(hours[i]>8)
                {
                    extraWage=hours[i]-8;
                    salary+=hours[i]*100;
                    salary+=extraWage*15;
                    extraWage=0;
                }

                else{
                    salary+=hours[i]*100;
                }
            }

            if(i==6 && hours[i]>=1)
            {
                salary1+=hours[i]*100;
                salary+=salary1+(salary1*0.25);
            }
            if(NumberOfHours>40)
            {
                extraWage=NumberOfHours-40;
                salary+=extraWage*25;
                extraWage=0;
            }


        }
        System.out.println((int)salary);


    }
}
