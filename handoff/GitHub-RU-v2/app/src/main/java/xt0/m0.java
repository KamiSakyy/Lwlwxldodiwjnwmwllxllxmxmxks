package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m0 {
    public final String a;
    public final boolean b;
    public final w0 c;
    public final Integer d;
    public final h0 e;

    public m0(String str, boolean z, w0 w0Var, Integer num, h0 h0Var) {
        this.a = str;
        this.b = z;
        this.c = w0Var;
        this.d = num;
        this.e = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return k71.k.b(this.a, m0Var.a) && this.b == m0Var.b && k71.k.b(this.c, m0Var.c) && k71.k.b(this.d, m0Var.d) && k71.k.b(this.e, m0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int e = x.i.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        w0 w0Var = this.c;
        int hashCode = (e + (w0Var == null ? 0 : w0Var.a.hashCode())) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        h0 h0Var = this.e;
        return hashCode2 + (h0Var != null ? h0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("NewTreeEntry(path=", this.a, ", isGenerated=", ", submodule=", this.b);
        o.append(this.c);
        o.append(", lineCount=");
        o.append(this.d);
        o.append(", fileType=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
