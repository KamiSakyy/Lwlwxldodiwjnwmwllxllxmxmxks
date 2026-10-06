package x71;

import java.util.concurrent.atomic.AtomicReferenceArray;
import v71.a2;

/* loaded from: /home/user/work/p/classes5.dex */
public final class p extends a81.r {
    public h v;
    public final /* synthetic */ AtomicReferenceArray w;

    public p(long j, p pVar, h hVar, int i) {
        super(j, pVar, i);
        this.v = hVar;
        this.w = new AtomicReferenceArray(j.b * 2);
    }

    @Override // a81.r
    public final int g() {
        return j.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        k71.k.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // a81.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, a71.h hVar) {
        int i2 = j.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.w.get(i * 2);
        while (true) {
            Object l = l(i);
            boolean z2 = l instanceof a2;
            h hVar2 = this.v;
            if (z2 || (l instanceof x)) {
                if (k(i, l, z ? j.j : j.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        k71.k.d(hVar2);
                        return;
                    }
                    return;
                }
            } else {
                if (l == j.j || l == j.k) {
                    break;
                }
                if (l != j.g && l != j.f) {
                    if (l == j.i || l == j.d || l == j.l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + l).toString());
                }
            }
        }
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.w;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.w.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            h hVar = this.v;
            k71.k.d(hVar);
            hVar.L((this.t * j.b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.w.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.w.set((i * 2) + 1, obj);
    }
}
