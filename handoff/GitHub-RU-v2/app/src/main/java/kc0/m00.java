package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m00 {
    public final j00 a;

    public m00(j00 j00Var) {
        this.a = j00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m00) && k71.k.b(this.a, ((m00) obj).a);
    }

    public final int hashCode() {
        j00 j00Var = this.a;
        if (j00Var == null) {
            return 0;
        }
        return j00Var.hashCode();
    }

    public final String toString() {
        return "ReplaceAssigneesForAssignable(assignable=" + this.a + ")";
    }
}
