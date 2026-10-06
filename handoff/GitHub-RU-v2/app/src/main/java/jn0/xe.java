package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xe {
    public String a;
    public ze b;
    public af c;

    public xe(String str, ze zeVar, af afVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = zeVar;
        this.c = afVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe)) {
            return false;
        }
        xe xeVar = (xe) obj;
        return k71.k.b(this.a, xeVar.a) && k71.k.b(this.b, xeVar.b) && k71.k.b(this.c, xeVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ze zeVar = this.b;
        int hashCode2 = (hashCode + (zeVar == null ? 0 : zeVar.hashCode())) * 31;
        af afVar = this.c;
        return hashCode2 + (afVar != null ? afVar.hashCode() : 0);
    }

    public final String toString() {
        return "FileType(__typename=" + this.a + ", onMarkdownFileType=" + this.b + ", onTextFileType=" + this.c + ")";
    }
}
