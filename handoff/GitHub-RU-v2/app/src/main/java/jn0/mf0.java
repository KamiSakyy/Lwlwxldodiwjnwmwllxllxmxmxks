package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mf0 {
    public final String a;
    public final String b;
    public final kt0.i c;

    public mf0(String str, String str2, kt0.i iVar) {
        this.a = str;
        this.b = str2;
        this.c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf0)) {
            return false;
        }
        mf0 mf0Var = (mf0) obj;
        return k71.k.b(this.a, mf0Var.a) && k71.k.b(this.b, mf0Var.b) && k71.k.b(this.c, mf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Organization(__typename=", this.a, ", id=", this.b, ", organizationFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
