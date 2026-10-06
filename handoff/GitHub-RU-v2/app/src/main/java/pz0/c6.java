package pz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c6 {
    public aa1.b a;
    public s00 b;
    public aa1.b c;
    public y00 d;
    public String e;
    public aa1.b f;
    public aa1.b g;
    public y10 h;

    public c6(s00 s00Var, y00 y00Var, String str, aa1.b bVar, aa1.b bVar2, y10 y10Var) {
        k71.k.g(str, "name");
        aa.t0 t0Var = aa.t0.d;
        this.a = t0Var;
        this.b = s00Var;
        this.c = t0Var;
        this.d = y00Var;
        this.e = str;
        this.f = bVar;
        this.g = bVar2;
        this.h = y10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) obj;
        return k71.k.b(this.a, c6Var.a) && this.b == c6Var.b && k71.k.b(this.c, c6Var.c) && this.d == c6Var.d && k71.k.b(this.e, c6Var.e) && k71.k.b(this.f, c6Var.f) && k71.k.b(this.g, c6Var.g) && this.h == c6Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + f1.e.a(this.g, f1.e.a(this.f, com.github.rudroid.copilot.h1.i((this.d.hashCode() + f1.e.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31, this.e, 31), 31), 31);
    }

    public final String toString() {
        return "CreateDashboardSearchShortcutInput(clientMutationId=" + this.a + ", color=" + this.b + ", description=" + this.c + ", icon=" + this.d + ", name=" + this.e + ", query=" + this.f + ", scopingRepository=" + this.g + ", searchType=" + this.h + ")";
    }

    public Object e;
}
