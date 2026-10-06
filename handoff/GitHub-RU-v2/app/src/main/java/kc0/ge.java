package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ge {
    public final String a;
    public final String b;
    public final we0.l1 c;

    public ge(String str, String str2, we0.l1 l1Var) {
        this.a = str;
        this.b = str2;
        this.c = l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge)) {
            return false;
        }
        ge geVar = (ge) obj;
        return k71.k.b(this.a, geVar.a) && k71.k.b(this.b, geVar.b) && k71.k.b(this.c, geVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", commitFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
