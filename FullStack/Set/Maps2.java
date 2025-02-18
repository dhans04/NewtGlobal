package org.studyeasy.Set;

import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code2>{
    private  String sectionNo;
    private String lectureNo;

    public Code(String sectionNo, String lectureNo) {
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
public class Maps2 {
    public static void main(String[] args) {
        Map<Code2,String> map=new TreeMap<>();
        map.put(new Code2("S10","13"),"Dhans");
        map.put(new Code2("S9","12"),"Dhivya");
        map.put(new Code2("S11","16"),"Anu");
        map.put(new Code2("S12","14"),"Lava");
        map.put(new Code2("S13","11"),"Priya");
        System.out.println(map);
    }
}
