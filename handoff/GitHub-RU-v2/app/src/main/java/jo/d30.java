package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d30 {
    public String a;
    public String b;
    public bu.m c;

    public d30(String str, String str2, bu.m mVar) {
        this.a = str;
        this.b = str2;
        this.c = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d30)) {
            return false;
        }
        d30 d30Var = (d30) obj;
        return k71.k.b(this.a, d30Var.a) && k71.k.b(this.b, d30Var.b) && k71.k.b(this.c, d30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("MergeQueue(__typename=", this.a, ", id=", this.b, ", mergeQueueFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
