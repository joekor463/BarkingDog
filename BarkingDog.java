public class BarkingDog {
    public shouldWakeUp (boolean barking, int hourOfday){
        if (hourOfday >= 8) {
                if (hourOfday <= 23)
                return true;}
        if (hourOfday < 0) {
            if (hourOfday > 23)
                return false;
        }
    }
}
