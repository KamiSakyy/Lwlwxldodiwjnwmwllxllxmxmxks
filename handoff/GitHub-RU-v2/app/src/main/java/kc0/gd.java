package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gd {
    public String a;
    public id b;
    public jd c;

    public gd(String str, id idVar, jd jdVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = idVar;
        this.c = jdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd)) {
            return false;
        }
        gd gdVar = (gd) obj;
        return k71.k.b(this.a, gdVar.a) && k71.k.b(this.b, gdVar.b) && k71.k.b(this.c, gdVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        id idVar = this.b;
        int hashCode2 = (hashCode + (idVar == null ? 0 : idVar.hashCode())) * 31;
        jd jdVar = this.c;
        return hashCode2 + (jdVar != null ? jdVar.hashCode() : 0);
    }

    public final String toString() {
        return "FileType(__typename=" + this.a + ", onMarkdownFileType=" + this.b + ", onTextFileType=" + this.c + ")";
    }
}
