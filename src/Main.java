import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static User defaultUser = new User("Tono", Collections.emptyList(),Collections.emptyList());
    private static final List<User> usersList = new ArrayList<>();
    public static void main(String[] args) {
        //La lista de los usuarios que forman parte de la red social

        //Usuarios
        User pepe = new User("pepe");
        User manolita = new User("manolita");
        User juan = new User("juan");
        User julia = new User("julia");
        User sandra = new User("sandra");
        User diego = new User("diego");
        User carlos = new User("carlos");

        //seguidores de pepe
        List<User> followedpepe = new ArrayList<>();
        followedpepe.add(manolita);
        followedpepe.add(diego);

        //seguidores de manolita
        List<User> followedmanolita = new ArrayList<>();
        followedmanolita.add(juan);
        followedmanolita.add(diego);

        //post de pepe
        Post imagpepe = new ImagePost("Selfie.jpg", LocalDate.of(2022, 5, 4), "100*100");
        Post textpepe = new TextPost("Hoxe subindo a Moa", LocalDate.of(2022, 4, 1), new ArrayList<Comment>(), "Hoy salí de acampada");
        List<Post> postlistpepe = new ArrayList<>();
        postlistpepe.add(imagpepe);
        postlistpepe.add(textpepe);

        //comentarios de diego y manolita en el post de pepe
        Comment commenttextpepediego = new Comment("Menuda suerte", LocalDate.of(2022, 4, 2), diego);
        Comment commenttextpepemanolita = new Comment("Espero que no lloviese", LocalDate.of(2022, 4, 2), manolita);
        List<Comment> commentlist = new ArrayList<>();
        commentlist.add(commenttextpepemanolita);
        commentlist.add(commenttextpepediego);
        //añadimos los comentarios al post de pepe
        textpepe.setCommentList(commentlist);
        //añadimos la lista de post a pepe
        pepe.setPostList(postlistpepe);
        //añadimos amigos de pepe a pepe
        pepe.setFriendList(followedpepe);
        //añadimos amigos de manolita a manolita
        manolita.setFriendList(followedmanolita);

        //añadimos los usuarios a la lista de usuarios de la red social
        usersList.add(diego);
        usersList.add(carlos);
        usersList.add(pepe);
        usersList.add(manolita);
        usersList.add(julia);
        usersList.add(sandra);
        usersList.add(juan);

        int option;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("------------------MENU------------------");
            System.out.println("1--------------Login----------");
            System.out.println("2--------------AddUser---------------");
            System.out.println("3----------------Exit-----------------------");
            option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.println("UserName");
                    String name = new Scanner(System.in).nextLine();
                    if(loginVerification(name)){
                        login(name);
                    }else{
                        System.out.println("The user is not registered");
                    }
                    break;
                case 2:
                    break;
                case 3 :
                        System.exit(0);
            }

        }

    }

    private static void login(String name) {
        User userName = usersList.stream().filter(user -> user.getName().equals(name)).findAny().orElse(null);
        userMenu(userName);
    }

    private static void userMenu(User userName) {
        int option;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("------------------MENU------------------");
            System.out.println("1--------------AddUserPost---------------");
            System.out.println("2-------------UnfollowUser---------------");
            System.out.println("3-------------StartFollowingAUser-----------");
            System.out.println("4----------------Exit-----------------------");
            option = sc.nextInt();

            switch (option) {

                case 1 -> addUserPost(userName);
            }

        }


    }

    private static boolean loginVerification(String name) {
        return usersList.stream().anyMatch(user -> user.getName().equals(name));

    }

        private static void addUserPost(User userName) {
            int option;
            Scanner sc = new Scanner(System.in);
            System.out.println("SelectTheTypeOfPostYouWantToAdd");
            System.out.println("1 --> AddPostImage");
            System.out.println("2 --> AddVideoPost");
            System.out.println("3 --> AddTextPost");
            option = sc.nextInt();

            if(option==1) {
                Scanner newSc = new Scanner(System.in);
                String text;
                String dimension;
                System.out.println("HaveSelectedImagePost");
                System.out.println("---------------------");
                System.out.println("EnterTextFromTheImage");
                text= newSc.nextLine();
                System.out.println("EnterImageDimensions");
                dimension= newSc.nextLine();
                Post imageUs = new ImagePost(text,LocalDate.now(),dimension);
                List<Post> postlistUser = new ArrayList<>();
                userName.getPostList().add(imageUs);
                userName.getPostList().forEach(System.out::println);
            }

            else if(option==2) {
                Scanner newSc = new Scanner(System.in);
                String text;
                String quality;
                int duration;
                System.out.println("HaveSelectedVideoPost");
                System.out.println("---------------------");
                System.out.println("EnterTextFromTheVideo");
                text = newSc.nextLine();
                System.out.println("EnterVideoQuality");
                quality = newSc.nextLine();
                System.out.println("EnterVideoDuration");
                duration = newSc.nextInt();
                Post videoUs = new VideoPost(text,LocalDate.now(),quality,duration);
                List<Post> postlistUser = new ArrayList<>();
                userName.getPostList().add(videoUs);
                userName.getPostList().forEach(System.out::println);
            }
            else if(option==3) {
                Scanner newSc = new Scanner(System.in);
                String text;
                String content;
                System.out.println("HaveSelectedTextPost");
                System.out.println("---------------------");
                System.out.println("EnterTextFromTheText");
                text = newSc.nextLine();
                System.out.println("EnterTextContent");
                content = newSc.nextLine();
                Post textUs = new TextPost(text,LocalDate.now(),content);
                List<Post> postlistUser = new ArrayList<>();
                userName.getPostList().add(textUs);
                userName.getPostList().forEach(System.out::println);
            }


        }





}

