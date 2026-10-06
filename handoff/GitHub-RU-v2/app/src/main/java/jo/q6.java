package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q6 {
    public m6 a;
    public String b;

    public q6(m6 m6Var, String str) {
        this.a = m6Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6)) {
            return false;
        }
        q6 q6Var = (q6) obj;
        return k71.k.b(this.a, q6Var.a) && k71.k.b(this.b, q6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnCommit(history=" + this.a + ", id=" + this.b + ")";
    }
}
