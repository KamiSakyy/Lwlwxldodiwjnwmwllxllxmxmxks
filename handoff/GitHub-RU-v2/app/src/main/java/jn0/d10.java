package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d10 {
    public String a;
    public String b;
    public ss0.m c;

    public d10(String str, String str2, ss0.m mVar) {
        this.a = str;
        this.b = str2;
        this.c = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d10)) {
            return false;
        }
        d10 d10Var = (d10) obj;
        return k71.k.b(this.a, d10Var.a) && k71.k.b(this.b, d10Var.b) && k71.k.b(this.c, d10Var.c);
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
