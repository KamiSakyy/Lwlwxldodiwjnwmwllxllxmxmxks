package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nb0 {
    public final String a;
    public final String b;
    public final wk0.s1 c;

    public nb0(String str, String str2, wk0.s1 s1Var) {
        this.a = str;
        this.b = str2;
        this.c = s1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb0)) {
            return false;
        }
        nb0 nb0Var = (nb0) obj;
        return k71.k.b(this.a, nb0Var.a) && k71.k.b(this.b, nb0Var.b) && k71.k.b(this.c, nb0Var.c);
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
