public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int reduce() {
        return volume - 10;
    }

    public int empty() {
        if (volume > 0){
            volume = 0;
            return volume;
        }
        return volume;

    }

    public int fill() {
        if (volume < 100){
            volume = 100;
            return volume;
        }
        return volume;
    }
}



