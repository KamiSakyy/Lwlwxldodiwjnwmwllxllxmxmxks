package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a6 {
    public w5 a;
    public String b;

    public a6(w5 w5Var, String str) {
        this.a = w5Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj;
        return k71.k.b(this.a, a6Var.a) && k71.k.b(this.b, a6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnCommit(history=" + this.a + ", id=" + this.b + ")";
    }
}
