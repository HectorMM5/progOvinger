import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class eventRegister {
    Scanner scanner = new Scanner(System.in);
    
    private final ArrayList<event> events = new ArrayList<>();

    public void registerEvent() {
        System.out.println("Type in the event info in the following format: name, place, host, date (YYYYMMDDHHMM), type");

        String input = scanner.nextLine();

        String[] inputSplitted = input.split(",");
        for (int i = 0; i < inputSplitted.length; i++) {
            inputSplitted[i] = inputSplitted[i].trim();
            
        }

        events.add(new event(events.size()+1, inputSplitted[0], inputSplitted[1], inputSplitted[2], Long.valueOf(inputSplitted[3]), inputSplitted[4]));

        System.out.println("Event " + inputSplitted[0] + " has been created.");
    } 

    public void findEventsIn(String place) {

        ArrayList<event> eventsIn = new ArrayList<>();

        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getPlace().equalsIgnoreCase(place)) {
                eventsIn.add(events.get(i));
            }

        }

        System.out.println("Events in " + place + ":");

        for (int i = 0; i < eventsIn.size(); i++) {
            System.out.println(eventsIn.get(i).getName());
            
        }

    }


    public void findEventsWhen(Long date) {

        ArrayList<event> eventsWhen = new ArrayList<>();

        for (int i = 0; i < events.size(); i++) {
            if ((events.get(i).getDate() - date <= 2400) && (events.get(i).getDate() - date >= 0000)) {
                eventsWhen.add(events.get(i));

            }

        }

        System.out.println("Events in the given date:");

        for (int i = 0; i < eventsWhen.size(); i++) {
            System.out.println(eventsWhen.get(i).getName());
            
        }

    }

    public void findEventsBetween(Long fromDate, Long toDate) {

        ArrayList<event> eventsBetween = new ArrayList<>();

        for (int i = 0; i < events.size(); i++) {
            if ((events.get(i).getDate() >= fromDate) && (events.get(i).getDate() <= toDate)) {
                eventsBetween.add(events.get(i));
            }

        }

        Collections.sort(eventsBetween, new Comparator<event>() {
            @Override
            public int compare(event e1, event e2) {
                return e1.getDate().compareTo(e2.getDate());
            }
        });

        System.out.println("Events in the given timeframe:");

        for (int i = 0; i < eventsBetween.size(); i++) {
            System.out.println(eventsBetween.get(i).getName());
            
        }

    }


    public void findEventsOfType(String type) {

        ArrayList<event> eventsType = new ArrayList<>();

        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getType().equalsIgnoreCase(type)) {
                eventsType.add(events.get(i));
            }

        }

        System.out.println("Events of type " + type + ":");

        for (int i = 0; i < eventsType.size(); i++) {
            System.out.println(eventsType.get(i).getName());
            
        }

    }

    public void selectList(int choice) {
        String input;
        String input2;
        switch (choice) {
            case 1:
                System.out.println("Type in the place you want to search for:");
                input = scanner.nextLine();
                findEventsIn(input);
                break;

            case 2:
                System.out.println("Type in the date you want to search for:");
                input = scanner.nextLine();
                findEventsWhen(Long.valueOf(input));
                break;

            case 3:
                System.out.println("Type in the date you want to search from:");
                input = scanner.nextLine();

                System.out.println("Type in the date you want to search to:");
                input2 = scanner.nextLine();

                findEventsBetween(Long.valueOf(input), Long.valueOf(input2));
                break;


            case 4:
                System.out.println("Type in the type of event you want to search for:");
                input = scanner.nextLine();
                findEventsOfType(input);


            default:
                throw new AssertionError();
        }
    }


}