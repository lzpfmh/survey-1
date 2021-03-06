package cn.nbbandxdd.survey.ques.dao.entity;

import java.sql.Timestamp;
import java.util.List;

import lombok.Data;

@Data
public class QuesByPronEntity {

	private String quesCd;
	
	private String typCd;
	
	private String dsc;
	
	private String comm;
	
	private String lastMantUsr;
	
	private String lastMantDat;
	
	private Timestamp lastMantTmstp;
	
	private List<AnswEntity> answList;
}
