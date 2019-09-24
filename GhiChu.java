package baiKiemTra;

import java.sql.SQLOutput;

public class GhiChu {
    private String maGC;
    private String tieuDe;
    private String thoiGian;
    private String diaDiem;

    public void hienThi(){
        System.out.println("MÃ ghi chú : " + maGC);
        System.out.println("Tiêu đề : " + tieuDe);
        System.out.println("Thời gian : "+ thoiGian);
        System.out.println("Địa điểm : "  + diaDiem);
    }
}
