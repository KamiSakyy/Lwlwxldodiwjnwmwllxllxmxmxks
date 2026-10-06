package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j2 {
    public String a;
    public int b;
    public String c;

    public j2(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return k71.k.b(this.a, j2Var.a) && this.b == j2Var.b && k71.k.b(this.c, j2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.n(this.b, "MergeQueueEntry(id=", this.a, ", position=", ", __typename="), this.c, ")");
    }
}
