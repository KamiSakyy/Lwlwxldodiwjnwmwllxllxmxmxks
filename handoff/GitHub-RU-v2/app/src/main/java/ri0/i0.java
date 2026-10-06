package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 {
    public String a;
    public r0 b;

    public i0(String str, r0 r0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return k71.k.b(this.a, i0Var.a) && k71.k.b(this.b, i0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r0 r0Var = this.b;
        return hashCode + (r0Var == null ? 0 : r0Var.hashCode());
    }

    public final String toString() {
        return "FileType(__typename=" + this.a + ", onImageFileType=" + this.b + ")";
    }
}
