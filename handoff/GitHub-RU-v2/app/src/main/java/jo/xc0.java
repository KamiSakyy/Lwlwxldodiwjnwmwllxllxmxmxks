package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xc0 {
    public wc0 a;

    public xc0(wc0 wc0Var) {
        this.a = wc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xc0) && k71.k.b(this.a, ((xc0) obj).a);
    }

    public final int hashCode() {
        wc0 wc0Var = this.a;
        if (wc0Var == null) {
            return 0;
        }
        return wc0Var.hashCode();
    }

    public final String toString() {
        return "UpdateIssueComment(issueComment=" + this.a + ")";
    }
}
