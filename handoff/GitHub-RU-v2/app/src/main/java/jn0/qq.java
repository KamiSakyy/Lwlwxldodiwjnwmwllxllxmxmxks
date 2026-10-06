package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qq {
    public String a;
    public ap0.p6 b;

    public qq(String str, ap0.p6 p6Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = p6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq)) {
            return false;
        }
        qq qqVar = (qq) obj;
        return k71.k.b(this.a, qqVar.a) && k71.k.b(this.b, qqVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ap0.p6 p6Var = this.b;
        return hashCode + (p6Var == null ? 0 : p6Var.hashCode());
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", widgetPullRequestRowFragment=" + this.b + ")";
    }
}
