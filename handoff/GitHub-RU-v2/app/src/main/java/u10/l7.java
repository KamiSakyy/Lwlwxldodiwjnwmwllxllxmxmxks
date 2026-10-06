package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l7 implements aaShadow.m0 {
    public m7 a;

    public l7(m7 m7Var) {
        this.a = m7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7) && k71.k.b(this.a, ((l7) obj).a);
    }

    public final int hashCode() {
        m7 m7Var = this.a;
        if (m7Var == null) {
            return 0;
        }
        return m7Var.hashCode();
    }

    public final String toString() {
        return "Data(deleteDiscussionComment=" + this.a + ")";
    }
}
