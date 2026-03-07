// In a laboratory, there are two test tubes containing different quantities of a chemical solution. The first test tube contains A ml of solution and the second contains B ml of solution.
// The lab assistant wants to divide both solutions into the largest possible equal-sized portions such that:
// - Each portion has the same volume.
// - No solution is left unused in either test tube

// Your task is to determine the maximum possible volume (in ml) of each portion.


int solve(int a,int b){
    if(a==0) return b;
    return solve(b%a,a);
}
