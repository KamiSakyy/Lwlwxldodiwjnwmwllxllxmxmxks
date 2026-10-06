package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q7 {
    public String a;
    public x7 b;
    public v7 c;
    public String d;

    public q7(String str, x7 x7Var, v7 v7Var, String str2) {
        this.a = str;
        this.b = x7Var;
        this.c = v7Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj;
        return k71.k.b(this.a, q7Var.a) && k71.k.b(this.b, q7Var.b) && k71.k.b(this.c, q7Var.c) && k71.k.b(this.d, q7Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        x7 x7Var = this.b;
        int hashCode2 = (hashCode + (x7Var == null ? 0 : x7Var.hashCode())) * 31;
        v7 v7Var = this.c;
        return this.d.hashCode() + ((hashCode2 + (v7Var != null ? v7Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Comment(id=" + this.a + ", replyTo=" + this.b + ", discussion=" + this.c + ", __typename=" + this.d + ")";
    }
}
