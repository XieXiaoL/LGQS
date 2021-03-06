package cn.cqut.lgqs.db.service;

import cn.cqut.lgqs.db.dao.LgqsKeywordMapper;
import cn.cqut.lgqs.db.domain.LgqsKeyword;
import cn.cqut.lgqs.db.domain.LgqsKeywordExample;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class LgqsKeywordService {
    @Resource
    private LgqsKeywordMapper keywordsMapper;

    public LgqsKeyword queryDefault() {
        LgqsKeywordExample example = new LgqsKeywordExample();
        example.or().andIsDefaultEqualTo(true).andDeletedEqualTo(false);
        return keywordsMapper.selectOneByExample(example);
    }

    public List<LgqsKeyword> queryHots() {
        LgqsKeywordExample example = new LgqsKeywordExample();
        example.or().andIsHotEqualTo(true).andDeletedEqualTo(false);
        return keywordsMapper.selectByExample(example);
    }

    public List<LgqsKeyword> queryByKeyword(String keyword, Integer page, Integer limit) {
        LgqsKeywordExample example = new LgqsKeywordExample();
        example.setDistinct(true);
        example.or().andKeywordLike("%" + keyword + "%").andDeletedEqualTo(false);
        PageHelper.startPage(page, limit);
        return keywordsMapper.selectByExampleSelective(example, LgqsKeyword.Column.keyword);
    }

    public List<LgqsKeyword> querySelective(String keyword, String url, Integer page, Integer limit, String sort, String order) {
        LgqsKeywordExample example = new LgqsKeywordExample();
        LgqsKeywordExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(keyword)) {
            criteria.andKeywordLike("%" + keyword + "%");
        }
        if (!StringUtils.isEmpty(url)) {
            criteria.andUrlLike("%" + url + "%");
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return keywordsMapper.selectByExample(example);
    }

    public void add(LgqsKeyword keywords) {
        keywords.setAddTime(LocalDateTime.now());
        keywords.setUpdateTime(LocalDateTime.now());
        keywordsMapper.insertSelective(keywords);
    }

    public LgqsKeyword findById(Integer id) {
        return keywordsMapper.selectByPrimaryKey(id);
    }

    public int updateById(LgqsKeyword keywords) {
        keywords.setUpdateTime(LocalDateTime.now());
        return keywordsMapper.updateByPrimaryKeySelective(keywords);
    }

    public void deleteById(Integer id) {
        keywordsMapper.logicalDeleteByPrimaryKey(id);
    }
}
