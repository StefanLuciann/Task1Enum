public enum WeekDay {
    MONDAY,
    TUESDAY,
    WENDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public final boolean isWeekday(){
        return !isHolliday();

    }
    public final boolean isHolliday(){
        return  this == SATURDAY || this == SUNDAY;

    }
    public final void whichIsGreater(WeekDay weekDay){
        if(this.ordinal()<weekDay.ordinal()){
            System.out.println("before" + weekDay);
        }
        else{
            System.out.println("after" + weekDay);
        }

    }

}
