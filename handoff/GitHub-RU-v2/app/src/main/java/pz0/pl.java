package pz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pl {
    public aa1.b a;
    public aa1.b b;
    public aa1.b c;
    public aa1.b d;
    public aa1.b e;
    public aa1.b f;

    public pl(aa.u0 u0Var, aa.u0 u0Var2, aa1.b bVar) {
        aa.t0 t0Var = aa.t0.d;
        this.a = t0Var;
        this.b = u0Var;
        this.c = t0Var;
        this.d = t0Var;
        this.e = u0Var2;
        this.f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl)) {
            return false;
        }
        pl plVar = (pl) obj;
        return k71.k.b(this.a, plVar.a) && k71.k.b(this.b, plVar.b) && k71.k.b(this.c, plVar.c) && k71.k.b(this.d, plVar.d) && k71.k.b(this.e, plVar.e) && k71.k.b(this.f, plVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + f1.e.a(this.e, f1.e.a(this.d, f1.e.a(this.c, f1.e.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder u = jo.f4Shadow.u("NotificationThreadFilters(listIds=", this.a, ", reasons=", this.b, ", savedOnly=");
        f1.e.w(u, this.c, ", starredOnly=", this.d, ", statuses=");
        return f1.e.l(u, this.e, ", threadTypes=", this.f, ")");
    }

    public Object e;
}
