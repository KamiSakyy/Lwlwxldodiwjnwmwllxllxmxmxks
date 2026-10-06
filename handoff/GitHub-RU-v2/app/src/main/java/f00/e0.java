package f00;

import tz.b5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 {
    public final String a;
    public final String b;
    public final b5 c;

    public e0(String str, String str2, b5 b5Var) {
        this.a = str;
        this.b = str2;
        this.c = b5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return k71.k.b(this.a, e0Var.a) && k71.k.b(this.b, e0Var.b) && k71.k.b(this.c, e0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", simpleProjectV2Fragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
