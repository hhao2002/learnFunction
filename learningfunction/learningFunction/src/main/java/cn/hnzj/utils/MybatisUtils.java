package cn.hnzj.utils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

/**
 * Title: MybatisUtils Description: 获取SqlSession对象
 * 
 * @author HhaoAn
 * @date 2022年3月14日
 */
public class MybatisUtils {
	private static final String MYBATIS_CONFIG_PAHT = "mybatis-config.xml";
	private static SqlSessionFactory sqlSessionFactory = null;

	static {
		Reader configReader = null;
		try {
			configReader = Resources.getResourceAsReader(MYBATIS_CONFIG_PAHT);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(configReader);
		try {
			configReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}

	public static SqlSession getSqlSession(boolean autoCommit) {
		return sqlSessionFactory.openSession(autoCommit);
	}

	@Test
	public void test() {
		MybatisUtils.getSqlSession();
	}
}
