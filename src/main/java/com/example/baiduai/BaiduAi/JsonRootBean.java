package com.example.baiduai.BaiduAi;






import lombok.Data;

import java.util.List;


/*
{"person_num":1,"person_info":[{"body_parts":{"nose":{"score":0.6138161420822144,"x":130.3925933837891,"y":267.3652343750},"right_knee":{"score":0.3715029656887054,"x":511.1347656250,"y":457.7363281250},"left_hip":{"score":0.4745719432830811,"x":504.0839843750,"y":373.1269531250},"right_ankle":{"score":0.4535332322120667,"x":680.3535156250,"y":450.6855468750},"right_wrist":{"score":0.5419049859046936,"x":186.7988433837891,"y":457.7363281250},"left_eye":{"score":0.6671977043151855,"x":123.3418197631836,"y":253.2636718750},"left_mouth_corner":{"score":0.3511381149291992,"x":151.5449371337891,"y":274.4160156250},"right_elbow":{"score":0.3570826351642609,"x":250.2558746337891,"y":380.1777343750},"left_knee":{"score":0.6204069256782532,"x":475.8808593750,"y":507.0917968750},"neck":{"score":0.8293593525886536,"x":186.7988433837891,"y":232.1113433837891},"top_head":{"score":0.8325073719024658,"x":88.08791351318359,"y":189.8066558837891},"right_ear":{"score":0.6632804870605469,"x":165.6464996337891,"y":182.7558746337891},"left_ear":{"score":0.7528665065765381,"x":130.3925933837891,"y":246.2128906250},"left_elbow":{"score":0.5952076911926270,"x":215.0019683837891,"y":401.3300781250},"right_shoulder":{"score":0.6383019089698792,"x":250.2558746337891,"y":189.8066558837891},"right_eye":{"score":0.5229575037956238,"x":123.3418197631836,"y":253.2636718750},"right_mouth_corner":{"score":0.3023450076580048,"x":144.4941558837891,"y":267.3652343750},"left_ankle":{"score":0.4818022847175598,"x":701.5058593750,"y":464.7871093750},"right_hip":{"score":0.5904084444046021,"x":567.5410156250,"y":302.6191406250},"left_wrist":{"score":0.8243416547775269,"x":193.8496246337891,"y":478.8886718750},"left_shoulder":{"score":0.6999466419219971,"x":207.9511871337891,"y":309.6699218750}},"location":{"score":0.9963594079017639,"top":136.9134216308594,"left":62.01943588256836,"width":722.6400756835938,"height":438.8751220703125}}],"log_id":1484087512254608268}

 */
public class JsonRootBean {

    private Integer person_num;
    private List<Person_Info>  person_info;

    public Integer getPerson_num() {
        return person_num;
    }

    public void setPerson_num(Integer person_num) {
        this.person_num = person_num;
    }

    public List<Person_Info> getPerson_info() {
        return person_info;
    }

    public void setPerson_info(List<Person_Info> person_info) {
        this.person_info = person_info;
    }
}
@Data
class Person_Info{
    private body_parts body_parts;



}
@Data
class body_parts{
    private right_knee right_knee;

    private left_knee left_knee;
}
class right_knee{
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    private Double score;
    private Double x;
    private Double y;
}
class left_knee{
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    private Double score;
    private Double x;
    private Double y;
}