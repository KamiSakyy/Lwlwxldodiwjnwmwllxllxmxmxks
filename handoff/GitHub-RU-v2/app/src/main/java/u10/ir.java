package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ir {
    public final String a;
    public final String b;
    public final ea0.c1 c;

    public ir(String str, String str2, ea0.c1 c1Var) {
        this.a = str;
        this.b = str2;
        this.c = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir)) {
            return false;
        }
        ir irVar = (ir) obj;
        return k71.k.b(this.a, irVar.a) && k71.k.b(this.b, irVar.b) && k71.k.b(this.c, irVar.c);
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
