package Collection_Search;

import java.util.Stack;

/**
 * Stack 클래스는 LIFO 자료구조를 구현한 클래스이다.
 * LIFO는 Last In First Out 으로 나중에 넣은 객체가 먼저 빠져나가는 자료구조이다.
 * 
 * push(E item) : 주어진 객체를 스택에 넣는다.
 * peek() : 스택의 맨 위 객체를 가져온다. 객체를 스택에서 제거하지 않는다.
 * pop() : 스택의 맨 위 객체를 가져온다. 객체를 스택에서 제거한다.
 * 
 * @author akjak
 *
 */
public class StackEx {

	public static void main(String[] args) {
		Stack<Coin> coinStack = new Stack<Coin>();

		coinStack.push(new Coin(100));
		coinStack.push(new Coin(50));
		coinStack.push(new Coin(500));
		coinStack.push(new Coin(10));

		while (!coinStack.isEmpty()) {
			Coin coin = coinStack.pop(); // 제일 위의 객체를 꺼내오고, 스택에서 제거한다.
			System.out.println("꺼내온 동전 : " + coin.getValue()); // 넣은 순서의 반대로 출력된다.
		}

	}

}
