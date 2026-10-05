package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j4 {
    public final String a;
    public final o4 b;
    public final n4 c;
    public final p4 d;
    public final q4 e;

    public j4(String str, o4 o4Var, n4 n4Var, p4 p4Var, q4 q4Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = o4Var;
        this.c = n4Var;
        this.d = p4Var;
        this.e = q4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return k71.k.b(this.a, j4Var.a) && k71.k.b(this.b, j4Var.b) && k71.k.b(this.c, j4Var.c) && k71.k.b(this.d, j4Var.d) && k71.k.b(this.e, j4Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o4 o4Var = this.b;
        int hashCode2 = (hashCode + (o4Var == null ? 0 : o4Var.hashCode())) * 31;
        n4 n4Var = this.c;
        int hashCode3 = (hashCode2 + (n4Var == null ? 0 : n4Var.hashCode())) * 31;
        p4 p4Var = this.d;
        int hashCode4 = (hashCode3 + (p4Var == null ? 0 : p4Var.hashCode())) * 31;
        q4 q4Var = this.e;
        return hashCode4 + (q4Var != null ? q4Var.hashCode() : 0);
    }

    public final String toString() {
        return "FileType(__typename=" + this.a + ", onMarkdownFileType=" + this.b + ", onImageFileType=" + this.c + ", onPdfFileType=" + this.d + ", onTextFileType=" + this.e + ")";
    }
}
