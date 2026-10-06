package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n3 {
    public String a;
    public s3 b;
    public r3 c;
    public t3 d;
    public u3 e;

    public n3(String str, s3 s3Var, r3 r3Var, t3 t3Var, u3 u3Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = s3Var;
        this.c = r3Var;
        this.d = t3Var;
        this.e = u3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return k71.k.b(this.a, n3Var.a) && k71.k.b(this.b, n3Var.b) && k71.k.b(this.c, n3Var.c) && k71.k.b(this.d, n3Var.d) && k71.k.b(this.e, n3Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s3 s3Var = this.b;
        int hashCode2 = (hashCode + (s3Var == null ? 0 : s3Var.hashCode())) * 31;
        r3 r3Var = this.c;
        int hashCode3 = (hashCode2 + (r3Var == null ? 0 : r3Var.hashCode())) * 31;
        t3 t3Var = this.d;
        int hashCode4 = (hashCode3 + (t3Var == null ? 0 : t3Var.hashCode())) * 31;
        u3 u3Var = this.e;
        return hashCode4 + (u3Var != null ? u3Var.hashCode() : 0);
    }

    public final String toString() {
        return "FileType(__typename=" + this.a + ", onMarkdownFileType=" + this.b + ", onImageFileType=" + this.c + ", onPdfFileType=" + this.d + ", onTextFileType=" + this.e + ")";
    }
}
