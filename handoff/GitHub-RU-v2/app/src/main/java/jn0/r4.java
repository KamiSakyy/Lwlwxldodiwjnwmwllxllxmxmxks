package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r4 {
    public u4 a;

    public r4(u4 u4Var) {
        this.a = u4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r4) && k71.k.b(this.a, ((r4) obj).a);
    }

    public final int hashCode() {
        u4 u4Var = this.a;
        if (u4Var == null) {
            return 0;
        }
        return u4Var.hashCode();
    }

    public final String toString() {
        return "CloneTemplateRepository(repository=" + this.a + ")";
    }
}
