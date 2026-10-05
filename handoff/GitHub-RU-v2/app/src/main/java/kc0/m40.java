package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m40 implements aa.m0 {
    public final p40 a;

    public m40(p40 p40Var) {
        this.a = p40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m40) && k71.k.b(this.a, ((m40) obj).a);
    }

    public final int hashCode() {
        p40 p40Var = this.a;
        if (p40Var == null) {
            return 0;
        }
        return p40Var.hashCode();
    }

    public final String toString() {
        return "Data(unmarkDiscussionCommentAsAnswer=" + this.a + ")";
    }
}
