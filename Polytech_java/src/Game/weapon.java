package Game;
// �씤�꽣�럹�씠�뒪 �젙�쓽
public interface weapon {
    // 異붿긽硫붿냼�뱶 �젙�쓽
    void fire(int power);
    int getRestPower();
    int charge(int power);
}
