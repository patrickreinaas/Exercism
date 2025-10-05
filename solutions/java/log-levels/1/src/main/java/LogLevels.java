public class LogLevels {

    // Takes in a message (logLine) and returns only the message part of the log line
    public static String message(String logLine) {
        String regex = ":"; // Regex to split the String at ":"
        String[] splitLogLine = logLine.split(regex); // Splits the message (logLine) into an array using ":" as the point of separation (delimiter)
        return splitLogLine[1].trim(); // Returns the second element of the array (the message in this case) and trims out the whitespace
    }

    // Takes in a message (logLine) and returns only the log level part of the logLine
    public static String logLevel(String logLine) {
        String regex = "[\\[\\]]"; // Regex to split the String at "[" and "]"
        String[] splitLogLine = logLine.split(regex); // Splits the message (logLine) into an array using "[" and "]" as the points of separation (delimiters)
        return splitLogLine[1].toLowerCase(); // Returns the second element of the array (the log level in this case) and converts it to lowercase
    }

    // Takes in a message (logLine) and returns the message followed by the log level in parentheses
    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")"; // Returns the message followed by the log level in parentheses
    }
}
