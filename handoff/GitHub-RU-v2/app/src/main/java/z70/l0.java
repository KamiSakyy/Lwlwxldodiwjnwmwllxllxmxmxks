package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 {
    public final String a;
    public final boolean b;
    public final v0 c;
    public final Integer d;
    public final g0 e;

    public l0(String str, boolean z, v0 v0Var, Integer num, g0 g0Var) {
        this.a = str;
        this.b = z;
        this.c = v0Var;
        this.d = num;
        this.e = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return k71.k.b(this.a, l0Var.a) && this.b == l0Var.b && k71.k.b(this.c, l0Var.c) && k71.k.b(this.d, l0Var.d) && k71.k.b(this.e, l0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int e = x.i.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        v0 v0Var = this.c;
        int hashCode = (e + (v0Var == null ? 0 : v0Var.a.hashCode())) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        g0 g0Var = this.e;
        return hashCode2 + (g0Var != null ? g0Var.hashCode() : 0);
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
