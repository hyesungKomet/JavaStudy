package generics;
// ���׸� Ŭ����!
//Material �� ��ӹ��� Ŭ������ �� �� �ֵ��� �Ͽ� ��ῡ ������ �Ǵ�
public class TreeDPrinter<T extends Material> {
	//��ᰡ �ö�ƽ�̵� �Ŀ���� �� 
	//material�� ���εȴ�
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