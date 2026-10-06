package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class me0 {
    public String a;
    public vx.a b;
    public jv.d c;

    public me0(String str, vx.a aVar, jv.d dVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me0)) {
            return false;
        }
        me0 me0Var = (me0) obj;
        return k71.k.b(this.a, me0Var.a) && k71.k.b(this.b, me0Var.b) && k71.k.b(this.c, me0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vx.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jv.d dVar = this.c;
        return hashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", nodeIdFragment=" + this.b + ", pullRequestCommitFields=" + this.c + ")";
    }
    public me0(String p1, Object p2, Object p3) {
    }
}
