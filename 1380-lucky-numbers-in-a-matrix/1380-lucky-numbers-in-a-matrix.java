class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        var m = matrix.length;
	var n = matrix[0].length;
	var minRows = new int[m];
	var maxCols = new int[n];
	Arrays.fill(minRows, Integer.MAX_VALUE);
	Arrays.fill(maxCols, Integer.MIN_VALUE);
	findMinMax(matrix, m, n, minRows, maxCols);
	return findLucky(m, n, minRows, maxCols);
    }
    private void findMinMax(int[][] matrix, int m, int n, int[] minRows, int[] maxCols) {
	for (var i = 0; i < m; i++)
		for (var j = 0; j < n; j++) {
			minRows[i] = Math.min(minRows[i], matrix[i][j]);
			maxCols[j] = Math.max(maxCols[j], matrix[i][j]);
		}
}

private List<Integer> findLucky(int m, int n, int[] minRows, int[] maxCols) {
	for (var i = 0; i < m; i++)
		for (var j = 0; j < n; j++)
			if (minRows[i] == maxCols[j])
				return List.of(minRows[i]);
	return List.of();
}
}