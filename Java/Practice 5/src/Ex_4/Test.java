package Ex_4;

import java.text.SimpleDateFormat;
import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        Map<Long,String> contacts = new HashMap<Long,String>();
        contacts.put(101L,"Пожежна безпека");
        contacts.put(102L,"Поліція");
        contacts.put(103L,"Швидка допомога");
        Scanner sc = new Scanner(System.in);
        boolean point = true;
        while (point)
        {

            String appText = "****************** ТЕЛЕФОННА КНИГА ************* \n"+
                    "| ** | 1.Додати контакт в книгу \n" +
                    "| ** | 2.Видалити контакт з книги \n" +
                    "| ** | 3.Редагувати контакт \n" +
                    "| ** | 4.Показати всі контакти \n" +
                    "| ** | 5.Вийти з додатку \n" ;
            System.out.println(appText);
            int cmd = sc.nextInt();
            switch (cmd)
            {
                case 1:{
                    System.out.println("Введіть номер телефону, який хочете добавити: ");
                    long number = sc.nextLong();
                    System.out.println("Введіть назву контакту");
                    String name = sc.useDelimiter("\n").next();
                    System.out.println("Введені дані: | Номер: " + number + " | Назва контакту: " + name);
                    contacts.put(number,name);
                    System.out.println("Введені дані збережено в телефону книгу!");
                    break;
                }

                case 2:{
                    if (contacts.size() > 0) {
                        System.out.println("Введіть назву контакту для видалення:");
                        String tempName = sc.useDelimiter("\n").next();
                        for (Map.Entry<Long, String> entry : contacts.entrySet()) {
                            if (entry.getValue().equals(tempName)) {
                                contacts.remove(entry.getKey());
                                System.out.println("Контакт видалено з ім'ям: " + tempName);
                            }
                        }
                    }
                    else
                        {
                            System.out.println("Телефонна книга пуста");
                        }
                    break;
                }
                case 3:{
                    System.out.println("Редагування контакту");
                    System.out.println("Введіть номер телефону для редагування контакту:");
                    long tempKey = sc.nextLong();
                    if(contacts.containsKey(tempKey))
                    {
                        System.out.println("Введіть нове значення для номеру телефону: " + tempKey);
                        String newName = sc.useDelimiter("\n").next();
                        contacts.replace(tempKey, newName);
                        System.out.print("Інформація користувача після редагування:");
                        System.out.println(contacts.get(tempKey));
                        break;
                    }
                }
                case 4:{
                    System.out.println("******** Список контактів вашої телефонної книги: ********");
                    for (Map.Entry entry : contacts.entrySet()) {
                        System.out.println("| ** |" + entry.getKey() + " - "
                                + entry.getValue());}
                    System.out.println("\n");
                    break;
                }
                case 5:{
                    System.out.println("Вихід з додатку");
                    point = false;
                    printTimeStamp();
                    break;
                }
            }
        }
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }
}
