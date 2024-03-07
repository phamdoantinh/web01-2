package VJU.web01;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hanghoa")
public class HangHoa {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long mahang;
    private String tenhang;
    private String dongia;
    private String soluong;
    private String ngay;
    protected HangHoa() {
    }

    public HangHoa(String tenhang, String dongia, String soluong, String ngay) 
    {
        this.tenhang=tenhang;
        this.dongia = dongia;
        this.soluong=soluong;
        this.ngay=ngay;
    }

    @Override
    public String toString() {
        return String.format(
                "{mahang=%d, tenhang='%s', dongia='%s',soluong='%s',ngay='%s'}",
                mahang, tenhang, dongia, soluong, ngay);
    }

    public Long getMahang() {
        return mahang;
    }

    public void setMahang(Long mahang) {
        this.mahang = mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public String getDongia() {
        return dongia;
    }

    public void setDongia(String dongia) {
        this.dongia = dongia;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    
}
