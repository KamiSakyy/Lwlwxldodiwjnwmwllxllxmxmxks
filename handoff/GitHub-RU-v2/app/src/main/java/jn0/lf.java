package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lf {
    public final String a;
    public final String b;
    public final uu0.o6 c;

    public lf(String str, String str2, uu0.o6 o6Var) {
        this.a = str;
        this.b = str2;
        this.c = o6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf)) {
            return false;
        }
        lf lfVar = (lf) obj;
        return k71.k.b(this.a, lfVar.a) && k71.k.b(this.b, lfVar.b) && k71.k.b(this.c, lfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", userListMetadataForRepositoryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
