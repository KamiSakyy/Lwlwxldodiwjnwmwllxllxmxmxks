package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d2 implements aa.m0 {
    public final b2 a;

    public d2(b2 b2Var) {
        this.a = b2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2) && k71.k.b(this.a, ((d2) obj).a);
    }

    public final int hashCode() {
        b2 b2Var = this.a;
        if (b2Var == null) {
            return 0;
        }
        return b2Var.a.hashCode();
    }

    public final String toString() {
        return "Data(applyMobileSuggestedChanges=" + this.a + ")";
    }
}
