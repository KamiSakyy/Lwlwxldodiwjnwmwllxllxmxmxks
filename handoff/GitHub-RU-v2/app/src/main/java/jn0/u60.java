package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u60 implements aaShadow.v0 {
    public final y60 a;
    public final String b;
    public final String c;

    public u60(y60 y60Var, String str, String str2) {
        this.a = y60Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u60)) {
            return false;
        }
        u60 u60Var = (u60) obj;
        return k71.k.b(this.a, u60Var.a) && k71.k.b(this.b, u60Var.b) && k71.k.b(this.c, u60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(viewer=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
