package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o5 implements aaShadow.v0 {
    public final p5 a;

    public o5(p5 p5Var) {
        this.a = p5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5) && k71.k.b(this.a, ((o5) obj).a);
    }

    public final int hashCode() {
        p5 p5Var = this.a;
        if (p5Var == null) {
            return 0;
        }
        return p5Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
