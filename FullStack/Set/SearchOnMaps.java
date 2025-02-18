package org.studyeasy.Set;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Code2 implements Comparable<Code2>{
    private  String sectionNo;
    private String lectureNo;

    public Code2(String sectionNo, String lectureNo) {
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    public String getLectureNo() {
        return lectureNo;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Code2 code1 = (Code2) object;
        return Objects.equals(sectionNo, code1.sectionNo) && Objects.equals(lectureNo, code1.lectureNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sectionNo, lectureNo);
    }

    @Override
    public String toString() {
        return "Code{" +
                "sectionNo='" + sectionNo + '\'' +
                ", lectureNo='" + lectureNo + '\'' +
                '}';
    }

    public int compareTo(Code2 o){
        String code1=sectionNo.concat(lectureNo);
        String code2=o.getSectionNo().concat(o.getLectureNo());
        return code1.compareTo(code2);
    }
}
public class SearchOnMaps {
    public static void main(String[] args) {
        Map<Code2,String> map=new TreeMap<>();
        map.put(new Code2("S11","11"),"Dhans");
        map.put(new Code2("S11","22"),"Dhivs");
        map.put(new Code2("S11","00"),"Anu");
        map.put(new Code2("S10","90"),"Priya");

        Code2 code=null;
        for(Code2 key: map.keySet()){
            if(map.get(key).equals("dhivs")){
                code=key;
                break;
            }
        }
        System.out.println(code);
    }
}
