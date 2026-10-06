package c30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public String a;
    public r b;
    public q c;
    public s d;
    public t e;

    public m(String str, r rVar, q qVar, s sVar, t tVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = rVar;
        this.c = qVar;
        this.d = sVar;
        this.e = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && k71.k.b(this.b, mVar.b) && k71.k.b(this.c, mVar.c) && k71.k.b(this.d, mVar.d) && k71.k.b(this.e, mVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r rVar = this.b;
        int hashCode2 = (hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        q qVar = this.c;
        int hashCode3 = (hashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        s sVar = this.d;
        int hashCode4 = (hashCode3 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        t tVar = this.e;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        return "FileType(__typename=" + this.a + ", onMarkdownFileType=" + this.b + ", onImageFileType=" + this.c + ", onPdfFileType=" + this.d + ", onTextFileType=" + this.e + ")";
    }
}
