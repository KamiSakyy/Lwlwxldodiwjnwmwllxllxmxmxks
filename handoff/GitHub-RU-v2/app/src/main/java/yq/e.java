package yq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public final String a;
    public final vx.a b;
    public final ct.c c;

    public e(String str, vx.a aVar, ct.c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vx.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ct.c cVar = this.c;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "DuplicateOf(__typename=" + this.a + ", nodeIdFragment=" + this.b + ", duplicateOfFragment=" + this.c + ")";
    }
}
