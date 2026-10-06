package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lf0 implements aaShadow.v0 {
    public final nf0 a;
    public final mf0 b;
    public final String c;
    public final String d;

    public lf0(nf0 nf0Var, mf0 mf0Var, String str, String str2) {
        this.a = nf0Var;
        this.b = mf0Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf0)) {
            return false;
        }
        lf0 lf0Var = (lf0) obj;
        return k71.k.b(this.a, lf0Var.a) && k71.k.b(this.b, lf0Var.b) && k71.k.b(this.c, lf0Var.c) && k71.k.b(this.d, lf0Var.d);
    }

    public final int hashCode() {
        nf0 nf0Var = this.a;
        int hashCode = (nf0Var == null ? 0 : nf0Var.hashCode()) * 31;
        mf0 mf0Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (mf0Var != null ? mf0Var.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(user=");
        sb.append(this.a);
        sb.append(", organization=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
