package programmers.test;

class PG_178871 {
    public String[] solution(String[] players, String[] callings) {

        for (int i = 0; i < callings.length; i++) {
            for (int j = 0; j < players.length; j++) {
                if (players[j].equals(callings[i]) && j != 0) {
                    String temp = players[j];
                    players[j] = players[j - 1];
                    players[j - 1] = temp;
                    break;
                }
            }
        }
        return players;
    }
}
