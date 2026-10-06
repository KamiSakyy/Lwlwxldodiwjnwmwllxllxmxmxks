package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w00 {
    public String a;
    public n00 b;

    public w00(String str, n00 n00Var) {
        this.a = str;
        this.b = n00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w00)) {
            return false;
        }
        w00 w00Var = (w00) obj;
        return k71.k.b(this.a, w00Var.a) && k71.k.b(this.b, w00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnPullRequestReviewThread(id=" + this.a + ", comments=" + this.b + ")";
    }
}
