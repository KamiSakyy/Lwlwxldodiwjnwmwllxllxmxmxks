package c71;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k71.k;
import v71.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c extends a {
    public final a71.h s;
    public transient a71.c t;

    public c(a71.c cVar, a71.h hVar) {
        super(cVar);
        this.s = hVar;
    }

    @Override // a71.c
    public a71.h q() {
        a71.h hVar = this.s;
        k.d(hVar);
        return hVar;
    }

    @Override // c71.a
    public void w() {
        a81.f fVar = this.t;
        if (fVar != null && fVar != this) {
            a71.f w0 = q().w0(a71.d.r);
            k.d(w0);
            a81.f fVar2 = fVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a81.f.y;
            while (atomicReferenceFieldUpdater.get(fVar2) == a81.b.c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(fVar2);
            l lVar = obj instanceof l ? (l) obj : null;
            if (lVar != null) {
                lVar.n();
            }
        }
        this.t = b.r;
    }

    public c(a71.c cVar) {
        this(cVar, cVar != null ? cVar.q() : null);
    }
}
