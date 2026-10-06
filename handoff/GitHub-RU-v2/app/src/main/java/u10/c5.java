package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c5 {
    public final String a;
    public final ja0.a b;
    public final g40.b0 c;

    public c5(String str, ja0.a aVar, g40.b0 b0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return k71.k.b(this.a, c5Var.a) && k71.k.b(this.b, c5Var.b) && k71.k.b(this.c, c5Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ja0.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        g40.b0 b0Var = this.c;
        return hashCode2 + (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "GitObject(__typename=" + this.a + ", nodeIdFragment=" + this.b + ", commitDetailFields=" + this.c + ")";
    }
}
