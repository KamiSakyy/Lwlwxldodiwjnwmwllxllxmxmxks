package qx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i1 {
    public final e1 a;
    public final s1 b;
    public final String c;
    public final String d;

    public i1(e1 e1Var, s1 s1Var, String str, String str2) {
        this.a = e1Var;
        this.b = s1Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return k71.k.b(this.a, i1Var.a) && k71.k.b(this.b, i1Var.b) && k71.k.b(this.c, i1Var.c) && k71.k.b(this.d, i1Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s1 s1Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (s1Var == null ? 0 : s1Var.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node1(achievable=");
        sb.append(this.a);
        sb.append(", tier=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
