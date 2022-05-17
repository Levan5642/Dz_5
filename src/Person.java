package lesson_5;

public class Person {
    public static void main(String[] args) {
        lesson_5.Employer[] person = new lesson_5.Employer[5];

        person[0] = new lesson_5.Employer("Тенгиз", "Ибрагимович", "Кубадиев", 33,
                "Engineer", 89000, "septima@mail.com", "+79267212347665");

        person[1] = new lesson_5.Employer("Расул", "Бачиев", "Исмаилович", 26,
                "DevOps", 100000.00, "1975burn@.com", "+78768543212");

        person[2] = new lesson_5.Employer("Руслан", "Этезов", "Исмаилович", 34,
                "QA Engineer", 120000, "sidr@test.com", "+79054441155");

        person[3] = new lesson_5.Employer("Рустам", "Маликович", "Ачабаев", 63,
                "Java developer", 50000, "rainbow@.com", "+79036890012");

        person[4] = new lesson_5.Employer("Алексей", "Борщевский", "Анатоевич", 45,
                "Java developer", 34000, "metla@metet.net", "+79047843467");

        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > 40) {
                person[i].getFullInfo();
            }
        }
    }
}