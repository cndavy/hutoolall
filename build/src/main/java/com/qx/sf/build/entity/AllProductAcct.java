package com.qx.sf.build.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户产品额度表
 * </p>
 *
 * @author xqq
 * @since 2021-11-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ALL_PRODUCT_ACCT")
public class AllProductAcct extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 机构ID
     */
    @TableField("OFFICE_ID")
    private String officeId;

    /**
     * 用户ID
     */
    @TableField("USER_ID")
    private String userId;

    /**
     * 父级ID
     */
    @TableField("PARENT_ID")
    private String parentId;

    /**
     * 所有父级ID
     */
    @TableField("PARENT_IDS")
    private String parentIds;

    /**
     * 产品编号ALL_PRODUCT.PRODUCT_CODE
     */
    @TableField("PRODUCT_CODE")
    private String productCode;

    /**
     * 总信用额度
     */
    @TableField("CREDIT_LIMIT")
    private Double creditLimit;

    /**
     * 已使用额度
     */
    @TableField("CREDIT_LIMIT_USED")
    private Double creditLimitUsed;

    /**
     * 可用额度
     */
    @TableField("CREDIT_LIMIT_BALANCE")
    private Double creditLimitBalance;

    /**
     * 激活日期
     */
    @TableField("ACTIVE_DATE")
    private LocalDateTime activeDate;

    /**
     * 失效日期
     */
    @TableField("EXPIRY_DATE")
    private LocalDateTime expiryDate;

    /**
     * 账户状态：1：准入准出2：止入止出3：准入止出4：止入准出
     */
    @TableField("ACCT_STATUS")
    private String acctStatus;

    /**
     * 账户ID
     */
    @TableField("ACCOUNT_ID")
    private String accountId;

    /**
     * 风控方(字典risk_control：01众安，02中金白名单，03银商)
     */
    @TableField("RISK_CONTROL")
    private String riskControl;

    /**
     * 关联应用
     */
    @TableField("RELATION_USE")
    private String relationUse;

    /**
     * 冻结日期
     */
    @TableField("FROZEN_DATE")
    private LocalDateTime frozenDate;

    /**
     * 溢缴款
     */
    @TableField("OVER_PAY_AMT")
    private Double overPayAmt;

    /**
     * 注销时间
     */
    @TableField("LOG_OUT_DATE")
    private LocalDateTime logOutDate;

    /**
     * 协议升级标识（0-未升级 1-已升级）
     */
    @TableField("PROTOCOL_UPDATE_FLAG")
    private String protocolUpdateFlag;


}
