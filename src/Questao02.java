import java.util.stream.Stream;

public class Questao02 {
    public static void main(String[] args) {
        System.out.println(findLetterAOccurrence("O rato roeu a roupa do rei de roma")); // 4
        System.out.println(findLetterAOccurrence("Um belo vôo")); // 0
        System.out.println(findLetterAOccurrence("Exemplos: A, B e C")); // 1
    }

    public static String findLetterAOccurrence(String str) {
        long aCount = Stream.of(str.split(""))
                .filter(word -> word.equalsIgnoreCase("a"))
                .count();
        return "A letra 'a' aparece um total de %d vez(es) ao longo da string".formatted(aCount);
    }
}