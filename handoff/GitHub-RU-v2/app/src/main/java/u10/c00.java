package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c00 implements aa.m0 {
    public final f00 a;

    public c00(f00 f00Var) {
        this.a = f00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c00) && k71.k.b(this.a, ((c00) obj).a);
    }

    public final int hashCode() {
        f00 f00Var = this.a;
        if (f00Var == null) {
            return 0;
        }
        return f00Var.hashCode();
    }

    public final String toString() {
        return "Data(submitPullRequestReview=" + this.a + ")";
    }
}
