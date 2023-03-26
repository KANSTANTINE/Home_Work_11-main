import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = {createObject("Transport"), createObject("Kulture"), createObject("Education")};
        for (Printable printable: printables) {
            printable.print();
        }

    }
    public static Printable createObject(String className){
        switch (className){
            case "Transport":
                return new Transport("Создание благоприятных условий для развития рынка транспортных услуг","Перевозки пассажиров и грузов автомобильным, железнодорожным, водным транспортом");
            case "Kulture":
                return new Kulture("Создание эффективно действующей системы для развития культуры",1200000);
            case "Education":
                return new Education("Создание системы образования, направленной на формирование, развитие и профессиональное становление личности  повышение качества образования","Образовательные учреждения такие как школы, универы, колледжы и т.д");
        }
        return null;
    }


}