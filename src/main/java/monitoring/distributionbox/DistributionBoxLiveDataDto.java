package monitoring.distributionbox;


import lombok.Data;

import java.util.Date;

/**
 * @Auther: 36560
 * @Date: 2020/2/29 :10:33
 * @Description:配电箱数据实时数据
 */
@Data
public class DistributionBoxLiveDataDto {

    /**
     * 设备号
     */
    private String deviceSn;

    /**
     * 数据源类型
     */
    private Integer dataSourceType;

    /**
     * A相电流(A)
     */
    private String electricA;

    /**
     * B相电流(A)
     */
    private String electricB;

    /**
     * C相电流(A)
     */
    private String electricC;

    /**
     * 剩余电流(mA)
     */
    private String electricSurplus;

    /**
     * A相温度(℃)
     */
    private String temperatureA;

    /**
     * B相温度(℃)
     */
    private String temperatureB;

    /**
     * C相温度(℃)
     */
    private String temperatureC;

    /**
     * 箱体温度(℃)
     */
    private String temperatureBox;


    /**
     * 数据时间
     */
    private Date dataTime;
}
