package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g6 {
    public final c6 a;
    public final String b;

    public g6(c6 c6Var, String str) {
        this.a = c6Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6)) {
            return false;
        }
        g6 g6Var = (g6) obj;
        return k71.k.b(this.a, g6Var.a) && k71.k.b(this.b, g6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnCommit(history=" + this.a + ", id=" + this.b + ")";
    }
}
