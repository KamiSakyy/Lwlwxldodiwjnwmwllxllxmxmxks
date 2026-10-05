package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jn implements aa.v0 {
    public final ln a;
    public final String b;
    public final String c;

    public jn(ln lnVar, String str, String str2) {
        this.a = lnVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn)) {
            return false;
        }
        jn jnVar = (jn) obj;
        return k71.k.b(this.a, jnVar.a) && k71.k.b(this.b, jnVar.b) && k71.k.b(this.c, jnVar.c);
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
