package gn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cz {
    public final aa1.b a;
    public final aa1.b b;
    public final aa1.b c;
    public final aa1.b d;
    public final aa1.b e;
    public final aa1.b f;
    public final aa1.b g;
    public final aa1.b h;
    public final String i;

    public cz(aa.u0 u0Var, aa.u0 u0Var2, aa.u0 u0Var3, aa.u0 u0Var4, aa.u0 u0Var5, aa.u0 u0Var6, String str) {
        k71.k.g(str, "shortcutId");
        aa.t0 t0Var = aa.t0.d;
        this.a = t0Var;
        this.b = u0Var;
        this.c = t0Var;
        this.d = u0Var2;
        this.e = u0Var3;
        this.f = u0Var4;
        this.g = u0Var5;
        this.h = u0Var6;
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz)) {
            return false;
        }
        cz czVar = (cz) obj;
        return k71.k.b(this.a, czVar.a) && k71.k.b(this.b, czVar.b) && k71.k.b(this.c, czVar.c) && k71.k.b(this.d, czVar.d) && k71.k.b(this.e, czVar.e) && k71.k.b(this.f, czVar.f) && k71.k.b(this.g, czVar.g) && k71.k.b(this.h, czVar.h) && k71.k.b(this.i, czVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + f1.e.a(this.h, f1.e.a(this.g, f1.e.a(this.f, f1.e.a(this.e, f1.e.a(this.d, f1.e.a(this.c, f1.e.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder u = jo.f4.u("UpdateDashboardSearchShortcutInput(clientMutationId=", this.a, ", color=", this.b, ", description=");
        f1.e.w(u, this.c, ", icon=", this.d, ", name=");
        f1.e.w(u, this.e, ", query=", this.f, ", scopingRepository=");
        f1.e.w(u, this.g, ", searchType=", this.h, ", shortcutId=");
        return com.github.rudroid.copilot.h1.p(u, this.i, ")");
    }

    public Object e;
}
