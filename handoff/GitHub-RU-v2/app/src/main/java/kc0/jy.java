package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jy {
    public final String a;
    public final String b;
    public final oj0.f1 c;

    public jy(String str, String str2, oj0.f1 f1Var) {
        this.a = str;
        this.b = str2;
        this.c = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy)) {
            return false;
        }
        jy jyVar = (jy) obj;
        return k71.k.b(this.a, jyVar.a) && k71.k.b(this.b, jyVar.b) && k71.k.b(this.c, jyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", repositoryDetailsFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
