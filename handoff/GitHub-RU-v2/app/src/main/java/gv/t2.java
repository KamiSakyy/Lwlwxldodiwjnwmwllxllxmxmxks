package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t2 {
    public final String a;
    public final int b;
    public final String c;

    public t2(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return k71.k.b(this.a, t2Var.a) && this.b == t2Var.b && k71.k.b(this.c, t2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.n(this.b, "MergeQueueEntry(id=", this.a, ", position=", ", __typename="), this.c, ")");
    }
}
