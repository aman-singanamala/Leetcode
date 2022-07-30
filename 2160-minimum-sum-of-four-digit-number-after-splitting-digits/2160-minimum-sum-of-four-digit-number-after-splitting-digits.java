class Solution {
    public int minimumSum(int num) {
        List<Integer> record = new ArrayList<>();
        while (num > 0) {
            record.add(num % 10);
            num /= 10;
        }
        Collections.sort(record);

        return (record.get(0) + record.get(1)) * 10 + record.get(2) + record.get(3);
    }
}