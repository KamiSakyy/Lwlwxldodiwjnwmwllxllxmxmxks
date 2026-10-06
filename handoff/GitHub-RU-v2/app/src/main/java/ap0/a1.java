package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a1 {
    public String a;
    public o0 b;

    public a1(String str, o0 o0Var) {
        this.a = str;
        this.b = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return k71.k.b(this.a, a1Var.a) && k71.k.b(this.b, a1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RelatedItem(__typename=" + this.a + ", feedItemsNoRelatedItems=" + this.b + ")";
    }
}
