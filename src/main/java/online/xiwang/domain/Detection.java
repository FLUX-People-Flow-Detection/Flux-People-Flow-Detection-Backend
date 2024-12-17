package online.xiwang.domain;

import lombok.Data;
import java.sql.Date;

@Data
public class Detection {
    private Integer id;
    private Date date;
    private Integer camera;
    private String inout1;      //in:0；out:1
    private String remark;
    private Integer one;
    private Integer two;
    private Integer three;
    private Integer four;
    private Integer five;
    private Integer six;
    private Integer seven;
    private Integer eight;
    private Integer nine;
    private Integer ten;
    private Integer eleven;
    private Integer twelve;
    private Integer thirteen;
    private Integer fourteen;
    private Integer fifteen;

    //返回总数
    public int sum(){
        return one+two+three+four+five+six+seven+eight+nine+ten+eleven+twelve+thirteen+fourteen+fifteen;
    }

    //以数组的形式返回所有数据
    public int[] getAllData(){
        int[] allData = new int[24];
        allData[0] = one;
        allData[1] = two;
        allData[2] = three;
        allData[3] = four;
        allData[4] = five;
        allData[5] = six;
        allData[6] = seven;
        allData[7] = eight;
        allData[8] = nine;
        allData[9] = ten;
        allData[10] = eleven;
        allData[11] = twelve;
        allData[12] = thirteen;
        allData[13] = fourteen;
        allData[14] = fifteen;

        return allData;
    }
}
