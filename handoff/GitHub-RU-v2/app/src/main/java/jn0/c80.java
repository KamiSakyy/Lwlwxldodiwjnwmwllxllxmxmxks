package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c80 implements aaShadow.m0 {
    public final d80 a;

    public c80(d80 d80Var) {
        this.a = d80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c80) && k71.k.b(this.a, ((c80) obj).a);
    }

    public final int hashCode() {
        d80 d80Var = this.a;
        if (d80Var == null) {
            return 0;
        }
        return d80Var.hashCode();
    }

    public final String toString() {
        return "Data(unlockLockable=" + this.a + ")";
    }
}
