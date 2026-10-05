package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m4 {
    public final i4 a;
    public final String b;

    public m4(i4 i4Var, String str) {
        this.a = i4Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj;
        return k71.k.b(this.a, m4Var.a) && k71.k.b(this.b, m4Var.b);
    }

    public final int hashCode() {
        i4 i4Var = this.a;
        return this.b.hashCode() + ((i4Var == null ? 0 : i4Var.hashCode()) * 31);
    }

    public final String toString() {
        return "OnCommit(file=" + this.a + ", id=" + this.b + ")";
    }
}
