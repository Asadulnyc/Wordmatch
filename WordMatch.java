public class WordMatch {
    private String secret;
    
    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess) {
        int count = 0;
        for (int i = 0; i<=secret.length()-guess.length(); i++) {
            if (secret.substring(i, i+guess.length()).equals(guess)) {
                count++;
            }
        }
        return count * guess.length() * guess.length();
    }

    public String findBetterGuess(String guess1, String guess2) {
        int one = scoreGuess(guess1);
        int two = scoreGuess(guess2);
        if (one>two) return guess1;
        else if (two>one) return guess2;
        else if (guess1.compareTo(guess2)>0) return guess1;
        else return guess2;
    }
}