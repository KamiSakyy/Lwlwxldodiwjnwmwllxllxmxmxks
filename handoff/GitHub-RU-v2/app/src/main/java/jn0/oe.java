package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oe {
    public final boolean a;
    public final pz0.g7 b;

    public oe(boolean z, pz0.g7 g7Var) {
        this.a = z;
        this.b = g7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe)) {
            return false;
        }
        oe oeVar = (oe) obj;
        return this.a == oeVar.a && this.b == oeVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Filter(isEnabled=" + this.a + ", filterGroup=" + this.b + ")";
    }
}
