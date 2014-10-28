import java.util.Scanner;
public class Spectrum
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a wavelength value: ");
        double wavelength = input.nextDouble();
        if (wavelength<1e-11)
        {
            System.out.println("Gamma ray");
        }
        else if (wavelength<=1e-8)
        {
            System.out.println("X-ray");
        }
        else if (wavelength<=4e-7)
        {
            System.out.println("Ultraviolet");
        }
        else if (wavelength<=7e-7)
        {
            System.out.println("Visible light");
        }
        else if (wavelength<=1e-3)
        {
            System.out.println("Infrared");
        }
        else if (wavelength<=1e-1)
        {
            System.out.println("Microwaves");
        }
        else
        {
            System.out.println("Radio waves");
        }
    }

}
