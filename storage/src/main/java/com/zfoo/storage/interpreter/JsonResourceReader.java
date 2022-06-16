package com.zfoo.storage.interpreter;

import com.zfoo.protocol.util.JsonUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/************************************************************
 * JsonResourceReader
 * @date 2022/6/14  
 * @author denglichuan@gmail.com
 */
public class JsonResourceReader implements IResourceReader {

	/**
	 * 从json文件中读取对象列表
	 * @param inputStream
	 * @param clazz
	 * @param <T>
	 * @return
	 */
	@Override
	public <T> List<T> read(InputStream inputStream, Class<T> clazz) {
		try {
			var b = inputStream.readAllBytes();
			var s = new String(b);
			var result = JsonUtils.string2List(s, clazz);
			return result;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
