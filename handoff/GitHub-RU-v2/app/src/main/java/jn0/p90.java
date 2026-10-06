package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p90 {
    public m90 a;

    public p90(m90 m90Var) {
        this.a = m90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p90) && k71.k.b(this.a, ((p90) obj).a);
    }

    public final int hashCode() {
        m90 m90Var = this.a;
        if (m90Var == null) {
            return 0;
        }
        return m90Var.hashCode();
    }

    public final String toString() {
        return "UpdateDiscussionComment(comment=" + this.a + ")";
    }
}
