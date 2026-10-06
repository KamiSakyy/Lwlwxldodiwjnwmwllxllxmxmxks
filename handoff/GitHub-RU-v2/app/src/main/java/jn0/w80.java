package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w80 implements aaShadow.m0 {
    public final y80 a;

    public w80(y80 y80Var) {
        this.a = y80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w80) && k71.k.b(this.a, ((w80) obj).a);
    }

    public final int hashCode() {
        y80 y80Var = this.a;
        if (y80Var == null) {
            return 0;
        }
        return y80Var.hashCode();
    }

    public final String toString() {
        return "Data(unminimizeComment=" + this.a + ")";
    }
}
