package com.qx.sf.build.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.qx.sf.build.utils.encrypt.EncryptType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author xqq
 * @since 2021-11-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ALL_USER_INFO")
public class AllUserInfo extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 机构ID
     */
    @TableField("OFFICE_ID")
    private String officeId;

    /**
     * 用户ID(12位序列，前面补0，表唯一)
     */
    @TableField("USER_ID")
    private String userId;

    /**
     * 真实姓名
     */
    @TableField("REAL_NAME")
    private EncryptType realName;

    /**
     * 证件类型：00-身份证
     */
    @TableField("CERT_TYPE")
    private String certType;

    /**
     * 证件号码
     */
    @TableField("CERT_ID")
    private EncryptType certId;

    /**
     * 实名验证状态：0-未验证；1-已验证
     */
    @TableField("REAL_NAME_STATE")
    private String realNameState;

    /**
     * 实名认证时间
     */
    @TableField("REAL_NAME_TIME")
    private LocalDateTime realNameTime;

    /**
     * 电子邮箱
     */
    @TableField("EMAIL")
    private EncryptType email;

    /**
     * 手机号码
     */
    @TableField("MOBILE_PHONE")
    private EncryptType mobilePhone;

    /**
     * 联系姓名
     */
    @TableField("CONTACT_NAME")
    private EncryptType contactName;

    /**
     * 联系人关系(字典contact_relation_ship)
     */
    @TableField("CONTACT_RELATION_SHIP")
    private String contactRelationShip;

    /**
     * 联系人手机号
     */
    @TableField("CONTACT_PHONE")
    private EncryptType contactPhone;

    /**
     * 学历(字典edu)
     */
    @TableField("EDU")
    private String edu;

    /**
     * 单位名称
     */
    @TableField("COMP_NAME")
    private String compName;

    /**
     * 婚姻状况(字典marriage：1 已婚 2 未婚 3 离异 4 其它)
     */
    @TableField("MARRIAGE")
    private String marriage;

    /**
     * 单位地址
     */
    @TableField("UNIT_ADDRESS")
    private String unitAddress;

    /**
     * 居住地址
     */
    @TableField("ADDRESS")
    private String address;

    /**
     * 行业（字典industry）
     */
    @TableField("INDUSTRY")
    private String industry;

    /**
     * 居住情况
     */
    @TableField("LIVING_CONDITION")
    private String livingCondition;

    /**
     * 收入区间(字典in_come_range)
     */
    @TableField("IN_COME_RANGE")
    private String inComeRange;

    /**
     * 用户来源（字典user_source）
     */
    @TableField("USER_SOURCE")
    private String userSource;

    /**
     * 埋点信息
     */
    @TableField("BURYING_POINT")
    private String buryingPoint;

    @TableField("PLAT_SOURCE")
    private String platSource;

    /**
     * 用户扩展信息
     */
    @TableField("OTHER_INFO")
    private String otherInfo;

    /**
     * 激活状态：0-待激活，1：正常，2：注销
     */
    @TableField("ACTIVE_STATUS")
    private String activeStatus;

    /**
     * 实名银行卡号
     */
    @TableField("REAL_ACCT_NO")
    private EncryptType realAcctNo;

    /**
     * 联系人身份证号
     */
    @TableField("CONTACT_CERT_ID")
    private EncryptType contactCertId;

    /**
     * 推荐人手机号
     */
    @TableField("REFERRER_PHONE")
    private EncryptType referrerPhone;

    /**
     * 推荐人姓名
     */
    @TableField("REFERRER_NAME")
    private EncryptType referrerName;

    /**
     * 证件号码脱敏
     */
    @TableField("CERT_ID_FUZZY")
    private String certIdFuzzy;

    /**
     * 手机号码脱敏
     */
    @TableField("MOBILE_PHONE_FUZZY")
    private String mobilePhoneFuzzy;

    /**
     * 实名银行卡号脱敏
     */
    @TableField("REAL_ACCT_NO_FUZZY")
    private String realAcctNoFuzzy;

    /**
     * 联系人身份证号脱敏
     */
    @TableField("CONTACT_CERT_ID_FUZZY")
    private String contactCertIdFuzzy;

    /**
     * 联系人手机号脱敏
     */
    @TableField("CONTACT_PHONE_FUZZY")
    private String contactPhoneFuzzy;

    /**
     * 推荐人手机号脱敏
     */
    @TableField("REFERRER_PHONE_FUZZY")
    private String referrerPhoneFuzzy;

    /**
     * 姓名脱敏
     */
    @TableField("REAL_NAME_FUZZY")
    private String realNameFuzzy;

    /**
     * 联系人姓名脱敏
     */
    @TableField("CONTACT_NAME_FUZZY")
    private String contactNameFuzzy;

    @TableField("REFERRER_NAME_FUZZY")
    private String referrerNameFuzzy;


}
