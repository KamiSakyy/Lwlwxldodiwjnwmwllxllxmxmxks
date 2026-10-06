package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m10 {
    public final l10 a;

    public m10(l10 l10Var) {
        this.a = l10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m10) && k71.k.b(this.a, ((m10) obj).a);
    }

    public final int hashCode() {
        l10 l10Var = this.a;
        if (l10Var == null) {
            return 0;
        }
        return l10Var.hashCode();
    }

    public final String toString() {
        return "UnresolveReviewThread(thread=" + this.a + ")";
    }
}
