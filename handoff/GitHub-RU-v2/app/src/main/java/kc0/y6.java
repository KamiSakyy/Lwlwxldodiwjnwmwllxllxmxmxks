package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y6 {
    public String a;
    public String b;

    public y6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        return k71.k.b(this.a, y6Var.a) && k71.k.b(this.b, y6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Owner(id=", this.a, ", login=", this.b, ")");
    }
}
