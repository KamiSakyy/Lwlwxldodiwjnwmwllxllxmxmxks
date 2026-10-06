package f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class ic {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23021a;

    /* renamed from: b, reason: collision with root package name */
    public final f0.m1 f23022b;

    /* renamed from: c, reason: collision with root package name */
    public final a0.w0 f23023c = new a0.w0(Boolean.FALSE);

    /* renamed from: d, reason: collision with root package name */
    public v71.l f23024d;

    public ic(boolean z10, f0.m1 m1Var) {
        this.f23021a = z10;
        this.f23022b = m1Var;
    }

    public final void a() {
        v71.l lVar;
        this.f23023c.a(Boolean.FALSE);
        if (!this.f23021a || (lVar = this.f23024d) == null) {
            return;
        }
        lVar.x((Throwable) null);
    }

    public final boolean b() {
        a0.w0 w0Var = this.f23023c;
        return ((Boolean) w0Var.f288b.getValue()).booleanValue() || ((Boolean) w0Var.f289c.getValue()).booleanValue();
    }

    public final Object c(f0.j1 j1Var, c71.j jVar) {
        a71.c cVar = null;
        hc hcVar = new hc(this, new d1.b1(this, cVar, 2), j1Var, cVar, 0);
        f0.m1 m1Var = this.f23022b;
        m1Var.getClass();
        Object k10 = v71.b0.k(new androidx.compose.runtime.f3(j1Var, m1Var, hcVar, (a71.c) null), jVar);
        return k10 == b71.a.r ? k10 : w61.a0.a;
    }
}
