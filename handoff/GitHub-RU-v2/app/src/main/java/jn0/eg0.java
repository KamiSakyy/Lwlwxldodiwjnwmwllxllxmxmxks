package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eg0 implements aa.v0 {
    public final fg0 a;
    public final String b;
    public final String c;

    public eg0(fg0 fg0Var, String str, String str2) {
        this.a = fg0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg0)) {
            return false;
        }
        eg0 eg0Var = (eg0) obj;
        return k71.k.b(this.a, eg0Var.a) && k71.k.b(this.b, eg0Var.b) && k71.k.b(this.c, eg0Var.c);
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
