class AnnalynsInfiltration {
    // Checks if the knight is awake
    public static boolean canFastAttack(boolean knightIsAwake) {
       return !knightIsAwake; // if the knight is awake, return false
    }
    // Checks if any of the characters are awake
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake; // if any of the characters are awake, return true
    }
    // Checks if the archer is asleep and the prisoner is awake
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake; // if archer is asleep and prisoner is awake, return true
    }
    // Checks if the prisoner can be freed based on the states of the knight, archer, prisoner, and if the pet dog is present
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
       if (petDogIsPresent) { // checks if the dog is present
           return !archerIsAwake; // if the dog is present, the archer must be asleep
       } else if (prisonerIsAwake) { // if the dog is not present, the prisoner must be awake
           return !knightIsAwake && !archerIsAwake; // and both the knight and archer must be asleep
       } else {
           return false; // if the dog is not present and the prisoner is not awake or the archer and/or knight is awake, return false
       }
    }
}
