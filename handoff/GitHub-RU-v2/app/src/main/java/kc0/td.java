package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class td {
    public String a;
    public String b;
    public oj0.a4 c;

    public td(String str, String str2, oj0.a4 a4Var) {
        this.a = str;
        this.b = str2;
        this.c = a4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td)) {
            return false;
        }
        td tdVar = (td) obj;
        return k71.k.b(this.a, tdVar.a) && k71.k.b(this.b, tdVar.b) && k71.k.b(this.c, tdVar.c);
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
