public class Medic extends Hero implements HavingSuperAbility{
    //В классе медик добавить поле healPoints, затем добавить метод increaseExperience
    // сделать так чтоб увеличивалось на 10%
    private double healPoints;



    public void increaseExperience() {
        healPoints = healPoints * (1.1);
        System.out.println("Medic применил суперспособность");
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Madic вылечил игрока");
    }

}
