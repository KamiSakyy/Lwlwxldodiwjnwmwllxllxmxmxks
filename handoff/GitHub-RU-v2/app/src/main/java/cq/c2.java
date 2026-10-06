package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c2 {
    public final String a;
    public final w0 b;

    public c2(String str, w0 w0Var) {
        this.a = str;
        this.b = w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return k71.k.b(this.a, c2Var.a) && k71.k.b(this.b, c2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RelatedItem(__typename=" + this.a + ", feedItemsNoRelatedItems=" + this.b + ")";
    }
}
