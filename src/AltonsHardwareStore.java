import java.util.Scanner;

public class AltonsHardwareStore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        GETTING INPUT

        System.out.println("Length of the yard?");
        double yardLength = input.nextDouble();
        yardLength *= 2;

        System.out.println("Width of the yard?");
        double yardWidth = input.nextDouble();
        yardWidth *= 2;

        System.out.println("One gate is required for installation by default. How many additional gates are you installing?");
        int additionalGates = input.nextInt();

//        CALCULATIONS

        double fencingCostWood = (yardLength + yardWidth) * 25;     //wooden fencing costs $25 per foot

        double fencingCostLink = (yardLength + yardWidth) * 15;     //chain link fencing costs $15 per foot

        int gateCost = 150 + (150 * additionalGates);               //one gate is required for install, the customer is billed for the required gate and any additional gates

        double woodTaxes = (fencingCostWood + gateCost) * .06;

        double linkTaxes = (fencingCostLink + gateCost) * .06;


        int buildingPermit = 50;

        double totalCostWood = fencingCostWood + gateCost + woodTaxes + buildingPermit;
        double totalCostLink = fencingCostLink + gateCost + linkTaxes + buildingPermit;

//        OUTPUT

        System.out.println("Total cost of a wooden fence : $" + totalCostWood);
        System.out.println("Total cost of a chain-link fence : $" + totalCostLink);




    }
}
