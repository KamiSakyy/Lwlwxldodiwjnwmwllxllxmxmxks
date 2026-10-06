package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vf {
    public String a;
    public xf b;
    public yf c;

    public vf(String str, xf xfVar, yf yfVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = xfVar;
        this.c = yfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf)) {
            return false;
        }
        vf vfVar = (vf) obj;
        return k71.k.b(this.a, vfVar.a) && k71.k.b(this.b, vfVar.b) && k71.k.b(this.c, vfVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xf xfVar = this.b;
        int hashCode2 = (hashCode + (xfVar == null ? 0 : xfVar.hashCode())) * 31;
        yf yfVar = this.c;
        return hashCode2 + (yfVar != null ? yfVar.hashCode() : 0);
    }

    public final String toString() {
        return "FileType(__typename=" + this.a + ", onMarkdownFileType=" + this.b + ", onTextFileType=" + this.c + ")";
    }
}
