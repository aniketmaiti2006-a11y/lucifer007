public class Lasagna {
    // Task 1: Define the expected oven time
    public int expectedMinutesInOven() {
        return 40;
    }

    // Task 2: Calculate the remaining oven time
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    // Task 3: Calculate the preparation time
    public int preparationTimeInMinutes(int numberOfLayers) {
        // Assuming each layer takes 2 minutes
        return numberOfLayers * 2;
    }

    // Task 4: Calculate the total working time
    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        int preparationTime = preparationTimeInMinutes(numberOfLayers);
        int remainingTime = remainingMinutesInOven(actualMinutesInOven);
        // Total time = preparation time + time already in oven
        // Note: The exercise logic implies total time worked = prep time + actual oven time
        // However, looking at the example: totalTimeInMinutes(3, 20) => 26
        // Prep time (3 layers * 2) = 6. 
        // 6 + 20 (actual oven time) = 26.
        // So the formula is: preparationTime + actualMinutesInOven
        return preparationTime + actualMinutesInOven;
    }
}