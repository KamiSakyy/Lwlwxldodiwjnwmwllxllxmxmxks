package f9;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.measurement.internal.h2;
import e9.m;
import java.util.concurrent.ExecutorService;
import v71.b0;
import v71.v;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final m f24378a;

    /* renamed from: b, reason: collision with root package name */
    public final v f24379b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f24380c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final h2 f24381d = new h2(1, this);

    public a(ExecutorService executorService) {
        m mVar = new m(executorService, 0);
        this.f24378a = mVar;
        this.f24379b = b0.o(mVar);
    }
}
