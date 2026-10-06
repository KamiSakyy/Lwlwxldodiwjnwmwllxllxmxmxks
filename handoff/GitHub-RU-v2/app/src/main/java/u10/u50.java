package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u50 {
    public String a;
    public ja0.a b;
    public c80.d c;

    public u50(String str, ja0.a aVar, c80.d dVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u50)) {
            return false;
        }
        u50 u50Var = (u50) obj;
        return k71.k.b(this.a, u50Var.a) && k71.k.b(this.b, u50Var.b) && k71.k.b(this.c, u50Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ja0.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c80.d dVar = this.c;
        return hashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", nodeIdFragment=" + this.b + ", pullRequestCommitFields=" + this.c + ")";
    }
    public u50(String p1, Object p2, Object p3) {
    }
}
