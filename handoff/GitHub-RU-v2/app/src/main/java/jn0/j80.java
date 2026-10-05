package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j80 implements aa.m0 {
    public final m80 a;

    public j80(m80 m80Var) {
        this.a = m80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j80) && k71.k.b(this.a, ((j80) obj).a);
    }

    public final int hashCode() {
        m80 m80Var = this.a;
        if (m80Var == null) {
            return 0;
        }
        return m80Var.hashCode();
    }

    public final String toString() {
        return "Data(unmarkDiscussionCommentAsAnswer=" + this.a + ")";
    }
}
