package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p8 {
    public String a;
    public l8 b;
    public j8 c;
    public String d;

    public p8(String str, l8 l8Var, j8 j8Var, String str2) {
        this.a = str;
        this.b = l8Var;
        this.c = j8Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj;
        return k71.k.b(this.a, p8Var.a) && k71.k.b(this.b, p8Var.b) && k71.k.b(this.c, p8Var.c) && k71.k.b(this.d, p8Var.d);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b.a, this.a.hashCode() * 31, 31);
        j8 j8Var = this.c;
        return this.d.hashCode() + ((b + (j8Var == null ? 0 : j8Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Discussion(id=" + this.a + ", comments=" + this.b + ", answer=" + this.c + ", __typename=" + this.d + ")";
    }
}
