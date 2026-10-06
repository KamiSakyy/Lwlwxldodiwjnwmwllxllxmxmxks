package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e9 {
    public final aa1.b a;
    public final s60 b;
    public final aa1.b c;
    public final y60 d;
    public final String e;
    public final aa1.b f;
    public final aa1.b g;
    public final y70 h;

    public e9(s60 s60Var, y60 y60Var, String str, aa1.b bVar, aa1.b bVar2, y70 y70Var) {
        k71.k.g(str, "name");
        aa.t0 t0Var = aa.t0.d;
        this.a = t0Var;
        this.b = s60Var;
        this.c = t0Var;
        this.d = y60Var;
        this.e = str;
        this.f = bVar;
        this.g = bVar2;
        this.h = y70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9)) {
            return false;
        }
        e9 e9Var = (e9) obj;
        return k71.k.b(this.a, e9Var.a) && this.b == e9Var.b && k71.k.b(this.c, e9Var.c) && this.d == e9Var.d && k71.k.b(this.e, e9Var.e) && k71.k.b(this.f, e9Var.f) && k71.k.b(this.g, e9Var.g) && this.h == e9Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + f1.e.a(this.g, f1.e.a(this.f, com.github.rudroid.copilot.h1.i((this.d.hashCode() + f1.e.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31, this.e, 31), 31), 31);
    }

    public final String toString() {
        return "CreateDashboardSearchShortcutInput(clientMutationId=" + this.a + ", color=" + this.b + ", description=" + this.c + ", icon=" + this.d + ", name=" + this.e + ", query=" + this.f + ", scopingRepository=" + this.g + ", searchType=" + this.h + ")";
    }

    public Object e;
}
