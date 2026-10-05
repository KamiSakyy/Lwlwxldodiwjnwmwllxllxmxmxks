package v71;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /home/user/work/p/classes5.dex */
public final class n extends f1 {
    public final /* synthetic */ int v;
    public final l w;

    public /* synthetic */ n(l lVar, int i) {
        this.v = i;
        this.w = lVar;
    }

    @Override // v71.f1
    public final boolean k() {
        switch (this.v) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // v71.f1
    public final void l(Throwable th) {
        switch (this.v) {
            case 0:
                j1 j = j();
                l lVar = this.w;
                Throwable r = lVar.r(j);
                if (lVar.A()) {
                    a81.f fVar = (a81.f) lVar.u;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a81.f.y;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        a81.t tVar = a81.b.c;
                        if (k71.k.b(obj, tVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, tVar, r)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != tVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                lVar.x(r);
                if (!lVar.A()) {
                    lVar.n();
                    break;
                }
                break;
            default:
                this.w.i(w61.a0.a);
                break;
        }
    }
}
