class Solution {
    public int removeDuplicates(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    for (int num : nums) {
        seen.add(num);
    }

    List<Integer> unique = new ArrayList<>(seen);
    Collections.sort(unique);

    for (int i = 0; i < unique.size(); i++) {
        nums[i] = unique.get(i);
    }

    return unique.size();
}
}