package w2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: /home/user/work/p/classes.dex */
public final class i0 implements ComponentCallbacks2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b3.d f33054r;

    public i0(b3.d dVar) {
        this.f33054r = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        b3.d dVar = this.f33054r;
        synchronized (dVar) {
            dVar.f3385a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        b3.d dVar = this.f33054r;
        synchronized (dVar) {
            dVar.f3385a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        b3.d dVar = this.f33054r;
        synchronized (dVar) {
            dVar.f3385a.c();
        }
    }
}
