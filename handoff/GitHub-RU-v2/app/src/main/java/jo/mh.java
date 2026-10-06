package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mh {
    public String a;
    public String b;
    public qx.c1 c;

    public mh(String str, String str2, qx.c1 c1Var) {
        this.a = str;
        this.b = str2;
        this.c = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh)) {
            return false;
        }
        mh mhVar = (mh) obj;
        return k71.k.b(this.a, mhVar.a) && k71.k.b(this.b, mhVar.b) && k71.k.b(this.c, mhVar.c);
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
