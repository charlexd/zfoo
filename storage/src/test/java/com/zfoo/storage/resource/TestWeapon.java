package com.zfoo.storage.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zfoo.storage.model.anno.Id;
import com.zfoo.storage.model.anno.Resource;
import lombok.Getter;
//import lombok.Setter;

/************************************************************
 * TestWeapon
 * @author denglichuan@gmail.com
 */
@Resource
//@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestWeapon {

	/** asdasd */
	@Id
	private int id;

	/** asdasd */
	private String model;

	private String icon;

	private String weapon_pic;
}
