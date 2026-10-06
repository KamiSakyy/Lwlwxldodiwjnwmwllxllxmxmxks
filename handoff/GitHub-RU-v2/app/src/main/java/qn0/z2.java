package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z2 {
    public String a;
    public int b;
    public vn0.m2 c;

    public z2(String str, int i, vn0.m2 m2Var) {
        this.a = str;
        this.b = i;
        this.c = m2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj;
        return k71.k.b(this.a, z2Var.a) && this.b == z2Var.b && k71.k.b(this.c, z2Var.c);
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
