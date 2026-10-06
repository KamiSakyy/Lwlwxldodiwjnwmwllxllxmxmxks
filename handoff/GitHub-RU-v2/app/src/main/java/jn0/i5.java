package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i5 implements aaShadow.v0 {
    public g5 a;
    public String b;
    public String c;

    public i5(g5 g5Var, String str, String str2) {
        this.a = g5Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return k71.k.b(this.a, i5Var.a) && k71.k.b(this.b, i5Var.b) && k71.k.b(this.c, i5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(codeSearch=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
