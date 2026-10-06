package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z80 implements aaShadow.m0 {
    public final b90 a;

    public z80(b90 b90Var) {
        this.a = b90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z80) && k71.k.b(this.a, ((z80) obj).a);
    }

    public final int hashCode() {
        b90 b90Var = this.a;
        if (b90Var == null) {
            return 0;
        }
        return b90Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequest=" + this.a + ")";
    }
}
