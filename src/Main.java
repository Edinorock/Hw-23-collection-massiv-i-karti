import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.getPhoneBook().put("Валерий Меладзе", "111");
        phoneBook.getPhoneBook().put("Валерий Леонтьев", "22222");
        phoneBook.getPhoneBook().put("Игорь Николаев", "7777");
        phoneBook.getPhoneBook().put("Игорь Крутой", "99999");
        phoneBook.getPhoneBook().put("Алла Пугачева", "000000");
        phoneBook.getPhoneBook().put("Филипп Киркоров", "55555");
        phoneBook.getPhoneBook().put("Слава Кпсс", "333333");
        phoneBook.getPhoneBook().put("Максим Галкин", "444444");
        phoneBook.getPhoneBook().put("Хан Замай", "666666");
        phoneBook.getPhoneBook().put("Нойз МС", "88888");
        phoneBook.getPhoneBook().put("Мой кот пупсик", "10101010");
        phoneBook.getPhoneBook().put("Николай Басков", "6547663");
        phoneBook.getPhoneBook().put("Михаил Круг", "778938874");
        phoneBook.getPhoneBook().put("Лил пип", "000847477");
        phoneBook.getPhoneBook().put("Лана Дель Рей", "8476659");
        phoneBook.getPhoneBook().put("Ариана Гранде", "09476647738");
        phoneBook.getPhoneBook().put("Полина Гагарина", "88467489");
        phoneBook.getPhoneBook().put("Ким Намджун", "947567840");
        phoneBook.getPhoneBook().put("Ким Чен Ын", "0876567899,");
        phoneBook.getPhoneBook().put("Райан Гослинг", "048476300588");
        System.out.println(phoneBook);
    }
}
