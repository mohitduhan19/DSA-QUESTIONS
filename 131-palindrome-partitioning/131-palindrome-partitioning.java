class Solution {
 public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
		partition(s, 0, ans, new ArrayList<>());
		return ans;
	}

	private void partition(String s, int idx, List<List<String>> ans, List<String> list) {
		if (idx == s.length()) {
			ans.add(new ArrayList<>(list));
			return;
		}
		for (int i = idx; i < s.length(); i++) {
			if (isPalindrome(s, idx, i)) {
				list.add(s.substring(idx, i + 1));
				partition(s, i + 1, ans, list);
				list.remove(list.size() - 1);
			}
		}
	}

	private boolean isPalindrome(String s, int l, int r) {
		while (l < r) {
			if (s.charAt(l) != s.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}
