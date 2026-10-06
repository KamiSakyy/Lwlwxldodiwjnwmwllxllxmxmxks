package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j70 implements aaShadow.m0 {
    public m70 a;

    public j70(m70 m70Var) {
        this.a = m70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j70) && k71.k.b(this.a, ((j70) obj).a);
    }

    public final int hashCode() {
        m70 m70Var = this.a;
        if (m70Var == null) {
            return 0;
        }
        return m70Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequestReviewComment=" + this.a + ")";
    }
}
