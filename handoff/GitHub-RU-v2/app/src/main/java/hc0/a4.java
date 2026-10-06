package hc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a4 {
    public final aa.u0 a;
    public final String b;

    public a4(aa.u0 u0Var, String str) {
        this.a = u0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return this.a.equals(a4Var.a) && this.b.equals(a4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommitMessage(body=" + this.a + ", headline=" + this.b + ")";
    }
}
