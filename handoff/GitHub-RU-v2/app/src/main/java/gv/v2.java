package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v2 {
    public final String a;
    public final eq.c b;

    public v2(String str, eq.c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return k71.k.b(this.a, v2Var.a) && k71.k.b(this.b, v2Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        eq.c cVar = this.b;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return jo.f4.n("Node(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}
