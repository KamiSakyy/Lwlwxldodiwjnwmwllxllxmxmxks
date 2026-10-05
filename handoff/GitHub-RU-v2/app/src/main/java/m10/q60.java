package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q60 {
    public final s60 a;
    public final y60 b;
    public final String c;
    public final aa1.b d;
    public final aa1.b e;
    public final y70 f;

    public q60(s60 s60Var, y60 y60Var, String str, aa1.b bVar, aa1.b bVar2, y70 y70Var) {
        k71.k.g(str, "name");
        this.a = s60Var;
        this.b = y60Var;
        this.c = str;
        this.d = bVar;
        this.e = bVar2;
        this.f = y70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q60)) {
            return false;
        }
        q60 q60Var = (q60) obj;
        if (this.a != q60Var.a) {
            return false;
        }
        Object obj2 = aa.t0.d;
        return obj2.equals(obj2) && this.b == q60Var.b && k71.k.b(this.c, q60Var.c) && this.d.equals(q60Var.d) && this.e.equals(q60Var.e) && this.f == q60Var.f;
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
