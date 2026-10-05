package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d3 {
    public final String a;
    public final e3 b;
    public final String c;

    public d3(String str, e3 e3Var, String str2) {
        this.a = str;
        this.b = e3Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return k71.k.b(this.a, d3Var.a) && k71.k.b(this.b, d3Var.b) && k71.k.b(this.c, d3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", workflows=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
