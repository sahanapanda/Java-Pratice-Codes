class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        List<int[]>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            g[e[0]].add(new int[] {e[1], e[2]});
        }

        int[][] dis = new int[n][k + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dis[i], Integer.MAX_VALUE);
        }

        // Priority queue stores: {distance, node, consecutive count}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        dis[0][1] = 0;
        pq.offer(new int[] {0, 0, 1});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int d = curr[0];
            int x = curr[1];
            int cnt = curr[2];

            if (d > dis[x][cnt]) {
                continue;
            }
            if (x == n - 1) {
                return d;
            }

            for (int[] neighbor : g[x]) {
                int y = neighbor[0];
                int w = neighbor[1];
                int newCnt = labels.charAt(x) == labels.charAt(y) ? cnt + 1 : 1;

                if (newCnt <= k && d + w < dis[y][newCnt]) {
                    dis[y][newCnt] = d + w;
                    pq.offer(new int[] {d + w, y, newCnt});
                }
            }
        }

        return -1;
    }
}Shortest Path With At Most K Consecutive Identical Characters
