package cn.nbbandxdd.survey.usrinfo.service.vo;

import javax.validation.constraints.NotBlank;

import cn.nbbandxdd.survey.common.validation.category.dprtnamandgrpnam.DprtNamAndGrpNam;
import cn.nbbandxdd.survey.common.validation.group.InsertGroup;
import cn.nbbandxdd.survey.common.validation.group.UpdateGroup;
import lombok.Data;

/**
 * <p>用户信息VO。
 * 
 * @author howcurious
 */
@Data
@DprtNamAndGrpNam(groups = {InsertGroup.class, UpdateGroup.class},
	message = "部门或职能组错误。")
public class UsrInfoVO {

	/**
	 * <p>部门名。
	 */
	private String dprtNam;
	
	/**
	 * <p>职能组名。
	 */
	@NotBlank(groups = {InsertGroup.class, UpdateGroup.class},
		message = "请选择职能组。")
	private String grpNam;
	
	/**
	 * <p>用户名。
	 */
	@NotBlank(groups = {InsertGroup.class, UpdateGroup.class},
		message = "请填写姓名。")
	private String usrNam;
}
