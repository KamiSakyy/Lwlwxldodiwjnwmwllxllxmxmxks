package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n50 {
    public final m50 a;

    public n50(m50 m50Var) {
        this.a = m50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n50) && k71.k.b(this.a, ((n50) obj).a);
    }

    public final int hashCode() {
        m50 m50Var = this.a;
        if (m50Var == null) {
            return 0;
        }
        return m50Var.hashCode();
    }

    public final String toString() {
        return "UpdateDiscussion(discussion=" + this.a + ")";
    }
}
