package androidx.lifecycle;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class k1 {

    /* renamed from: r, reason: collision with root package name */
    public final v6.d f2888r = new v6.d();

    public final void K(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        v6.d dVar = this.f2888r;
        if (dVar != null) {
            if (dVar.f32744d) {
                v6.d.a(autoCloseable);
                return;
            }
            synchronized (dVar.f32741a) {
                autoCloseable2 = (AutoCloseable) dVar.f32742b.put(str, autoCloseable);
            }
            v6.d.a(autoCloseable2);
        }
    }

    public final void L() {
        v6.d dVar = this.f2888r;
        if (dVar != null && !dVar.f32744d) {
            dVar.f32744d = true;
            synchronized (dVar.f32741a) {
                try {
                    Iterator it = dVar.f32742b.values().iterator();
                    while (it.hasNext()) {
                        v6.d.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = dVar.f32743c.iterator();
                    while (it2.hasNext()) {
                        v6.d.a((AutoCloseable) it2.next());
                    }
                    dVar.f32743c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        O();
    }

    public final AutoCloseable N(String str) {
        AutoCloseable autoCloseable;
        v6.d dVar = this.f2888r;
        if (dVar == null) {
            return null;
        }
        synchronized (dVar.f32741a) {
            autoCloseable = (AutoCloseable) dVar.f32742b.get(str);
        }
        return autoCloseable;
    }

    public void O() {
    }
}
