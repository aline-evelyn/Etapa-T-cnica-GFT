public static void main(String[] args) {
    int veses = 1, quantidade = 1;
    
    while(quantidade <= 6){
        if(quantidade == 1){
            System.out.println(quantidade + " elefante incomoda muita gente!");
        }else{
            if(quantidade % 2 == 0){
                String incomodar = "";
                
                for(int i = 0; i < veses; i++){
                    incomodar += "incomodam ";
                }
                System.out.println(quantidade + " elefantes " + incomodar + "muito mais!");
               }else{
                System.out.println(quantidade + " elefantes incomodam muita gente!");
            }
        }
        quantidade++;
        veses++;
    }
}