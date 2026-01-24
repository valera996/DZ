package DZ5.BotanicalGarden;
/*
Объекты
Сад, орхидея, кактус


Свойсвта,действия

Сад
действие добавить растение
действие обеспечить уход

Кактус
поле - требуемое количество света
поле - требуемое количесво полива
действие показать требования

Орхидея
поле - требуемое количество света
поле - требуемое количесво полива
действие показать требования


Ростение(родительский класс)
поле - требуемое количество света
поле - требуемое количесво полива
действие показать требования

 */
public class Main {
    public static void main(String[] args) {

        BatanicalGarden batanicalGarden = new BatanicalGarden();
        Cactus cactus = new Cactus();
        Orchid orchid = new Orchid();


        batanicalGarden.setNewPlant(cactus);
        batanicalGarden.takeCareOfPlant();

        System.out.println();

        batanicalGarden.setNewPlant(orchid);
        batanicalGarden.takeCareOfPlant();
    }
}
