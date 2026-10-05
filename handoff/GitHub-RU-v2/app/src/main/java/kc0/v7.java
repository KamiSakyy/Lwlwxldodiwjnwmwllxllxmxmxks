package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v7 {
    public final String a;
    public final r7 b;
    public final p7 c;
    public final String d;

    public v7(String str, r7 r7Var, p7 p7Var, String str2) {
        this.a = str;
        this.b = r7Var;
        this.c = p7Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7)) {
            return false;
        }
        v7 v7Var = (v7) obj;
        return k71.k.b(this.a, v7Var.a) && k71.k.b(this.b, v7Var.b) && k71.k.b(this.c, v7Var.c) && k71.k.b(this.d, v7Var.d);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b.a, this.a.hashCode() * 31, 31);
        p7 p7Var = this.c;
        return this.d.hashCode() + ((b + (p7Var == null ? 0 : p7Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Discussion(id=" + this.a + ", comments=" + this.b + ", answer=" + this.c + ", __typename=" + this.d + ")";
    }
}
