package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f40 implements aaShadow.m0 {
    public g40 a;

    public f40(g40 g40Var) {
        this.a = g40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f40) && k71.k.b(this.a, ((f40) obj).a);
    }

    public final int hashCode() {
        g40 g40Var = this.a;
        if (g40Var == null) {
            return 0;
        }
        return g40Var.hashCode();
    }

    public final String toString() {
        return "Data(unlockLockable=" + this.a + ")";
    }
}
