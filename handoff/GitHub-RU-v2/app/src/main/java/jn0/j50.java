package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j50 {
    public final m50 a;
    public final String b;

    public j50(m50 m50Var, String str) {
        this.a = m50Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j50)) {
            return false;
        }
        j50 j50Var = (j50) obj;
        return k71.k.b(this.a, j50Var.a) && k71.k.b(this.b, j50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnUser(starredRepositories=" + this.a + ", id=" + this.b + ")";
    }
}
