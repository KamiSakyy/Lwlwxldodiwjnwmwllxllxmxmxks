package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sq {
    public final aa1.b a;
    public final aa1.b b;
    public final aa1.b c;
    public final aa1.b d;
    public final aa1.b e;
    public final aa1.b f;

    public sq(aa.u0 u0Var, aa.u0 u0Var2, aa1.b bVar) {
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
        if (!(obj instanceof sq)) {
            return false;
        }
        sq sqVar = (sq) obj;
        return k71.k.b(this.a, sqVar.a) && k71.k.b(this.b, sqVar.b) && k71.k.b(this.c, sqVar.c) && k71.k.b(this.d, sqVar.d) && k71.k.b(this.e, sqVar.e) && k71.k.b(this.f, sqVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + f1.e.a(this.e, f1.e.a(this.d, f1.e.a(this.c, f1.e.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder u = jo.f4.u("NotificationThreadFilters(listIds=", this.a, ", reasons=", this.b, ", savedOnly=");
        f1.e.w(u, this.c, ", starredOnly=", this.d, ", statuses=");
        return f1.e.l(u, this.e, ", threadTypes=", this.f, ")");
    }

    public Object e;
}
