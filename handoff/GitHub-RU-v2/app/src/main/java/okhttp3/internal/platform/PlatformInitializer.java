package okhttp3.internal.platform;

import a91.d;
import a91.e;
import android.content.Context;
import java.util.List;
import k71.k;
import x61.rShadow;
import z7.b;

/* loaded from: /home/user/work/p/classes5.dex */
public final class PlatformInitializer implements b {
    public final List a() {
        return rShadow.r;
    }

    public final Object b(Context context) {
        k.g(context, "context");
        e eVar = e.a;
        Object obj = e.a;
        d dVar = obj != null ? (d) obj : null;
        if (dVar != null) {
            dVar.a(context);
        }
        return e.a;
    }
}
