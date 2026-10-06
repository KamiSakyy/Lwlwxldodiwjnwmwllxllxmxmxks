package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q3 {
    public m3 a;
    public String b;

    public q3(m3 m3Var, String str) {
        this.a = m3Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return k71.k.b(this.a, q3Var.a) && k71.k.b(this.b, q3Var.b);
    }

    public final int hashCode() {
        m3 m3Var = this.a;
        return this.b.hashCode() + ((m3Var == null ? 0 : m3Var.hashCode()) * 31);
    }

    public final String toString() {
        return "OnCommit(file=" + this.a + ", id=" + this.b + ")";
    }
}
