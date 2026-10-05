package v71;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class m1 extends a71.a implements d1 {
    public static final m1 s = new m1(w.s);

    @Override // v71.d1
    public final n0 E(boolean z, boolean z2, f0.c cVar) {
        return n1.r;
    }

    @Override // v71.d1
    public final s71.h F() {
        return s71.e.a;
    }

    @Override // v71.d1
    public final CancellationException N() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // v71.d1
    public final Object O(c71.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // v71.d1
    public final o e0(j1 j1Var) {
        return n1.r;
    }

    @Override // v71.d1
    public final boolean f() {
        return true;
    }

    @Override // v71.d1
    public final boolean isCancelled() {
        return false;
    }

    @Override // v71.d1
    public final void m(CancellationException cancellationException) {
    }

    @Override // v71.d1
    public final n0 o0(j71.c cVar) {
        return n1.r;
    }

    @Override // v71.d1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }
}
