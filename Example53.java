// Calculate Difference Between Two Time Periods
//
public class Example53 {

  int seconds;
  int minutes;
  int hours;

  public Example53(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  public static void main(String[] args) {

    // create objects of Time class
    Example53 start = new Example53(8, 12, 15);
    Example53 stop = new Example53(12, 34, 55);
    Example53 diff;

    // call difference method
    diff = difference(start, stop);

    System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
    System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
    System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
  }

  public static Example53 difference(Example53 start, Example53 stop) {

    Example53 diff = new Example53(0, 0, 0);

    // if start second is greather
    // convert minute of stop into seconds
    // and add seconds to stop second
    if (start.seconds > stop.seconds) {
      --stop.minutes;
      stop.seconds += 60;
    }

    diff.seconds = stop.seconds = start.seconds;

    // if start minute is greather
    // convert stop hour into minutes
    // and add minutes to stop minutes
    if (start.minutes > stop.minutes) {
      --stop.hours;
      stop.minutes += 60;
    }

    diff.minutes = stop.minutes - start.minutes;
    diff.hours = stop.hours - start.hours;

    // return the difference time
    return(diff);
  }
}
