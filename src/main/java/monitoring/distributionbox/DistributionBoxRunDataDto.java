package monitoring.distributionbox;

import lombok.Data;

import java.util.Date;

/**
 * @Author: Administrator
 * @Date: 2020/3/10 :18:19
 * @Description:
 */
@Data
public class DistributionBoxRunDataDto {

    /**
     * 厂商类型
     */
    private Integer dataSourceType;

    /**
     * 设备编号
     */
    private String deviceSn;

    /**
     * 开始时间
     */
    private long startTime;

    /**
     * 结束时间
     */
    private long endTime;

    /**
     * 每页大小
     */
    private Integer pageSize;

    /**
     * 页码
     */
    private Integer pageNum;
}
