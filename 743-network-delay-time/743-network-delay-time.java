class Solution {
    public int networkDelayTime(int[][] times, int N, int K) {
        Map<Integer, List<int[]>> adjacencyMap = new HashMap<>();
        for (int[] edge : times) {
            adjacencyMap.putIfAbsent(edge[0], new ArrayList<>());
            adjacencyMap.get(edge[0]).add(new int[]{edge[1], edge[2]});
        }
        
        Queue<int[]> heap = new PriorityQueue<>(
            (e1, e2) -> Integer.compare(e1[1], e2[1]));
        heap.offer(new int[]{K, 0});
        Map<Integer, Integer> distanceByNode = new HashMap<>();
        
        int elapsedTime = 0;
        while (!heap.isEmpty()) {
            int[] current = heap.poll();
            int node = current[0], distance = current[1];
            if (distanceByNode.containsKey(node)) continue;
            elapsedTime = Math.max(elapsedTime, distance);
            distanceByNode.put(node, distance);
            if (!adjacencyMap.containsKey(node)) continue;
            for (int[] edge : adjacencyMap.get(node)) {
                int neighbour = edge[0], weight = edge[1];
                if (distanceByNode.containsKey(neighbour)) continue;
                heap.offer(new int[]{neighbour, distance+weight});
            }
        }
        return distanceByNode.size() != N ? -1 : elapsedTime;
    }
}