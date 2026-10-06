package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vb0 {
    public String a;
    public String b;
    public ss0.m c;

    public vb0(String str, String str2, ss0.m mVar) {
        this.a = str;
        this.b = str2;
        this.c = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb0)) {
            return false;
        }
        vb0 vb0Var = (vb0) obj;
        return k71.k.b(this.a, vb0Var.a) && k71.k.b(this.b, vb0Var.b) && k71.k.b(this.c, vb0Var.c);
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
