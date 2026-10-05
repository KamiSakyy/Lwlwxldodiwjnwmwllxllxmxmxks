package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u implements aa.h0 {
    public final String a;
    public final q b;
    public final s c;
    public final r d;
    public final t e;

    public u(String str, q qVar, s sVar, r rVar, t tVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = qVar;
        this.c = sVar;
        this.d = rVar;
        this.e = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && k71.k.b(this.b, uVar.b) && k71.k.b(this.c, uVar.c) && k71.k.b(this.d, uVar.d) && k71.k.b(this.e, uVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q qVar = this.b;
        int hashCode2 = (hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        s sVar = this.c;
        int hashCode3 = (hashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        r rVar = this.d;
        int hashCode4 = (hashCode3 + (rVar == null ? 0 : rVar.a.hashCode())) * 31;
        t tVar = this.e;
        return hashCode4 + (tVar != null ? tVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "FileTypeFragment(__typename=" + this.a + ", onImageFileType=" + this.b + ", onPdfFileType=" + this.c + ", onMarkdownFileType=" + this.d + ", onTextFileType=" + this.e + ")";
    }
}
