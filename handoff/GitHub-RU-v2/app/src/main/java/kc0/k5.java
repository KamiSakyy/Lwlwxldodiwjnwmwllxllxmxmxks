package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k5 {
    public final String a;
    public final bl0.a b;
    public final we0.b0 c;

    public k5(String str, bl0.a aVar, we0.b0 b0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj;
        return k71.k.b(this.a, k5Var.a) && k71.k.b(this.b, k5Var.b) && k71.k.b(this.c, k5Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bl0.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        we0.b0 b0Var = this.c;
        return hashCode2 + (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "GitObject(__typename=" + this.a + ", nodeIdFragment=" + this.b + ", commitDetailFields=" + this.c + ")";
    }
}
