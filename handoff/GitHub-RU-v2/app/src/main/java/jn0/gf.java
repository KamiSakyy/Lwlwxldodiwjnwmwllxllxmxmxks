package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gf {
    public final String a;
    public final String b;
    public final ap0.e2 c;

    public gf(String str, String str2, ap0.e2 e2Var) {
        this.a = str;
        this.b = str2;
        this.c = e2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf)) {
            return false;
        }
        gf gfVar = (gf) obj;
        return k71.k.b(this.a, gfVar.a) && k71.k.b(this.b, gfVar.b) && k71.k.b(this.c, gfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Organization(__typename=", this.a, ", id=", this.b, ", organizationNameAndAvatar=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
