package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a90 {
    public String a;
    public r80 b;

    public a90(String str, r80 r80Var) {
        this.a = str;
        this.b = r80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a90)) {
            return false;
        }
        a90 a90Var = (a90) obj;
        return k71.k.b(this.a, a90Var.a) && k71.k.b(this.b, a90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnPullRequestReviewThread(id=" + this.a + ", comments=" + this.b + ")";
    }
}
