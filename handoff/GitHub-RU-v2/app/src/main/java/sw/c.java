package sw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public String a;
    public f b;
    public e c;
    public o d;
    public g e;

    public c(String str, f fVar, e eVar, o oVar, g gVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = fVar;
        this.c = eVar;
        this.d = oVar;
        this.e = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c) && k71.k.b(this.d, cVar.d) && k71.k.b(this.e, cVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f fVar = this.b;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.a.hashCode())) * 31;
        e eVar = this.c;
        int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        o oVar = this.d;
        int hashCode4 = (hashCode3 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        g gVar = this.e;
        return hashCode4 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "LoginRef(__typename=" + this.a + ", onNode=" + this.b + ", onActor=" + this.c + ", onUser=" + this.d + ", onOrganization=" + this.e + ")";
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
    public static final Object i = null;
}
