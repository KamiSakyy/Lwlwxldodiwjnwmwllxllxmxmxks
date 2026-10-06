package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n7 {
    public String a;
    public j7 b;
    public h7 c;
    public String d;

    public n7(String str, j7 j7Var, h7 h7Var, String str2) {
        this.a = str;
        this.b = j7Var;
        this.c = h7Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7)) {
            return false;
        }
        n7 n7Var = (n7) obj;
        return k71.k.b(this.a, n7Var.a) && k71.k.b(this.b, n7Var.b) && k71.k.b(this.c, n7Var.c) && k71.k.b(this.d, n7Var.d);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b.a, this.a.hashCode() * 31, 31);
        h7 h7Var = this.c;
        return this.d.hashCode() + ((b + (h7Var == null ? 0 : h7Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Discussion(id=" + this.a + ", comments=" + this.b + ", answer=" + this.c + ", __typename=" + this.d + ")";
    }
}
