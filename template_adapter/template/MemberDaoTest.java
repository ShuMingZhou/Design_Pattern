package template;

import template.jdbc.MemberDao;

import java.util.List;

/**
 * Created by Tom.
 */
public class MemberDaoTest {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }

    //在abstractList的get抽象方法和httpServerlet都有用到Template模式
}
