package com.example.sqltest.vo;


import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(callSuper = false)
public class SwaggerTest {

    /**
     * 用户id 必传
     */
    @ApiModelProperty(value = "用户id", example = "000001", required = true)
    private String id;

    /**
     * 首页类型 必传   0 首页  1 产品  2 服务  3 我的  4主题
     */
    @ApiModelProperty(value = "首页类型", example = "0", required = true)
    private String homeType;

    /**
     * 版本号
     */
    @ApiModelProperty(value = "版本号", example = "0", required = true)
    private String version;
}
