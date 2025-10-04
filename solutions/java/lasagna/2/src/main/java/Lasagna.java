public class Lasagna {
    // Defies the 'expectedMinutesInOven' method
    public int expectedMinutesInOven() {
        return 40;
    }
    // Defines the 'remainingMinutesInOven' method
    public int remainingMinutesInOven(int minInOven) {
        return expectedMinutesInOven() - minInOven;
    }
    // Defines the 'preparationTimeInMinutes' method
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    // Defines the 'totalTimeInMinutes' method
    public int totalTimeInMinutes(int layers, int minInOven) {
        return preparationTimeInMinutes(layers) + minInOven;
    }
}
