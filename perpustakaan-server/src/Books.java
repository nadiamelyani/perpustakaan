public class Books implements java.io.Serializable {
	private String id_data, penerbit, judul, pengarang;
	private int stok, batas_peminjaman;
	
	public String getId() {
		return id_data;
	}
	
	public String getPenerbit() {
		return penerbit;
	}
	
	public String getJudul() {
		return judul;
	}
	
	public String getPengarang() {
		return pengarang;
	}
	
	public int getStok() {
		return stok;
	}
	
	public int getBatasPeminjaman() {
        return batas_peminjaman;
    }

    public void setId(String d_id){
        id_data = d_id;
    }
    
    public void setPenerbit(String d_penerbit){
        penerbit = d_penerbit;
    }

    public void setJudul(String d_judul){
        judul = d_judul;
    }

    public void setPengarang(String d_pengarang){
        pengarang = d_pengarang;
    }
    
    public void setStok(int d_stok){
        stok = d_stok;
    }

    public void setBatasPeminjam(int d_batas_peminjam){
        batas_peminjaman = d_batas_peminjam;
    }



}