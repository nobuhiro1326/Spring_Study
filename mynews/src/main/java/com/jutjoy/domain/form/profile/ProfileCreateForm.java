package com.jutjoy.domain.form.profile;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ProfileCreateForm {

	@NotBlank(message = "名前を入力してください", groups = Group1.class)
	@Size(min = 1, max = 20, message = "名前を20文字以内で入力してください。", groups = Group2.class)
	private String name;

	@NotBlank(message = "性別を入力してください", groups = Group1.class)
	private String gender;

	@NotEmpty(message = "趣味を入力してください", groups = Group1.class)
	private String hobby;

	@NotEmpty(message = "自己紹介を入力してください", groups = Group1.class)
	private String introduction;

	public interface Group1 {}
    public interface Group2 {}

    @GroupSequence({Group1.class, Group2.class})
    public interface Groups {}

}
