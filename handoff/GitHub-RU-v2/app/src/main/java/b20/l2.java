package b20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l2 {
    public String a;
    public int b;
    public g20.i2 c;

    public l2(String str, int i, g20.i2 i2Var) {
        this.a = str;
        this.b = i;
        this.c = i2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return k71.k.b(this.a, l2Var.a) && this.b == l2Var.b && k71.k.b(this.c, l2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "Runs(__typename=", this.a, ", totalCount=", ", workflowRunConnectionFragment=");
        n.append(this.c);
        n.append(")");
        return n.toString();
    }
}
