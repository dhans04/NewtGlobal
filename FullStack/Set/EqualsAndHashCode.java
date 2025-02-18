package org.studyeasy.Set;

import java.util.Objects;

class Code1 implements Comparable<Code2>{
    private  String sectionNo;
    private String lectureNo;

    public Code1(String sectionNo, String lectureNo) {
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
        return Objects.equals(sectionNo, code1.getSectionNo()) && Objects.equals(lectureNo, code1.getLectureNo());
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

public class EqualsAndHashCode {
    public static void main(String[] args) {
        String x1="Study";
        x1+="Easy";
        String x2="StudyEasy";

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x1=="StudyEasy");
        System.out.println(x1==x2);
        System.out.println(x1.equals(x2));

        System.out.println(x1.hashCode());
        System.out.println(x2.hashCode());

        Code2 code1=new Code2("01","01");
        Code2 code2 =new Code2("01","01");
        System.out.println(code1==code2);
        System.out.println(code1.equals(code2));
        System.out.println(code1.hashCode());
        System.out.println(code2.hashCode());
    }
}
