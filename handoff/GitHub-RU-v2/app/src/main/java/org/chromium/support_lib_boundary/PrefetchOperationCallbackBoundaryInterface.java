package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: /home/user/work/p/classes5.dex */
public interface PrefetchOperationCallbackBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface PrefetchExceptionTypeBoundaryInterface {
    }

    void onFailure(int i, String str, int i2);

    void onSuccess();
}
