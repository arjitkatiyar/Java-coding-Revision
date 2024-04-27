


class Air{
        int aqi;
        String city;

        public static void main(String[] args) {
                
                
                Air airquality1 = new Air();
                airquality1.aqi = 395;
                airquality1.city = "delhi";

                System.out.println(airquality1.aqi + " " + airquality1.city);

                Air airquality2 = new Air();
                airquality2.aqi = 145;
                airquality2.city = "mumbai";

                System.out.println(airquality2.aqi + " " + airquality2.city);

                Air airquality3 = new Air();
                airquality3.aqi = 125;
                airquality3.city = "kolkata";

                System.out.println(airquality3.aqi + " " + airquality3.city);

                Air airquality4 = new Air();
                airquality4.aqi = 375;
                airquality4.city = "noida";

                System.out.println(airquality4.aqi + " " + airquality4.city);

                Air airquality5 = new Air();
                airquality5.aqi = 345;
                airquality5.city = "kanpur";

                System.out.println(airquality5.aqi + " " + airquality5.city);

        }
}