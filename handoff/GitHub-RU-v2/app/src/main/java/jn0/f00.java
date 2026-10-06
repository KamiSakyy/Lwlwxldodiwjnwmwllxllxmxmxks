package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f00 implements aaShadow.v0 {
    public final j00 a;
    public final String b;
    public final String c;

    public f00(j00 j00Var, String str, String str2) {
        this.a = j00Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f00)) {
            return false;
        }
        f00 f00Var = (f00) obj;
        return k71.k.b(this.a, f00Var.a) && k71.k.b(this.b, f00Var.b) && k71.k.b(this.c, f00Var.c);
    }

    public final int hashCode() {
        j00 j00Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((j00Var == null ? 0 : j00Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
