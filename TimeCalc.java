public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int minutesToAdd = Integer.parseInt(args[1]);
        // System.out.println("Hours: " + hours);
        // System.out.println("Minutes: " + minutes);
        // System.out.println("Minutes to add: " + minutesToAdd);

        int totalMin = hours*60 + minutes + minutesToAdd;
        // System.out.println("Total minutes: " + totalMin);
        int totalHours = totalMin / 60;
        // System.out.println("Total hours: " + totalHours);
        int newHours = totalHours % 24;
        int newMin = totalMin - (totalHours*60);
        // System.out.println("New hours: " + newHours + " New minutes: " + newMin);

        String end = "";
        if (newHours<10) {
            end = "0" + newHours + ":";
        }
        else end = newHours + ":";
        if (newMin<10) {
            end = end + "0" + newMin;
        }
        else end = end + newMin;
    
        System.out.println(end);

}
}
