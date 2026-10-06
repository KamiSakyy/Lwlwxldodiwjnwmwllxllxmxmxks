package xz0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiRequestStatus;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public class b {
    public static c a(ApiFailure apiFailure, Object obj) {
        k.g(apiFailure, "apiFailure");
        return new c(ApiRequestStatus.FAILURE, obj, apiFailure);
    }

    public static c b(Object obj) {
        return new c(ApiRequestStatus.SUCCESS, obj, null);
    }
}
