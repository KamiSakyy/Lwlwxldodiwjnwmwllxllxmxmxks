package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements aa.h0 {
    public final String a;
    public final g b;
    public final i c;
    public final h d;
    public final j e;

    public k(String str, g gVar, i iVar, h hVar, j jVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = gVar;
        this.c = iVar;
        this.d = hVar;
        this.e = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b) && k71.k.b(this.c, kVar.c) && k71.k.b(this.d, kVar.d) && k71.k.b(this.e, kVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g gVar = this.b;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        i iVar = this.c;
        int hashCode3 = (hashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        h hVar = this.d;
        int hashCode4 = (hashCode3 + (hVar == null ? 0 : hVar.a.hashCode())) * 31;
        j jVar = this.e;
        return hashCode4 + (jVar != null ? jVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "FileTypeFragment(__typename=" + this.a + ", onImageFileType=" + this.b + ", onPdfFileType=" + this.c + ", onMarkdownFileType=" + this.d + ", onTextFileType=" + this.e + ")";
    }
}
