
public class ScoreCalculator {
	public static void main(String[] args) {
		// 숫자 게임 점수 계산하기
		int score = 50;
		int user;
		System.out.printf("초기 점수: " + score);
		System.out.println();
		
		score += 10;
		System.out.printf("정답 보너스 (+10):" + score);
		System.out.println();
		
		score -= 5;
		System.out.printf("오답 감점 (-5):" + score);
		System.out.println();
		
		score *= 2;
		System.out.printf("보너스 문제 정답 (x2):" + score*2);
		System.out.println();
		System.out.printf("추가 점수 (+1):" + ++score);
		System.out.println();
		System.out.printf("감점 (-1):" + --score);
		System.out.println();
		System.out.printf("최종 점수:" + score);
	}
}
