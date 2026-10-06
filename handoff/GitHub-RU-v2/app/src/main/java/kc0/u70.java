package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u70 {
    public String a;
    public bl0.a b;
    public ui0.d c;

    public u70(String str, bl0.a aVar, ui0.d dVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u70)) {
            return false;
        }
        u70 u70Var = (u70) obj;
        return k71.k.b(this.a, u70Var.a) && k71.k.b(this.b, u70Var.b) && k71.k.b(this.c, u70Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bl0.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ui0.d dVar = this.c;
        return hashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", nodeIdFragment=" + this.b + ", pullRequestCommitFields=" + this.c + ")";
    }
}
