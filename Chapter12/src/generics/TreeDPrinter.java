package generics;
// 제네릭 클래스!
//Material 을 상속받은 클래스만 쓸 수 있도록 하여 재료에 제한을 건다
public class TreeDPrinter<T extends Material> {
	//재료가 플라스틱이든 파우더든 다 
	//material에 매핑된다
	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
}
