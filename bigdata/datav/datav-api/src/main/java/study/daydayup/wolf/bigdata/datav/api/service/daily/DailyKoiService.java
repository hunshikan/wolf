package study.daydayup.wolf.bigdata.datav.api.service.daily;

import study.daydayup.wolf.bigdata.datav.api.dto.daily.DateRangeRequest;
import study.daydayup.wolf.bigdata.datav.api.entity.daily.DailyKoi;
import study.daydayup.wolf.framework.layer.domain.Service;
import study.daydayup.wolf.framework.rpc.page.Page;

/**
 * study.daydayup.wolf.bigdata.datav.api.service.daily
 *
 * @author Wingle
 * @since 2020/3/25 11:56 下午
 **/
public interface DailyKoiService extends Service {
    Page<DailyKoi> findByRange(DateRangeRequest request);
}
