import java.util.Scanner;
class Main
{
	public static void main(String[] args)	
	{
	  double annsal, monrate, dayrate, hourrate, anntax, montax, netpay;
	  try (Scanner input = new Scanner(System.in)) {
        System.out.println("Enter Annual Salary");
            annsal = input.nextDouble();
    }
	  System.out.println("Your Annual Salary: " + String.format("%.2f", annsal));
		
	monrate = annsal/12;
	System.out.println("Your Monthly Rate: " + String.format("%.2f", monrate));

    dayrate = monrate/22;
    System.out.println("Your Daily Rate: " + String.format("%.2f", dayrate));

    hourrate = dayrate/8;
    System.out.println("Your Hourly Rate: " + String.format("%.2f", hourrate));

    anntax = 0;
    if (annsal <= 250000){
        anntax = 0;
    }else if (annsal >= 250000 && annsal < 400000){
        anntax = 30000 * 0.2;
    }else if (annsal >= 400000 && annsal < 800000){
        anntax = 30000 + (0.25 * (annsal - 400000));
    }else if (annsal >= 800000 && annsal < 20000000){
        anntax = 130000 + (0.3 * (annsal - 800000));
    }else if (annsal >= 250000 && annsal < 400000){
        anntax = 490000 + (0.32 * (annsal - 2000000));
    }else if (annsal >= 250000 && annsal < 400000){
        anntax = 2410000 + (0.35 * (annsal - 8000000));
    }
    System.out.println("Your Annual Tax Deduction: " + String.format("%.2f", anntax));

    montax = anntax/12;
    System.out.println("Your Monthly Tax Deduction: " + String.format("%.2f", montax));

    netpay = monrate-montax;
    System.out.println("Net Pay: " + String.format("%.2f", netpay));
	}
}