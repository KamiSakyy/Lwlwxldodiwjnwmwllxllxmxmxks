package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ee {
    public final String a;
    public final String b;
    public final ea0.c1 c;

    public ee(String str, String str2, ea0.c1 c1Var) {
        this.a = str;
        this.b = str2;
        this.c = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee)) {
            return false;
        }
        ee eeVar = (ee) obj;
        return k71.k.b(this.a, eeVar.a) && k71.k.b(this.b, eeVar.b) && k71.k.b(this.c, eeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node2(__typename=", this.a, ", id=", this.b, ", userListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
