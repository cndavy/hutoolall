package com.qx.sf.build.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author xqq
 * @date 2021/11/17
 **/
@Data
@Accessors(chain = true)
public class BaseEntity {

    /**
     * ID
     */
    @TableId(value = "ID", type = IdType.ASSIGN_UUID)
    public String id;

    /**
     * 创建时间
     */
    @TableField(value = "CREATE_TIME", fill = FieldFill.INSERT)
    public Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "UPDATE_TIME", fill = FieldFill.INSERT_UPDATE)
    public Date updateTime;

    /**
     * 创建者
     */
    @TableField(value = "CREATE_BY", fill = FieldFill.INSERT)
    public Date createBy;

    /**
     * 更新者
     */
    @TableField(value = "UPDATE_BY", fill = FieldFill.INSERT_UPDATE)
    public Date updateBy;

    /**
     * 删除标志:0-未删除；1-已删除
     */
    @TableField(value = "DEL_FLAG", fill = FieldFill.INSERT)
    private String delFlag;

    /**
     * 备注信息
     */
    @TableField(value = "REMARKS", fill = FieldFill.INSERT)
    private String remarks;

}


