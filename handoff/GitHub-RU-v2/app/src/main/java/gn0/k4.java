package gn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k4 {
    public aa.u0 a;
    public String b;

    public k4(aa.u0 u0Var, String str) {
        this.a = u0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj;
        return this.a.equals(k4Var.a) && this.b.equals(k4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommitMessage(body=" + this.a + ", headline=" + this.b + ")";
    }
}
