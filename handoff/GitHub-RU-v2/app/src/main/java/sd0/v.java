package sd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v {
    public String a;
    public a0Shadow b;
    public z c;
    public b0 d;
    public c0 e;

    public v(String str, a0Shadow a0Var, z zVar, b0 b0Var, c0 c0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = a0Var;
        this.c = zVar;
        this.d = b0Var;
        this.e = c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b) && k71.k.b(this.c, vVar.c) && k71.k.b(this.d, vVar.d) && k71.k.b(this.e, vVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a0Shadow a0Var = this.b;
        int hashCode2 = (hashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        z zVar = this.c;
        int hashCode3 = (hashCode2 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        b0 b0Var = this.d;
        int hashCode4 = (hashCode3 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        c0 c0Var = this.e;
        return hashCode4 + (c0Var != null ? c0Var.hashCode() : 0);
    }

    public final String toString() {
        return "FileType(__typename=" + this.a + ", onMarkdownFileType=" + this.b + ", onImageFileType=" + this.c + ", onPdfFileType=" + this.d + ", onTextFileType=" + this.e + ")";
    }
}
