public class fourthChallenge {
        public static void main(String[] args) {

            System.out.println(getDurationString(728465));
            System.out.println(getDurationString(55,23));
        }

        public static String getDurationString (int seconds) {

            if (seconds < 0) {
                return "Invalid value";
            }
                int hour = seconds / 3600;
                int minutes = (seconds - hour * 3600) / 60;
                seconds = (seconds - hour * 3600) % 60;

                return hour + "h " + minutes + "m " + seconds + "s";
        }

        public static String getDurationString (int minutes, int seconds) {

            if ( minutes < 0 || seconds < 0 || seconds > 59) {
                return "Invalid value";
            }
                int secondSeconds = minutes * 60 + seconds;

                return getDurationString(secondSeconds);
            }

    }
