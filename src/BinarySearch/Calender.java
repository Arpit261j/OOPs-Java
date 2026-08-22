package BinarySearch;

public class Calender {
    public static void main(String[] args) {
        System.out.println(countDaysTogether("08-06", "12-08", "02-06", "09-01"));
    }
    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        char c1 = leaveAlice.charAt(0);
        int leaveMonthAlice = c1-'0';
        c1 = leaveAlice.charAt(1);
        leaveMonthAlice = leaveMonthAlice*10 + c1-'0';

        char c2 = leaveAlice.charAt(3);
        int leaveDateAlice = c2-'0';
        c2 = leaveAlice.charAt(4);
        leaveDateAlice = leaveDateAlice*10 + c2-'0';

        char c3 = arriveBob.charAt(0);
        int arriveMonthBob = c3-'0';
        c3 = arriveBob.charAt(1);
        arriveMonthBob = arriveMonthBob*10 + c3-'0';

        char c4 = arriveBob.charAt(3);
        int arriveDateBob = c4-'0';
        c4 = arriveBob.charAt(4);
        arriveDateBob = arriveDateBob*10 + c4-'0';

        char c5 = arriveAlice.charAt(0);
        int arriveMonthAlice = c5-'0';
        c5 = arriveAlice.charAt(1);
        arriveMonthAlice = arriveMonthAlice*10 + c5-'0';

        char c6 = arriveAlice.charAt(3);
        int arriveDateAlice = c6-'0';
        c6 = arriveAlice.charAt(4);
        arriveDateAlice = arriveDateAlice*10 + c6-'0';

        char c7 = leaveBob.charAt(0);
        int leaveMonthBob = c7-'0';
        c7 = leaveBob.charAt(1);
        leaveMonthBob = leaveMonthBob*10 + c7-'0';

        char c8 = leaveBob.charAt(3);
        int leaveDateBob = c8-'0';
        c8 = leaveBob.charAt(4);
        leaveDateBob = leaveDateBob*10 + c8-'0';

        int arriveMonth = 0, leaveMonth = 0, arriveDate = 0, leaveDate = 0;

        if(arriveMonthAlice > arriveMonthBob) {
            arriveMonth = arriveMonthAlice;
            arriveDate = arriveDateAlice;
        }
        else if (arriveMonthAlice == arriveMonthBob) {
            arriveMonth = arriveMonthAlice;
            if(arriveDateAlice > arriveDateBob)
                arriveDate = arriveDateAlice;
            else
                arriveDate = arriveDateBob;
        }
        else {
            arriveMonth = arriveMonthBob;
            arriveDate = arriveDateBob;
        }

        if(leaveMonthAlice < leaveMonthBob) {
            leaveMonth = leaveMonthAlice;
            leaveDate = leaveDateAlice;
        }
        else if (leaveMonthAlice == leaveMonthBob) {
            leaveMonth = leaveMonthAlice;
            if(leaveDateAlice < leaveDateBob)
                leaveDate = leaveDateAlice;
            else
                leaveDate = leaveDateBob;
        }
        else {
            leaveMonth = leaveMonthBob;
            leaveDate = leaveDateBob;
        }

        if(leaveMonth > arriveMonth)
            return leaveDate - arriveDate + (leaveMonth - arriveMonth)*30+1;
        else if(leaveMonth == arriveMonth) {
            if(arriveDate > leaveDate) {
                return 0;
            }
            return leaveDate-arriveDate+1;
        }
        return 0;
    }
}
