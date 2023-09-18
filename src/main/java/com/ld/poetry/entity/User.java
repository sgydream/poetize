package com.ld.poetry.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author sara
 * @since 2021-09-14
 */
@Data
@ApiModel(value = "用户", description = "用户实体类")
@EqualsAndHashCode(callSuper = false)
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @ApiModelProperty(name="用户ID(id)", example = "1")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    @ApiModelProperty(name = "用户名称(username)", example = "uni")
    @TableField("username")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(name = "用户密码(password)", example = "123456")
    @TableField("password")
    private String password;

    /**
     * 手机号
     */
    @ApiModelProperty(name = "用户手机号(phone)", example = "123456")
    @TableField("phone_number")
    private String phoneNumber;

    /**
     * 用户邮箱
     */
    @ApiModelProperty(name = "用户邮箱(email)", example = "123456")
    @TableField("email")
    private String email;

    /**
     * 是否启用[0:否，1:是]
     */
    @TableField("user_status")
    private Boolean userStatus;

    /**
     * 性别[1:男，2:女，0:保密]
     */
    @ApiModelProperty(name = "用户性别(gender)", example = "123456")
    @TableField("gender")
    private Integer gender;

    /**
     * openId
     */
    @TableField("open_id")
    private String openId;

    /**
     * 头像
     */
    @TableField("avatar")
    private String avatar;

    /**
     * 赞赏
     */
    @TableField("admire")
    private String admire;

    /**
     * 简介
     */
    @TableField("introduction")
    private String introduction;

    /**
     * 用户类型[0:admin，1:管理员，2:普通用户]
     */
    @TableField("user_type")
    private Integer userType;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 最终修改时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 最终修改人
     */
    @TableField(value = "update_by", fill = FieldFill.UPDATE)
    private String updateBy;

    /**
     * 是否启用[0:未删除，1:已删除]
     */
    @TableField("deleted")
    @TableLogic
    private Boolean deleted;


}
