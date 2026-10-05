package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p80 implements aa.m0 {
    public final t80 a;

    public p80(t80 t80Var) {
        this.a = t80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p80) && k71.k.b(this.a, ((p80) obj).a);
    }

    public final int hashCode() {
        t80 t80Var = this.a;
        if (t80Var == null) {
            return 0;
        }
        return t80Var.hashCode();
    }

    public final String toString() {
        return "Data(unmarkFileAsViewed=" + this.a + ")";
    }
}
