package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vc0 implements aa.m0 {
    public final xc0 a;

    public vc0(xc0 xc0Var) {
        this.a = xc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vc0) && k71.k.b(this.a, ((vc0) obj).a);
    }

    public final int hashCode() {
        xc0 xc0Var = this.a;
        if (xc0Var == null) {
            return 0;
        }
        return xc0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateIssueComment=" + this.a + ")";
    }
}
