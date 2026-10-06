package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ms {
    public final String a;
    public final String b;
    public final wk0.c1 c;

    public ms(String str, String str2, wk0.c1 c1Var) {
        this.a = str;
        this.b = str2;
        this.c = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms)) {
            return false;
        }
        ms msVar = (ms) obj;
        return k71.k.b(this.a, msVar.a) && k71.k.b(this.b, msVar.b) && k71.k.b(this.c, msVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(__typename=", this.a, ", id=", this.b, ", userListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
