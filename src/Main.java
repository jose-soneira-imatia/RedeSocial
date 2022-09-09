import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {

    static User user;
    public static void main(String[] args) {
        //La lista de los usuarios que forman parte de la red social
        List<User> usersList = new ArrayList<>();
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
        Post imagpepe = new ImagePost("Selfie.jpg", LocalDate.of(2022, 5, 4), new ArrayList<Comment>(), "100*100");
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


        //en el menú se llaman a las funcionalidades descritas en el pdf

        int option;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("------------------MENU------------------");
            System.out.println("1--------------AddUser----------");
            System.out.println("2--------------AddUserPost---------------");
            System.out.println("3-------------UnfollowUser---------------");
            System.out.println("4-------------StartFollowingAUser-----------");
            option = sc.nextInt();

            switch (option) {

                case 1 -> addUser();
                case 2 -> addUserPost();
            }

        }

    }

        private static void addUser() {
            Scanner sc = new Scanner(System.in);
            String nombre;
            System.out.println("EnterUsername");
            nombre = sc.nextLine();
            user = new User(nombre);

        }

        private static void addUserPost() {
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
                Post imageUs = new ImagePost(text,LocalDate.of(2022, 5, 4), new ArrayList<Comment>(), dimension);
                List<Post> postlistUser = new ArrayList<>();
                user.getPostList().add(imageUs);
            }

        }



}

