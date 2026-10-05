package a81;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(r rVar) {
        this._prev$volatile = rVar;
    }

    public final void a() {
        s.set(this, null);
    }

    public final c c() {
        Object obj = r.get(this);
        if (obj == b.a) {
            return null;
        }
        return (c) obj;
    }

    public abstract boolean d();

    public final void e() {
        c c;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
            c cVar = (c) atomicReferenceFieldUpdater.get(this);
            while (cVar != null && cVar.d()) {
                cVar = (c) atomicReferenceFieldUpdater.get(cVar);
            }
            c c2 = c();
            k71.k.d(c2);
            while (c2.d() && (c = c2.c()) != null) {
                c2 = c;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c2);
                c cVar2 = ((c) obj) == null ? null : cVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(c2, obj, cVar2)) {
                    if (atomicReferenceFieldUpdater.get(c2) != obj) {
                        break;
                    }
                }
            }
            if (cVar != null) {
                r.set(cVar, c2);
            }
            if (!c2.d() || c2.c() == null) {
                if (cVar == null || !cVar.d()) {
                    return;
                }
            }
        }
    }
}
