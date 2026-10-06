package pz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z4 {
    public final aa.u0 a;
    public final String b;

    public z4(aa.u0 u0Var, String str) {
        this.a = u0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) obj;
        return this.a.equals(z4Var.a) && this.b.equals(z4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommitMessage(body=" + this.a + ", headline=" + this.b + ")";
    }
}
