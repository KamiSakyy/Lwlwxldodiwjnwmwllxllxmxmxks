package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l00 implements aaShadow.m0 {
    public final m00 a;

    public l00(m00 m00Var) {
        this.a = m00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l00) && k71.k.b(this.a, ((l00) obj).a);
    }

    public final int hashCode() {
        m00 m00Var = this.a;
        if (m00Var == null) {
            return 0;
        }
        return m00Var.hashCode();
    }

    public final String toString() {
        return "Data(replaceAssigneesForAssignable=" + this.a + ")";
    }
}
