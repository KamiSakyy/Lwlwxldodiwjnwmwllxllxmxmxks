package rc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q2 {
    public String a;
    public wc0.w1 b;

    public q2(String str, wc0.w1 w1Var) {
        this.a = str;
        this.b = w1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return k71.k.b(this.a, q2Var.a) && k71.k.b(this.b, q2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Workflows(__typename=" + this.a + ", workflowConnectionFragment=" + this.b + ")";
    }
}
