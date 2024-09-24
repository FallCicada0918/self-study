package chapter02;

class Datatype_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char chinaWord ='好',KoreanWord='좋';
        char you='\u4F60';
        int position =20320;
        System.out.println("汉字:"+chinaWord+"的位置:"+(int)chinaWord);
        System.out.println("韩文:"+KoreanWord+"的位置:"+(int)KoreanWord);
        System.out.println(position+"位置上的字符是:"+(char)position);
        position =21319;
        System.out.println(position+"位置上的字符是:"+(char)position);
        System.out.println("you:"+you);

    }

}
