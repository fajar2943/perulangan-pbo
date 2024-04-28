class Main{
	public static void main(String[] arg){
		String[] matkul = {"Matematika", "Fisika", "PBO", "Jarkom", "PPB"};

        for(int i = 0; i < matkul.length; i++) {
            System.out.println("Mata kuliah ke-" + (i+1) + " adalah " + matkul[i]);
        }
	}
}