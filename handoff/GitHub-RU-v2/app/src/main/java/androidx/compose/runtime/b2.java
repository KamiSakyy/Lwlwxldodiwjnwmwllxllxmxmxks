package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public c2 f1571a;

    /* renamed from: b, reason: collision with root package name */
    public int f1572b;

    /* renamed from: c, reason: collision with root package name */
    public b f1573c;

    /* renamed from: d, reason: collision with root package name */
    public j71.e f1574d;

    /* renamed from: e, reason: collision with root package name */
    public int f1575e;

    /* renamed from: f, reason: collision with root package name */
    public x.c0 f1576f;

    /* renamed from: g, reason: collision with root package name */
    public x.h0 f1577g;

    public b2(c2 c2Var) {
        this.f1571a = c2Var;
    }

    public static boolean a(g0 g0Var, x.h0 h0Var) {
        k71.k.e(g0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        a3 a3Var = g0Var.f1636t;
        if (a3Var == null) {
            a3Var = i.f1673x;
        }
        return !a3Var.a(g0Var.E().f1624f, h0Var.g(g0Var));
    }

    public final boolean b() {
        if (this.f1571a != null) {
            b bVar = this.f1573c;
            if (bVar != null ? bVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final q0 c(Object obj) {
        q0 c10;
        c2 c2Var = this.f1571a;
        return (c2Var == null || (c10 = c2Var.c(this, obj)) == null) ? q0.f1756r : c10;
    }

    public final void d() {
        c2 c2Var = this.f1571a;
        if (c2Var != null) {
            c2Var.b();
        }
        this.f1571a = null;
        this.f1576f = null;
        this.f1577g = null;
        this.f1574d = null;
    }

    public final void e(boolean z10) {
        int i = this.f1572b;
        this.f1572b = z10 ? i | 32 : i & (-33);
    }

}
