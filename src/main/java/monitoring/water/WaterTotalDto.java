package monitoring.water;

import lombok.Data;

import java.util.Date;

/**
 * @Author: Administrator
 * @Date: 2020/3/3 :16:52
 * @Description:用电总量
 */
@Data
public class WaterTotalDto {

    /**
     * 总电量
     */
    private float total;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

}
