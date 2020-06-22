#Alton's Hardware Store

IPO

INPUT
- perimeter of the yard in feet
- type of fencing used
- number of additional gates

OUTPUT

-total cost of installation


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

	taxes = (fencingCost + gateCost) * 6%

	buildingPermit = $50

	totalCostWood = fencingCostWood + gateCost + taxes + buildingPermit
    totalCostLink = fencingCostLink + gateCost + taxes + buildingPermit

	


OUTPUT

    display totalCostWood
    display totalCostLink


END
