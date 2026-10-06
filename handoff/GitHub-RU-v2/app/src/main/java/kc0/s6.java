package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s6 implements aaShadow.m0 {
    public r6 a;

    public s6(r6 r6Var) {
        this.a = r6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6) && k71.k.b(this.a, ((s6) obj).a);
    }

    public final int hashCode() {
        r6 r6Var = this.a;
        if (r6Var == null) {
            return 0;
        }
        return r6Var.hashCode();
    }

    public final String toString() {
        return "Data(createIssue=" + this.a + ")";
    }
}
