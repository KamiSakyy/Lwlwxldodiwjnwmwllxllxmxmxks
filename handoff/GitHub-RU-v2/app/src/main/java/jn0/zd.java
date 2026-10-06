package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zd {
    public String a;
    public String b;
    public ap0.p4 c;

    public zd(String str, String str2, ap0.p4 p4Var) {
        this.a = str;
        this.b = str2;
        this.c = p4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd)) {
            return false;
        }
        zd zdVar = (zd) obj;
        return k71.k.b(this.a, zdVar.a) && k71.k.b(this.b, zdVar.b) && k71.k.b(this.c, zdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", repositoryFeedFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
