package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h3 implements aaShadow.m0 {
    public f3 a;

    public h3(f3 f3Var) {
        this.a = f3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3) && k71.k.b(this.a, ((h3) obj).a);
    }

    public final int hashCode() {
        f3 f3Var = this.a;
        if (f3Var == null) {
            return 0;
        }
        return f3Var.hashCode();
    }

    public final String toString() {
        return "Data(blockUserFromOrganization=" + this.a + ")";
    }
}
