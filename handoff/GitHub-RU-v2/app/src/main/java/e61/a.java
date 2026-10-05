package e61;

import android.content.Context;
import android.os.Bundle;
import k71.k;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements j {
    public final Bundle a;

    public a(Context context) {
        k.g(context, "appContext");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // e61.j
    public final Boolean a() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // e61.j
    public final kotlin.time.a b() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new kotlin.time.a(kotlin.time.e.n(bundle.getInt("firebase_sessions_sessions_restart_timeout"), kotlin.time.c.u));
        }
        return null;
    }

    @Override // e61.j
    public final Double c() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // e61.j
    public final Object d(a71.c cVar) {
        return a0.a;
    }
}
