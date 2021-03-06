package framework.base;

import java.io.Serializable;
import java.util.List;

/**
 * @program: wady
 * @description: TODO
 * @author: YJiang（叶闲）
 * @create: 2020-04-08 21:40
 */

public class CompareBaseResultDTO implements Serializable {
    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    private int retCode;

    public void setRetValue(List<ResultDetailDTO> retValue) {
        this.retValue = retValue;
    }

    public List<ResultDetailDTO> getRetValue() {
        return retValue;
    }

    private List<ResultDetailDTO> retValue;

    public CompareBaseResultDTO() {}

    public int getRetCode() {
        return retCode;
    }

    public String getRetParameterDetail() {
        return retParameterDetail;
    }

    public void setRetParameterDetail(String retParameterDetail) {
        this.retParameterDetail = retParameterDetail;
    }

    private String retParameterDetail;

    @Override
    public String toString() {

        StringBuffer stringBuffer = new StringBuffer("CompareBaseResult{");
        stringBuffer.append("retCode=").append(this.retCode);
        stringBuffer.append(", retValue=").append(this.retValue);
        stringBuffer.append(", retParameterDetail=").append(this.retParameterDetail);

        stringBuffer.append('}');

        return stringBuffer.toString();
    }

}

