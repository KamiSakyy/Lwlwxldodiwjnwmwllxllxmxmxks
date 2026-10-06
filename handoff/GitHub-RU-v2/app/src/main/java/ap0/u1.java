package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u1 {
    public String a;
    public o0 b;

    public u1(String str, o0 o0Var) {
        this.a = str;
        this.b = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return k71.k.b(this.a, u1Var.a) && k71.k.b(this.b, u1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RelatedItem(__typename=" + this.a + ", feedItemsNoRelatedItems=" + this.b + ")";
    }
}
