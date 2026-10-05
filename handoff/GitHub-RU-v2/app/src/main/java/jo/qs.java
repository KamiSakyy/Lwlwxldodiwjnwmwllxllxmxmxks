package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qs {
    public final String a;
    public final cq.l7 b;

    public qs(String str, cq.l7 l7Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = l7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs)) {
            return false;
        }
        qs qsVar = (qs) obj;
        return k71.k.b(this.a, qsVar.a) && k71.k.b(this.b, qsVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cq.l7 l7Var = this.b;
        return hashCode + (l7Var == null ? 0 : l7Var.hashCode());
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", widgetPullRequestRowFragment=" + this.b + ")";
    }
}
