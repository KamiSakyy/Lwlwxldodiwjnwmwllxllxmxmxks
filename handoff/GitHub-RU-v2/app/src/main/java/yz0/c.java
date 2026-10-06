package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public String a;
    public a7 b;

    public c(String str, a7 a7Var) {
        this.a = str;
        this.b = a7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddReview(reviewId=" + this.a + ", review=" + this.b + ")";
    }
}
