/*
	功能：显示当前的时间，格式是年 时 分 秒
*/

public class ShowCurrentTime{
	public static void main(String []args){
		long totalMilliseconds = System.currentTimeMillis();
		long totalSecond = totalMilliseconds / 1000;
		long currentSecond = totalSecond % 60;
		long totalMinutes = totalSecond / 60;
		long currentMinutes = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHours = totalHours % 24 + 8;
		long totalYears = totalHours / 8760 + 1970;

		System.out.println("Current time is " + totalYears + " years " + currentHours + ":" + currentMinutes + ":" + currentSecond + " GMT");
	}
}