package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n6 implements aaShadow.m0 {
    public m6 a;

    public n6(m6 m6Var) {
        this.a = m6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6) && k71.k.b(this.a, ((n6) obj).a);
    }

    public final int hashCode() {
        m6 m6Var = this.a;
        if (m6Var == null) {
            return 0;
        }
        return m6Var.hashCode();
    }

    public final String toString() {
        return "Data(createDiscussion=" + this.a + ")";
    }
}
