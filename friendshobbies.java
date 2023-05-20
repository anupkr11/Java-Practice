public class friendshobbies {
    public static void main(String[] args) {

        String names[]=new String[]{"Rahul","Mohan","Sohan","Harry"} ;

   

        String twoD[][];

        twoD= new String[4][];

        twoD[0] = new String[]{"Watching Movies","Coding","Cycling"};

        twoD[1] = new String[]{"Reading books","Playing Games"};

        twoD[2] = new String[]{"Reading Books","Travelling"};

        twoD[3] = new String[]{"Playing Games","Coding"};



        for(int i=0;i<twoD.length; i++){

            for(int j=0; j<twoD[i].length; j++ ){

                if(twoD[i][j]=="Reading books"){

                System.out.println(names[i]+"");

                }

            }

        }

    }

}