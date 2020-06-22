#Alton's Hardware Store

IPO

INPUT
- perimeter of the yard in feet
- type of fencing used
- number of additional gates

OUTPUT

-total cost of a chain-link fence installation
-total cost of a wooden fence installation


PROCESS

BEGIN

Getting INPUT
	
	prompt user for length of yard
	get yardLength
	yardLength = (yardLength *2)

	prompt user for width of yard
	get yardWidth
	yardWidth = (yardWidth * 2)

	prompt user for number of additional gates
	get additionalGates


CALCULATIONS
//fencingCost
//gateCost
//buildingPermit

    fencingCostWood = (yardLength + yardWidth) * $25

	fencingCostLink = (yardLength + yardWidth) * $15

	gateCost = $150 + ($150 * additionalGates)

	woodTaxes = (fencingCostWood + gateCost) * 6%
    linkTaxes = (fencingCostLink + gateCost) * 6%

	buildingPermit = $50

	totalCostWood = fencingCostWood + gateCost + woodTaxes + buildingPermit
    totalCostLink = fencingCostLink + gateCost + linkTaxes + buildingPermit

	


OUTPUT

    display totalCostWood
    display totalCostLink


END
