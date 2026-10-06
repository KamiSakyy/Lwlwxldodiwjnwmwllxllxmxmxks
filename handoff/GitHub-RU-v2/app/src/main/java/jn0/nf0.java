package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nf0 {
    public String a;
    public String b;
    public fw0.s1 c;

    public nf0(String str, String str2, fw0.s1 s1Var) {
        this.a = str;
        this.b = str2;
        this.c = s1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf0)) {
            return false;
        }
        nf0 nf0Var = (nf0) obj;
        return k71.k.b(this.a, nf0Var.a) && k71.k.b(this.b, nf0Var.b) && k71.k.b(this.c, nf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("User(__typename=", this.a, ", id=", this.b, ", userProfileFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
