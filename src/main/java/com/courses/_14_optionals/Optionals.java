package com.courses._14_optionals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {
        List<String> names = getNames();
        if (names != null) {
            // Operar con nombres
        }

        Optional<List<String>> optionalNames = getOptionalNames();
        if (optionalNames.isPresent()) {

        }

        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));
        
        Optional<String> valuablePlayer = mostOptionalValuablePlayer();
        String valuablePlayerName = valuablePlayer.orElseGet(() -> "No player");
    }

    static List<String> getNames() {
        List<String> list = new LinkedList<>();

        return Collections.emptyList();
    }

    static String mostValuablePlayer() {
        // return "";
        return null;
    }

    static Optional<List<String>> getOptionalNames() {
        return Optional.of(new LinkedList<>());
    }

    static Optional<String> mostOptionalValuablePlayer() {
        // return Optional.ofNullable(null);
        try {
            //Accesos
            return Optional.of("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.ofNullable("");
    }
}
