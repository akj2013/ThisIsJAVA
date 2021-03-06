package Generic;

/**
 * 멀티 타입 파라미터를 가진 클래스
 * 
 * @author akjak
 *
 */
public class Product<T, M> {
	private T kind;
	private M model;

	public T getKind() {
		return this.kind;
	}

	public M getModel() {
		return this.model;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public void setModel(M model) {
		this.model = model;
	}
}
