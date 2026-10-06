package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements aa.h0 {
    public String a;
    public e b;
    public g c;
    public h d;
    public f e;

    public i(String str, e eVar, g gVar, h hVar, f fVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = eVar;
        this.c = gVar;
        this.d = hVar;
        this.e = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && k71.k.b(this.c, iVar.c) && k71.k.b(this.d, iVar.d) && k71.k.b(this.e, iVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e eVar = this.b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        g gVar = this.c;
        int hashCode3 = (hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.d;
        int hashCode4 = (hashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        f fVar = this.e;
        return hashCode4 + (fVar != null ? fVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "CommentPositionFragment(__typename=" + this.a + ", onFileComment=" + this.b + ", onLineComment=" + this.c + ", onMultilineComment=" + this.d + ", onIndeterminateComment=" + this.e + ")";
    }
}
