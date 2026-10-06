package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q0 {
    public String a;
    public o0 b;

    public q0(String str, o0 o0Var) {
        this.a = str;
        this.b = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.a, q0Var.a) && k71.k.b(this.b, q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RelatedItem(__typename=" + this.a + ", feedItemsNoRelatedItems=" + this.b + ")";
    }
}
