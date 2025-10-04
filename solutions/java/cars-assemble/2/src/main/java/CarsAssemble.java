public class CarsAssemble
{

    // Calculate the production rate per hour based on the speed
    public double productionRatePerHour(double speed)
    {
        if (speed == 10)
        {
            return (speed * 221 * 77/100);
        }
        else if (speed >= 9 && speed < 10)
        {
            return (speed * 221 * 8/10);
        }
        else if (speed >= 5 && speed <= 8)
        {
            return (speed * 221 * 9/10);
        }
        else if (speed >= 1 && speed <= 5)
        {
            return (speed * 221);
        }
        else
        {
            return 0;
        }
    }

    // Calculate the number of working items per minute.
    public int workingItemsPerMinute(double speed)
    {
        return (int) productionRatePerHour(speed) / 60;
    }
}
