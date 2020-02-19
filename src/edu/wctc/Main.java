package edu.wctc;

import java.time.Duration;
import java.time.LocalDateTime;


public class Main {

    private static final LocalDateTime joshuaTreeRelease = LocalDateTime.of(1987, 3, 9, 0, 0);
    private static final LocalDateTime rattleAndHumRelease = LocalDateTime.of(1988, 10, 10,0,0);
    private static final LocalDateTime now = LocalDateTime.now();

    public static void main(String[] args) {
        Duration sinceJoshuaTree = Duration.between(joshuaTreeRelease, now);
        System.out.println("since joshua tree: " + sinceJoshuaTree.toDays() / 365 + " years " + sinceJoshuaTree.toDays() % 365 / 30 + " months " + sinceJoshuaTree.toDays() % 365 % 30 + " days");
        Duration betweenJoshuaAndRattle = Duration.between(joshuaTreeRelease, rattleAndHumRelease);
        System.out.println("since joshua tree: " + betweenJoshuaAndRattle.toDays() / 365 + " years " + betweenJoshuaAndRattle.toDays() % 365 / 30 + " months " + betweenJoshuaAndRattle.toDays() % 365 % 30 + " days");
        LocalDateTime newAlbumDate = rattleAndHumRelease.plus(betweenJoshuaAndRattle);
        System.out.println("third album release : " + newAlbumDate.getYear() + " " + newAlbumDate.getMonth() + " " + newAlbumDate.getDayOfMonth());
    }
}
