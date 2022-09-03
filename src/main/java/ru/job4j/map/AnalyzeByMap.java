package ru.job4j.map;

import java.util.List;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double rsl = 0;
        int quantity = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                quantity++;
                rsl += subject.score();
            }
        }
        return quantity == 0 ? 0 : rsl / quantity;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        return List.of();
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        return List.of();
    }

    public static Label bestStudent(List<Pupil> pupils) {
        return null;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        return null;
    }
}