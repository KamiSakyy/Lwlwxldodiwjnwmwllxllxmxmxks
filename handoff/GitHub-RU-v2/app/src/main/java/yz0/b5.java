package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b5 {
    public a7 a;

    public b5(a7 a7Var) {
        this.a = a7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b5) && k71.k.b(this.a, ((b5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SubmitReview(review=" + this.a + ")";
    }
}
