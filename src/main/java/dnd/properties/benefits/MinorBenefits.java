package dnd.properties.benefits;

import dnd.properties.Properties;

import java.util.Random;

public class MinorBenefits extends Properties {
    @Override
    public String generateProperty() {
        int value = new Random().nextInt(1, 101);
        if (between(value, 1, 20)) {
            return "Пока вы настроены на артефакт, вы получаете владение одним навыком на выбор Мастера";
        } else if (between(value, 21, 30)) {
            return "Пока вы настроены на артефакт, вы обладаете иммунитетом к болезням";
        } else if (between(value, 31, 40)) {
            return "Пока вы настроены на артефакт, вы не можете быть очарованы и испуганы";
        } else if (between(value, 41, 50)) {
            return "Пока вы настроены на артефакт, вы получаете сопротивление к одному виду урона на выбор Мастера";
        } else if (between(value, 51, 60)) {
            return "Пока вы настроены на артефакт, вы можете Действием накладывать им один заговор (выбранный Мастером)";
        } else if (between(value, 61, 70)) {
            return "Пока вы настроены на артефакт, вы можете Действием наложить им одно заклинание 1 уровня (выбранное Мастером). Наложив заклинание, бросьте к6. При результате 1–5 вы не можете повторить это до следующего рассвета";
        } else if (between(value, 71, 80)) {
            return "Как результат 61–70, но заклинание 2 уровня";
        } else if (between(value, 81, 90)) {
            return "Как результат 61–70, но заклинание 3 уровня";
        } else {
            return "Пока вы настроены на артефакт, вы получаете бонус +1 к Классу Доспеха";
        }
    }
}
