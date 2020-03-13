package monitoring.service;

import lombok.Data;

/**
 * @Author: Administrator
 * @Date: 2020/3/13 :12:55
 * @Description:iot平台反向注册接口
 */
@Data
public class ProductDeviceBo {
    /**
     * 产品类型
     */
    private Integer productType;

    /**
     * 设备编码
     */
    private String deviceSn;

    /**
     * 设备名称
     */
    private String productName;
}
