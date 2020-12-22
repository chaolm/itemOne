package com.ds.test.commonDto;

/**
 * @author clm
 * @date 2020/12/16
 * hh
 **/
public enum FlowItemTypeEn {

   //' 流水来源  0 :建立账号 1：招聘 2 ：广告 3：置顶 4 推荐奖励'
    CREATE_ACCOUNT(0),
    RECRUIT(1),
    ADVERTISEMENT(2),
    TOP(3),
    RECOMMEND(4);
    ;

    private Integer value;

    FlowItemTypeEn(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
