package y71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class k1 implements v71.n0 {
    public final m1 r;
    public final long s;
    public final Object t;
    public final v71.l u;

    public k1(m1 m1Var, long j, Object obj, v71.l lVar) {
        this.r = m1Var;
        this.s = j;
        this.t = obj;
        this.u = lVar;
    }

    @Override // v71.n0
    public final void a() {
        m1 m1Var = this.r;
        synchronized (m1Var) {
            if (this.s < m1Var.q()) {
                return;
            }
            Object[] objArr = m1Var.y;
            k71.k.d(objArr);
            long j = this.s;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            n1.f(objArr, j, n1.a);
            m1Var.j();
        }
    }
}
