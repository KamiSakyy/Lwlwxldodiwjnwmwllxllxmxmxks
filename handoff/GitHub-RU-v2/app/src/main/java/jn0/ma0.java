package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ma0 implements aaShadow.m0 {
    public final pa0 a;

    public ma0(pa0 pa0Var) {
        this.a = pa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ma0) && k71.k.b(this.a, ((ma0) obj).a);
    }

    public final int hashCode() {
        pa0 pa0Var = this.a;
        if (pa0Var == null) {
            return 0;
        }
        return pa0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateIssueIssueType=" + this.a + ")";
    }
}
