package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z4 {
    public final String a;
    public final String b;
    public final ur0.p0 c;

    public z4(String str, String str2, ur0.p0 p0Var) {
        this.a = str;
        this.b = str2;
        this.c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) obj;
        return k71.k.b(this.a, z4Var.a) && k71.k.b(this.b, z4Var.b) && k71.k.b(this.c, z4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Issue(__typename=", this.a, ", id=", this.b, ", updateIssueStateFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
