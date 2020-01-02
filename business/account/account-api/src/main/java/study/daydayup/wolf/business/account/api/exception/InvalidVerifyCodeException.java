package study.daydayup.wolf.business.account.api.exception;

import study.daydayup.wolf.common.lang.exception.BusinessException;

/**
 * study.daydayup.wolf.business.account.auth.agent.exception
 *
 * @author Wingle
 * @since 2019/12/12 3:04 下午
 **/
public class InvalidVerifyCodeException extends BusinessException {
    public InvalidVerifyCodeException() {
        super(111005, "invalid verify code");
    }
}
