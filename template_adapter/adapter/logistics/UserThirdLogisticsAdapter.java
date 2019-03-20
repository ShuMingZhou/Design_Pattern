package adapter.logistics;

/**
 * Created By Rick 2019/3/20
 */
public class UserThirdLogisticsAdapter extends SelfLogistics implements ThirdLogistics {

    //==========自己原有的发货渠道=========
    @Override
    public ResultMsg sendGoodsBySelfLogistics() {
        return super.sendGoodsBySelfLogistics();
    }

    //===========新增第三方发货渠道==============
    @Override
    public ResultMsg sendGoodsbyDHL() {
        return processLogin(DHLLogisticsAdapter.class);
    }

    @Override
    public ResultMsg sendGoodsbyUPS() {
        return processLogin(UPSLogisticsAdapter.class);
    }

    @Override
    public ResultMsg sendGoodsbyEMS() {
        return processLogin(EMSLogisticsAdapter.class);
    }

    private ResultMsg processLogin(Class<? extends Logistics> clazz) {
        try{
            Logistics adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.sendGoods();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
