package monitoring.service;

import java.util.Date;

/**
 * @Author: Administrator
 * @Date: 2020/3/13 :15:13
 * @Description:iot平台设备
 */
public class DeviceDto  {

    /**
     * 主键Id
     */
    private Integer id;

    /**
     * 开发者Id
     */
    private Integer developerId;

    /**
     * 产品类型
     */
    private Integer productType;

    /**
     * 产品类型名称
     */
    private String productTypeName;

    /**
     * 所属企业Id
     */
    private Integer companyId;

    /**
     * 所属企业
     */
    private String companyName;

    /**
     * 手机号
     */
    private String telNum;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 设备编号
     */
    private String deviceSn;

    /**
     * 心跳间隔（工作）
     */
    private Integer heartWork;

    /**
     * 心跳间隔（空闲）
     */
    private Integer heartFree;

    /**
     * 监控内容（以逗号分隔,数据字典）
     */
    private String monitorIds;

    /**
     * 设备厂家
     */
    private String deviceVendor;

    /**
     * 设备品牌
     */
    private String deviceBrand;

    /**
     * 规格型号
     */
    private String specModel;

    /**
     * 接入时间
     */
    private Date enterTime;

    /**
     * 停用时间
     */
    private Date disableTime;

    /**
     * 状态 1离线(默认) 2在线 3异常 4停用
     */
    private Byte status;

    /**
     * 今日监控数量
     */
    private Integer monitorDataNum;

    /**
     * 创建人
     */
    private Integer createId;

    /**
     * 修改人
     */
    private Integer modifyId;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModify;

}

