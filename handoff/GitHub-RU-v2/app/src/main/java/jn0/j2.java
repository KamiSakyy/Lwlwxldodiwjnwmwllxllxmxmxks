package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j2 implements aaShadow.m0 {
    public final h2 a;

    public j2(h2 h2Var) {
        this.a = h2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2) && k71.k.b(this.a, ((j2) obj).a);
    }

    public final int hashCode() {
        h2 h2Var = this.a;
        if (h2Var == null) {
            return 0;
        }
        return h2Var.a.hashCode();
    }

    public final String toString() {
        return "Data(applyMobileSuggestedChanges=" + this.a + ")";
    }
}
