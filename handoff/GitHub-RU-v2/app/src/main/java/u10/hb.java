package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hb {
    public String a;
    public ja0.a b;
    public e50.l0 c;

    public hb(String str, ja0.a aVar, e50.l0 l0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return k71.k.b(this.a, hbVar.a) && k71.k.b(this.b, hbVar.b) && k71.k.b(this.c, hbVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ja0.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        e50.l0 l0Var = this.c;
        return hashCode2 + (l0Var != null ? l0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", nodeIdFragment=" + this.b + ", discussionFragment=" + this.c + ")";
    }
}
