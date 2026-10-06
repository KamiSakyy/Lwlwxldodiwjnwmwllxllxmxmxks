package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g2 {
    public final String a;
    public final o0 b;

    public g2(String str, o0 o0Var) {
        this.a = str;
        this.b = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return k71.k.b(this.a, g2Var.a) && k71.k.b(this.b, g2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RelatedItem(__typename=" + this.a + ", feedItemsNoRelatedItems=" + this.b + ")";
    }
}
