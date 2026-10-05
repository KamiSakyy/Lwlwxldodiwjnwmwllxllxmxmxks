package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xn {
    public final String a;
    public final String b;
    public final yn c;

    public xn(String str, String str2, yn ynVar) {
        this.a = str;
        this.b = str2;
        this.c = ynVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn)) {
            return false;
        }
        xn xnVar = (xn) obj;
        return k71.k.b(this.a, xnVar.a) && k71.k.b(this.b, xnVar.b) && k71.k.b(this.c, xnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Discussion(__typename=", this.a, ", id=", this.b, ", onDiscussion=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
