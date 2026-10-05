package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l30 implements aa.v0 {
    public final p30 a;
    public final String b;
    public final String c;

    public l30(p30 p30Var, String str, String str2) {
        this.a = p30Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l30)) {
            return false;
        }
        l30 l30Var = (l30) obj;
        return k71.k.b(this.a, l30Var.a) && k71.k.b(this.b, l30Var.b) && k71.k.b(this.c, l30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(search=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
