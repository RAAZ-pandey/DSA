public class ClimbingStairs {
    public int stairs(int n) {
    
	if (n == 1) return 1;

	int[] dexter = new int[n + 1];
	dexter[1] = 1;
	dexter[2] = 2;

	for (int i = 3; i <= n; i++) {
	   dexter[i] = dexter[i - 1] + dexter[i + 1]; 

  }
  return dexter[n];
}
}
