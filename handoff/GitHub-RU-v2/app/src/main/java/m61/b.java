package m61;

import android.app.Application;
import com.google.android.gms.internal.measurement.n4;
import k71.xShadow;
import w51.r;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements o61.b {
    public final /* synthetic */ int r;
    public k.i s;
    public Object t;
    public Object u;
    public volatile Object v;

    public b(k.i iVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                this.t = new Object();
                this.s = iVar;
                this.u = iVar;
                break;
            default:
                this.t = new Object();
                this.s = iVar;
                this.u = new b(iVar, 1);
                break;
        }
    }

    public com.github.rudroid.b a() {
        String str;
        k.i iVar = this.s;
        if (iVar.getApplication() instanceof o61.b) {
            com.github.rudroid.c cVar = (a) k41.b.v(a.class, (b) this.u);
            return new com.github.rudroid.b(cVar.a, cVar.b, iVar);
        }
        StringBuilder sb = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(iVar.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + iVar.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    public n4 b() {
        b bVar = (b) this.u;
        k.i iVar = bVar.s;
        r rVar = new r(iVar.K0(), new l61.d(1, (k.i) bVar.u), iVar.g0());
        k71.e a = xShadow.a(d.class);
        String b = a.b();
        if (b != null) {
            return ((d) rVar.E(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).t;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // o61.b
    public final Object w() {
        switch (this.r) {
            case 0:
                if (((com.github.rudroid.b) this.v) == null) {
                    synchronized (this.t) {
                        try {
                            if (((com.github.rudroid.b) this.v) == null) {
                                this.v = a();
                            }
                        } finally {
                        }
                    }
                }
                return (com.github.rudroid.b) this.v;
            default:
                if (((i61.a) this.v) == null) {
                    synchronized (this.t) {
                        try {
                            if (((i61.a) this.v) == null) {
                                k.i iVar = this.s;
                                r rVar = new r(iVar.K0(), new l61.d(1, (k.i) this.u), iVar.g0());
                                k71.e a = xShadow.a(d.class);
                                String b = a.b();
                                if (b == null) {
                                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                                }
                                this.v = ((d) rVar.E(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).s;
                            }
                        } finally {
                        }
                    }
                }
                return (i61.a) this.v;
        }
    }
    public Object c = null;
    public Object d = null;
}
