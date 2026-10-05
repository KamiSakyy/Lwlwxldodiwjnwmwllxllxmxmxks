package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import k71.k;
import m7.h;
import m7.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: r, reason: collision with root package name */
    public int f3094r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f3095s = new LinkedHashMap();

    /* renamed from: t, reason: collision with root package name */
    public final i f3096t = new i(this);

    /* renamed from: u, reason: collision with root package name */
    public final h f3097u = new h(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        k.g(intent, "intent");
        return this.f3097u;
    }
}
