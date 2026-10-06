package v71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class y1 extends a81.q {
    private volatile boolean threadLocalIsSet;
    public ThreadLocal v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y1(a71.c cVar, a71.h hVar) {
        super(cVar, hVar.w0(r0) == null ? hVar.A(r0) : hVar);
        z1 z1Var = z1.r;
        this.v = new ThreadLocal();
        if (cVar.q().w0(a71.d.r) instanceof v) {
            return;
        }
        Object n = a81.b.n(hVar, null);
        a81.b.g(hVar, n);
        u0(hVar, n);
    }

    @Override // a81.q, v71.j1
    public final void o(Object obj) {
        t0();
        Object B = b0.B(obj);
        a71.c cVar = this.u;
        a71.h q = cVar.q();
        Object n = a81.b.n(q, null);
        y1 K = n != a81.b.d ? b0.K(cVar, q, n) : null;
        try {
            cVar.i(B);
            if (K == null || K.s0()) {
                a81.b.g(q, n);
            }
        } catch (Throwable th) {
            if (K == null || K.s0()) {
                a81.b.g(q, n);
            }
            throw th;
        }
    }

    @Override // a81.q
    public final void r0() {
        t0();
    }

    public final boolean s0() {
        boolean z = this.threadLocalIsSet && this.v.get() == null;
        this.v.remove();
        return !z;
    }

    public final void t0() {
        if (this.threadLocalIsSet) {
            w61.k kVar = (w61.k) this.v.get();
            if (kVar != null) {
                a81.b.g((a71.h) kVar.r, kVar.s);
            }
            this.v.remove();
        }
    }

    public final void u0(a71.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.v.set(new w61.k(hVar, obj));
    }
}
