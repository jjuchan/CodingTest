package programmers.test2;

import java.util.Map;

class PG_178871 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> player = new java.util.HashMap<>();
        for (int i = 0; i < players.length; i++) {
            player.put(players[i], i);
        }
        for (String call : callings) {
            int index = player.get(call);

            if (index > 0) {
                String temp = players[index - 1];
                players[index - 1] = players[index];
                players[index] = temp;

                player.put(call, index - 1);
                player.put(temp, index);
            }
        }

        return players;
    }
}
