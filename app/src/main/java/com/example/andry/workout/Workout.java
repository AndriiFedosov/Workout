package com.example.andry.workout;

/**
 * Created by Andry on 12.06.2017.
 */

public class Workout {
    private String name;
    private String description;


    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static final Workout[] workout = new Workout[]{
            new Workout("Для задохликів","" +
                    "100 разів підтянутись\n"+
                    "100 разів віджатись\n"+
                    "100 разів присісти\n"),
            new Workout("Для годних штрихів","" +
                    "10 разів дати ляща Київстонеру\n"+
                    "10 разів відібрати ляльку у кота\n"+
                    "10 разів зняти хату у Львові безкоштовно\n"),
            new Workout("Для тіпів що роздають по шухлядкам","" +
                    "1 раз зняти з Біг рашен боса маску\n"+
                    "1 раз накидаи по щам тіпам з двадцятого\n"+
                    "1 раз зняти солнце ликого Вілкула з престолу\n"),
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
