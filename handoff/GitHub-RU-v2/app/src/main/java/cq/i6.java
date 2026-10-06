package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i6 {
    public final String a;
    public final w0 b;

    public i6(String str, w0 w0Var) {
        this.a = str;
        this.b = w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        return k71.k.b(this.a, i6Var.a) && k71.k.b(this.b, i6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RelatedItem(__typename=" + this.a + ", feedItemsNoRelatedItems=" + this.b + ")";
    }
}
