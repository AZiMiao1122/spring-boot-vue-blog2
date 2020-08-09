package com.iszhouhua.blog.common.storage;

import com.iszhouhua.blog.common.storage.group.AliyunGroup;
import com.iszhouhua.blog.common.storage.group.LocalGroup;
import com.iszhouhua.blog.common.storage.group.QcloudGroup;
import com.iszhouhua.blog.common.storage.group.QiniuGroup;
import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 存储配置信息
 */
@Data
public class StorageConfig {

    /**
     * @see com.iszhouhua.blog.common.constant.StorageType
     * 类型 1：七牛云  2：阿里云  3：腾讯云  4：本地
     */
    @Range(min=1, max=4, message = "类型错误")
    private Integer type;

    /**
     *七牛绑定的域名
     */
    @NotBlank(message="七牛绑定的域名不能为空", groups = QiniuGroup.class)
    @URL(message = "七牛绑定的域名格式不正确", groups = QiniuGroup.class)
    private String qiniuDomain;
    /**
     * 七牛路径前缀
     */
    private String qiniuPrefix;
    /**
     * 七牛ACCESS_KEY
     */
    @NotBlank(message="七牛AccessKey不能为空", groups = QiniuGroup.class)
    private String qiniuAccessKey;
    /**
     * 七牛SECRET_KEY
     */
    @NotBlank(message="七牛SecretKey不能为空", groups = QiniuGroup.class)
    private String qiniuSecretKey;
    /**
     * 七牛存储空间名
     */
    @NotBlank(message="七牛空间名不能为空", groups = QiniuGroup.class)
    private String qiniuBucketName;

    /**
     * 阿里云绑定的域名
     */
    @NotBlank(message="阿里云绑定的域名不能为空", groups = AliyunGroup.class)
    @URL(message = "阿里云绑定的域名格式不正确", groups = AliyunGroup.class)
    private String aliyunDomain;
    /**
     * 阿里云路径前缀
     */
    private String aliyunPrefix;
    /**
     * 阿里云EndPoint
     */
    @NotBlank(message="阿里云EndPoint不能为空", groups = AliyunGroup.class)
    private String aliyunEndPoint;
    /**
     * 阿里云AccessKeyId
     */
    @NotBlank(message="阿里云AccessKeyId不能为空", groups = AliyunGroup.class)
    private String aliyunAccessKeyId;
    /**
     * 阿里云AccessKeySecret
     */
    @NotBlank(message="阿里云AccessKeySecret不能为空", groups = AliyunGroup.class)
    private String aliyunAccessKeySecret;
    /**
     * 阿里云BucketName
     */
    @NotBlank(message="阿里云BucketName不能为空", groups = AliyunGroup.class)
    private String aliyunBucketName;

    /**
     * 腾讯云绑定的域名
     */
    @NotBlank(message="腾讯云绑定的域名不能为空", groups = QcloudGroup.class)
    @URL(message = "腾讯云绑定的域名格式不正确", groups = QcloudGroup.class)
    private String qcloudDomain;
    /**
     * 腾讯云路径前缀
     */
    private String qcloudPrefix;
    /**
     * 腾讯云AppId
     */
    @NotNull(message="腾讯云AppId不能为空", groups = QcloudGroup.class)
    private Integer qcloudAppId;
    /**
     * 腾讯云SecretId
     */
    @NotBlank(message="腾讯云SecretId不能为空", groups = QcloudGroup.class)
    private String qcloudSecretId;
    /**
     * 腾讯云SecretKey
     */
    @NotBlank(message="腾讯云SecretKey不能为空", groups = QcloudGroup.class)
    private String qcloudSecretKey;
    /**
     * 腾讯云BucketName
     */
    @NotBlank(message="腾讯云BucketName不能为空", groups = QcloudGroup.class)
    private String qcloudBucketName;
    /**
     * 腾讯云COS所属地区
     */
    @NotBlank(message="所属地区不能为空", groups = QcloudGroup.class)
    private String qcloudRegion;

    /**
     * 本地存储目录
     */
    @NotBlank(message="本地存储路径不能为空", groups = LocalGroup.class)
    private String localDirectory;
    /**
     * 本地路径前缀
     */
    private String localPrefix;
    /**
     * 本地目录映射的域名
     */
    @NotBlank(message="本地目录映射的域名不能为空", groups = LocalGroup.class)
    @URL(message = "本地目录映射的域名格式不正确", groups = LocalGroup.class)
    private String localDomain;
}
