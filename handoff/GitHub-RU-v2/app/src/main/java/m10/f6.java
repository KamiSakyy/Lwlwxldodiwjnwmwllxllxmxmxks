package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f6 {
    public final aa.u0 a;
    public final String b;

    public f6(aa.u0 u0Var, String str) {
        this.a = u0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6)) {
            return false;
        }
        f6 f6Var = (f6) obj;
        return this.a.equals(f6Var.a) && this.b.equals(f6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommitMessage(body=" + this.a + ", headline=" + this.b + ")";
    }
}
