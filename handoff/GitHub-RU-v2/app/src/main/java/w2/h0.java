package w2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public final class h0 implements ComponentCallbacks2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Configuration f33048r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b3.c f33049s;

    public h0(Configuration configuration, b3.c cVar) {
        this.f33048r = configuration;
        this.f33049s = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f33048r;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f33049s.f3384a.entrySet().iterator();
        while (it.hasNext()) {
            b3.a aVar = (b3.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(updateFrom, aVar.f3381b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f33049s.f3384a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.f33049s.f3384a.clear();
    }
}
