package in;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import java.io.IOException;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class g extends k71.i implements j71.c {
    public static final g z = new g(1, rShadow.class, "defaultShouldRetry", "defaultShouldRetry(Ljava/lang/Throwable;)Z", 1);

    public final Object k(Object obj) {
        ApiFailure apiFailure = (Throwable) obj;
        k71.k.g(apiFailure, "p0");
        Set set = r.a;
        boolean z2 = false;
        if (!(apiFailure instanceof ApiFailure) ? (apiFailure instanceof IOException) : apiFailure.r == ApiFailureType.NO_NETWORK) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
