package Module1.Java_Fundamentals.MiniProject;

import java.util.*;


class Video {
    private String videoName;
    private boolean checkout;
    private int rating;

    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = 0;
    }

    public String getName() {
        return videoName;
    }

    public void doCheckout() {
        checkout = true;
    }

    public void doReturn() {
        checkout = false;
    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}

class VideoStore {
    private ArrayList<Video> store = new ArrayList<>();

    public void addVideo(String name) {
        store.add(new Video(name));
        System.out.println("Video \"" + name + "\" added successfully.\n");
    }

    public void doCheckout(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.\n");
                return;
            }
        }
        System.out.println("Video not found!\n");
    }

    public void doReturn(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.\n");
                return;
            }
        }
        System.out.println("Video not found!\n");
    }

    public void receiveRating(String name, int rating) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".\n");
                return;
            }
        }
        System.out.println("Video not found!\n");
    }

    public void listInventory() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Video Name      | Checkout Status | Rating");
        for (Video v : store) {
            System.out.printf("%-15s| %-16s| %-7d\n", v.getName(), v.getCheckout(), v.getRating());
        }
        System.out.println("--------------------------------------------------------\n");
    }
}

public class VideoLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore vs = new VideoStore();
        int choice;

        do {
            System.out.println("MAIN MENU\n=========");
            System.out.println("1. Add Videos");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1..6): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter the name of the video you want to add: ");
                    vs.addVideo(sc.nextLine());
                    break;
                case 2:
                    System.out.print("\nEnter the name of the video you want to check out: ");
                    vs.doCheckout(sc.nextLine());
                    break;
                case 3:
                    System.out.print("\nEnter the name of the video you want to return: ");
                    vs.doReturn(sc.nextLine());
                    break;
                case 4:
                    System.out.print("\nEnter the name of the video you want to rate: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rating = sc.nextInt();
                    vs.receiveRating(name, rating);
                    sc.nextLine(); 
                    break;
                case 5:
                    vs.listInventory();
                    break;
                case 6:
                    System.out.println("\nExiting...!! Thanks for using the application.");
                    break;
                default:
                    System.out.println("\nInvalid choice! Please select between 1 to 6.\n");
            }

        } while (choice != 6);

        sc.close();
    }
}

