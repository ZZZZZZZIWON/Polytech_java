package miniproject;

public interface IShop {
	/*
	 setTitle : 쇼핑몰의 제목 달기
	 ================================
	 */
	 public abstract void setTitle(String title);
	 
	 /*
	 genUser : 사용자 정보 등록
	 =================================
	 */
	 public abstract void genUser();
	 
	 /*
	 genProduct : 상품 정보 등록
	 ==================================
	 */
	 public abstract void genProduct();
	 
	 /*
	 start : 쇼핑몰의 전체 기능을 위한 시나리오
	 ==================================
	 */
	 public abstract void start();
}
