package com.mycompany.ethereumapi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigInteger;

@Data
public class DeployContractDto {

    @ApiModelProperty(example = "123")
    @NotNull
    @NotEmpty
    private String password;

    @ApiModelProperty(position = 2, example = "/path/to/UTC...")
    @NotNull
    @NotEmpty
    private String file;

    @ApiModelProperty(position = 3, example = "1")
    @NotNull
    @Positive
    private BigInteger gasPrice;

    @ApiModelProperty(position = 4, example = "3000000")
    @NotNull
    @Positive
    private BigInteger gasLimit;

}