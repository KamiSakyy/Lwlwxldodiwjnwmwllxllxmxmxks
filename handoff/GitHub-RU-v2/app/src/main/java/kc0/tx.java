package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tx {
    public String a;
    public String b;
    public mh0.a c;

    public tx(String str, String str2, mh0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx)) {
            return false;
        }
        tx txVar = (tx) obj;
        return k71.k.b(this.a, txVar.a) && k71.k.b(this.b, txVar.b) && k71.k.b(this.c, txVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", milestoneFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
