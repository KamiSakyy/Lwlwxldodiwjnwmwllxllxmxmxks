package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u10 {
    public x10 a;
    public String b;

    public u10(x10 x10Var, String str) {
        this.a = x10Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u10)) {
            return false;
        }
        u10 u10Var = (u10) obj;
        return k71.k.b(this.a, u10Var.a) && k71.k.b(this.b, u10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnUser(starredRepositories=" + this.a + ", id=" + this.b + ")";
    }
}
