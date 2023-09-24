package com.example.demo.domain.model;

import javax.validation.GroupSequence;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserForm{

	@NotBlank(message = "名前を入力してください", groups = Group1.class )
	@Size(min = 1, max = 20, message = "名前を20字以内で入力して下さい", groups = Group2.class)
	private String name;

	@Email(message = "Emailを正しい形式で入力してください", groups = Group1.class)
    private String email;

	@NotNull(message = "年齢を入力してください", groups = Group1.class)
	@Min(value = 0, message = "年齢は0以上を入力してください", groups = Group2.class)
	@Max(value = 100, message = "年齢は100以上を入力してください", groups = Group2.class)
    private Integer age;

	@Size(min = 1, max = 20, message = "備考は20字以内で入力してください", groups = Group1.class)
	private String remark;

	public interface Group1{}
	public interface Group2{}

	@GroupSequence({Group1.class, Group2.class})
	public interface Groups{}

}