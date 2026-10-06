package hc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d5 {
    public final aa1.b a;
    public final es b;
    public final aa1.b c;
    public final ks d;
    public final String e;
    public final aa1.b f;
    public final aa1.b g;
    public final lt h;

    public d5(es esVar, ks ksVar, String str, aa1.b bVar, aa1.b bVar2, lt ltVar) {
        k71.k.g(str, "name");
        aa.t0 t0Var = aa.t0.d;
        this.a = t0Var;
        this.b = esVar;
        this.c = t0Var;
        this.d = ksVar;
        this.e = str;
        this.f = bVar;
        this.g = bVar2;
        this.h = ltVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj;
        return k71.k.b(this.a, d5Var.a) && this.b == d5Var.b && k71.k.b(this.c, d5Var.c) && this.d == d5Var.d && k71.k.b(this.e, d5Var.e) && k71.k.b(this.f, d5Var.f) && k71.k.b(this.g, d5Var.g) && this.h == d5Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + f1.e.a(this.g, f1.e.a(this.f, com.github.rudroid.copilot.h1.i((this.d.hashCode() + f1.e.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31, this.e, 31), 31), 31);
    }

    public final String toString() {
        return "CreateDashboardSearchShortcutInput(clientMutationId=" + this.a + ", color=" + this.b + ", description=" + this.c + ", icon=" + this.d + ", name=" + this.e + ", query=" + this.f + ", scopingRepository=" + this.g + ", searchType=" + this.h + ")";
    }

    public Object e;
}
