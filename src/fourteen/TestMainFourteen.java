package fourteen;

public class TestMainFourteen {

    public static void main(String[] args) {

    }

    /**
     * 这个类是反例，公有类不能暴露数据域，坚持面向对象的程序设计是基本
     */
    class Point1 {
        public Double x;
        public Double y;
    }

    /**
     * 修改后类如下
     */
    class Point2 {
        private Double x;
        private Double y;

        public Double getX() {
            return x;
        }

        public void setX(Double x) {
            this.x = x;
        }

        public Double getY() {
            return y;
        }

        public void setY(Double y) {
            this.y = y;
        }
    }

    /**
     *  如果暴露数据，那么暴露出不可变的数据域例子如下，这样产生的危害小一些
     *  这个类可以保证每一个实例都返回正确的时间
     */
    final class Time {
        private static final int HOURS_DAY = 24;
        private static final int MINUTES_PER_HOUR = 60;

        public int hour;
        public int minute;

        public Time(int hour, int minute) {
            if (hour < 0 || hour >= HOURS_DAY) {
                throw new IllegalArgumentException("hour" + hour);
            }
            if (minute < 0 || minute >= MINUTES_PER_HOUR) {
                throw new IllegalArgumentException("minute" + minute);
            }
            this.hour = hour;
            this.minute = minute;
        }
    }
}
