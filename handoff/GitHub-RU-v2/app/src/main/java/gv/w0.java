package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 {
    public String a;
    public boolean b;
    public g1 c;
    public Integer d;
    public r0 e;

    public w0(String str, boolean z, g1 g1Var, Integer num, r0 r0Var) {
        this.a = str;
        this.b = z;
        this.c = g1Var;
        this.d = num;
        this.e = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return k71.k.b(this.a, w0Var.a) && this.b == w0Var.b && k71.k.b(this.c, w0Var.c) && k71.k.b(this.d, w0Var.d) && k71.k.b(this.e, w0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int e = x.i.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        g1 g1Var = this.c;
        int hashCode = (e + (g1Var == null ? 0 : g1Var.a.hashCode())) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        r0 r0Var = this.e;
        return hashCode2 + (r0Var != null ? r0Var.hashCode() : 0);
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
