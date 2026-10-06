package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tq {
    public String a;
    public ja0.a b;
    public w80.m3 c;

    public tq(String str, ja0.a aVar, w80.m3 m3Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = m3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq)) {
            return false;
        }
        tq tqVar = (tq) obj;
        return k71.k.b(this.a, tqVar.a) && k71.k.b(this.b, tqVar.b) && k71.k.b(this.c, tqVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ja0.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        w80.m3 m3Var = this.c;
        return hashCode2 + (m3Var != null ? m3Var.hashCode() : 0);
    }

    public final String toString() {
        return "Starrable(__typename=" + this.a + ", nodeIdFragment=" + this.b + ", repositoryStarsFragment=" + this.c + ")";
    }
    public tq(String p1, Object p2, Object p3) {
    }
}
