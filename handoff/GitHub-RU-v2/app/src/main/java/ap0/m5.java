package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m5 {
    public final String a;
    public final o0 b;

    public m5(String str, o0 o0Var) {
        this.a = str;
        this.b = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        return k71.k.b(this.a, m5Var.a) && k71.k.b(this.b, m5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RelatedItem(__typename=" + this.a + ", feedItemsNoRelatedItems=" + this.b + ")";
    }
}
