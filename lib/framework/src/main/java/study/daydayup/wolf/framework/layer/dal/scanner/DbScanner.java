package study.daydayup.wolf.framework.layer.dal.scanner;

import lombok.NonNull;
import study.daydayup.wolf.common.io.db.Table;

/**
 * study.daydayup.wolf.framework.layer.dal.scanner
 *
 * @author Wingle
 * @since 2020/2/4 5:59 下午
 **/
public interface DbScanner {
    Table scan(@NonNull String table, @NonNull String shard);
    Table scan(@NonNull String table, @NonNull String shard, @NonNull String columns);
}
