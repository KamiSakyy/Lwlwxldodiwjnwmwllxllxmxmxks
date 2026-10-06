package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k2 {
    public String a;
    public cq.q0 b;

    public k2(String str, cq.q0 q0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return k71.k.b(this.a, k2Var.a) && k71.k.b(this.b, k2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subject(__typename=" + this.a + ", discussionVotableFragment=" + this.b + ")";
    }
    public k2(String p1, Object p2) {
    }
}
