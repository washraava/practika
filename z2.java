import java.util.Scanner;

        class Date {
            void test() {

        Date date = new Date();
        date.test();

        class Year {

            public void bissextile() {

                Scanner input = new Scanner(System.in);
                int year = input.nextInt();
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            System.out.println("bissextile");
                        }
                    }
                } else {
                    System.out.println("not bissextile");
                }
                Year yearO = new Year();
                yearO.bissextile();
            }
        }
    }
    class Month {

        public int getDays() {
            Scanner input = new Scanner(System.in);
            int month = 0;
            String error;
            System.out.println("Input the number of the month");
            input = new Scanner(System.in);
            int monthNum = input.nextInt();
            switch (monthNum) {

                case 1:
                    month = 31;
                    break;
                case 2:
                    month = 28;
                    break;
                case 3:
                    month = 31;
                    break;
                case 4:
                    month = 30;
                    break;
                case 5:
                    month = 31;
                    break;
                case 6:
                    month = 30;
                    break;
                case 7:
                    month = 31;
                    break;
                case 8:
                    month = 31;
                    break;
                case 9:
                    month = 30;
                    break;
                case 10:
                    month = 31;
                    break;
                case 11:
                    month = 30;
                    break;
                case 12:
                    month = 31;
                    break;
                default:
                    error = "wrong number";
                    break;
            }
            return month;
        }
    }


    class Day {
        public String dayOfTheWeek() {
            Scanner input = new Scanner(System.in);
            String day = "";
            input = new Scanner(System.in);
            int weekDayNum = input.nextInt();

            switch (weekDayNum) {
                case 1:
                    day = "Monday";
                case 2:
                    day = "Tuesday";
                case 3:
                    day = "Wednesday";
                case 4:
                    day = "Thursday";
                case 5:
                    day = "Friday";
                case 6:
                    day = "Saturday";
                case 7:
                    day = "Sunday";
            }
            return day;
        }
    }
}
