package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n7 implements aa.m0 {
    public final m7 a;

    public n7(m7 m7Var) {
        this.a = m7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n7) && k71.k.b(this.a, ((n7) obj).a);
    }

    public final int hashCode() {
        m7 m7Var = this.a;
        if (m7Var == null) {
            return 0;
        }
        return m7Var.hashCode();
    }

    public final String toString() {
        return "Data(createPullRequest=" + this.a + ")";
    }
}
