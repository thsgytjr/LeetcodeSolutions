import java.util.List;

public class FileSearch {

    public String solution(String S){
        String[] files = S.split("\\s+");
        String result;
        String ext=null;
        int music=0;
        int images=0;
        int movies=0;
        int other=0;


        for (int i=0; i<files.length;i++) {
            if (i % 2 == 0) {
                ext = files[i].substring(files[i].length() - 4);
//                System.out.println(ext);
            } else {
                files[i] = files[i].replace("b", "");
                if (ext.contains(".mp3") || ext.contains("flac") || ext.contains("aac")) {
//                    System.out.println(files[i]);
                    music += Integer.parseInt(files[i]);
                }else if (ext.contains(".jpg") || ext.contains(".bmp") || ext.contains(".gif")){
                    images += Integer.parseInt(files[i]);
                }else if (ext.contains(".mp4") || ext.contains(".avi") || ext.contains("mkv")){
                    movies += Integer.parseInt(files[i]);
                }else{
                    other += Integer.parseInt(files[i]);
                }
//            System.out.println(ext);
            }
        }
        result = ("music "+music+"b\n"+
                "images "+images+"b\n"+
                "movies "+movies+"b\n"+
                "other "+other+"b");

        return result;
    }

    public static void main(String[] args) {
        FileSearch fs = new FileSearch();
        System.out.println(fs.solution("my.song.mp3 100b\n" +
                "greatSong.flac 1000b\n" +
                "not3.txt 5b\n" +
                "video.mp4 200b\n" +
                "game.exe 100b\n" +
                "mov!e.mkv 10000b"));

//        String music = "my.song.mp3";
//        String ext = music.substring(music.length()-4);
//        System.out.println(0%2);
    }

}
