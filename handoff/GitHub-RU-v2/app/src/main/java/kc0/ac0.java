package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ac0 implements aaShadow.v0 {
    public bc0 a;

    public ac0(bc0 bc0Var) {
        this.a = bc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac0) && k71.k.b(this.a, ((ac0) obj).a);
    }

    public final int hashCode() {
        bc0 bc0Var = this.a;
        if (bc0Var == null) {
            return 0;
        }
        return bc0Var.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
