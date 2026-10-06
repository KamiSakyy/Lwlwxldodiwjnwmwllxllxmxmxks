package m61;

import android.app.Application;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements o61.b {
    public com.github.rudroid.pushnotifications.i r;
    public com.github.rudroid.f s;

    public i(com.github.rudroid.pushnotifications.i iVar) {
        this.r = iVar;
    }

    @Override // o61.b
    public final Object w() {
        if (this.s == null) {
            Application application = this.r.getApplication();
            i4.S(application instanceof o61.b, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            this.s = new com.github.rudroid.f(((h) k41.b.v(h.class, application)).c);
        }
        return this.s;
    }
    public Object K0() { return null; }
    public Object g0() { return null; }
}
