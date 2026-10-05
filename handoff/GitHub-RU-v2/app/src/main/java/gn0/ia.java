package gn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ia {
    public final aa.u0 a;
    public final aa.u0 b;

    public ia(aa.u0 u0Var, aa.u0 u0Var2) {
        this.a = u0Var;
        this.b = u0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia)) {
            return false;
        }
        ia iaVar = (ia) obj;
        return this.a.equals(iaVar.a) && this.b.equals(iaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FileChanges(additions=" + this.a + ", deletions=" + this.b + ")";
    }
}
