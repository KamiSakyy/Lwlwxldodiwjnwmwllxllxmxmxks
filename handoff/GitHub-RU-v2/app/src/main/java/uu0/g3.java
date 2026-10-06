package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g3 {
    public String a;
    public String b;

    public g3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        return k71.k.b(this.a, g3Var.a) && k71.k.b(this.b, g3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Owner1(id=", this.a, ", login=", this.b, ")");
    }
}
