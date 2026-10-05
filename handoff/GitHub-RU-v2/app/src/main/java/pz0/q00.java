package pz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q00 {
    public final s00 a;
    public final y00 b;
    public final String c;
    public final aa1.b d;
    public final aa1.b e;
    public final y10 f;

    public q00(s00 s00Var, y00 y00Var, String str, aa1.b bVar, aa1.b bVar2, y10 y10Var) {
        k71.k.g(str, "name");
        this.a = s00Var;
        this.b = y00Var;
        this.c = str;
        this.d = bVar;
        this.e = bVar2;
        this.f = y10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q00)) {
            return false;
        }
        q00 q00Var = (q00) obj;
        if (this.a != q00Var.a) {
            return false;
        }
        Object obj2 = aa.t0.d;
        return obj2.equals(obj2) && this.b == q00Var.b && k71.k.b(this.c, q00Var.c) && this.d.equals(q00Var.d) && this.e.equals(q00Var.e) && this.f == q00Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + f1.e.a(this.e, f1.e.a(this.d, com.github.rudroid.copilot.h1.i((this.b.hashCode() + ((aa.t0.d.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, this.c, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchShortcutAttributes(color=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(aa.t0.d);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", query=");
        f1.e.w(sb, this.d, ", scopingRepository=", this.e, ", searchType=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
