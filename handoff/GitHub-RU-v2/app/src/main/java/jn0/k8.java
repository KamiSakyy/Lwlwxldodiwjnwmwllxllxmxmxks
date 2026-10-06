package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k8 {
    public final String a;
    public final r8 b;
    public final p8 c;
    public final String d;

    public k8(String str, r8 r8Var, p8 p8Var, String str2) {
        this.a = str;
        this.b = r8Var;
        this.c = p8Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8)) {
            return false;
        }
        k8 k8Var = (k8) obj;
        return k71.k.b(this.a, k8Var.a) && k71.k.b(this.b, k8Var.b) && k71.k.b(this.c, k8Var.c) && k71.k.b(this.d, k8Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r8 r8Var = this.b;
        int hashCode2 = (hashCode + (r8Var == null ? 0 : r8Var.hashCode())) * 31;
        p8 p8Var = this.c;
        return this.d.hashCode() + ((hashCode2 + (p8Var != null ? p8Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Comment(id=" + this.a + ", replyTo=" + this.b + ", discussion=" + this.c + ", __typename=" + this.d + ")";
    }
}
