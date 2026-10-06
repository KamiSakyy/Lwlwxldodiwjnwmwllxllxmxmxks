package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i90 implements aaShadow.m0 {
    public final k90 a;

    public i90(k90 k90Var) {
        this.a = k90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i90) && k71.k.b(this.a, ((i90) obj).a);
    }

    public final int hashCode() {
        k90 k90Var = this.a;
        if (k90Var == null) {
            return 0;
        }
        return k90Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDiscussion=" + this.a + ")";
    }
}
