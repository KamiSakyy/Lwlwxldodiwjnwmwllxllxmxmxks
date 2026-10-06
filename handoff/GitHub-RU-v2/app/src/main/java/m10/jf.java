package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jf {
    public final aa.u0 a;
    public final aa.u0 b;

    public jf(aa.u0 u0Var, aa.u0 u0Var2) {
        this.a = u0Var;
        this.b = u0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf)) {
            return false;
        }
        jf jfVar = (jf) obj;
        return this.a.equals(jfVar.a) && this.b.equals(jfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FileChanges(additions=" + this.a + ", deletions=" + this.b + ")";
    }
}
