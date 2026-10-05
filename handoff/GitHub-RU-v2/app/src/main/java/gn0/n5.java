package gn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n5 {
    public final aa1.b a;
    public final jt b;
    public final aa1.b c;
    public final pt d;
    public final String e;
    public final aa1.b f;
    public final aa1.b g;
    public final pu h;

    public n5(jt jtVar, pt ptVar, String str, aa1.b bVar, aa1.b bVar2, pu puVar) {
        k71.k.g(str, "name");
        aa.t0 t0Var = aa.t0.d;
        this.a = t0Var;
        this.b = jtVar;
        this.c = t0Var;
        this.d = ptVar;
        this.e = str;
        this.f = bVar;
        this.g = bVar2;
        this.h = puVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        return k71.k.b(this.a, n5Var.a) && this.b == n5Var.b && k71.k.b(this.c, n5Var.c) && this.d == n5Var.d && k71.k.b(this.e, n5Var.e) && k71.k.b(this.f, n5Var.f) && k71.k.b(this.g, n5Var.g) && this.h == n5Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + f1.e.a(this.g, f1.e.a(this.f, com.github.rudroid.copilot.h1.i((this.d.hashCode() + f1.e.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31, this.e, 31), 31), 31);
    }

    public final String toString() {
        return "CreateDashboardSearchShortcutInput(clientMutationId=" + this.a + ", color=" + this.b + ", description=" + this.c + ", icon=" + this.d + ", name=" + this.e + ", query=" + this.f + ", scopingRepository=" + this.g + ", searchType=" + this.h + ")";
    }
}
