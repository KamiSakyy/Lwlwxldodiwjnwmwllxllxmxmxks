package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wb0 {
    public String a;
    public String b;
    public ss0.g c;

    public wb0(String str, String str2, ss0.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb0)) {
            return false;
        }
        wb0 wb0Var = (wb0) obj;
        return k71.k.b(this.a, wb0Var.a) && k71.k.b(this.b, wb0Var.b) && k71.k.b(this.c, wb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("MergeQueueEntry(__typename=", this.a, ", id=", this.b, ", mergeQueueEntryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
