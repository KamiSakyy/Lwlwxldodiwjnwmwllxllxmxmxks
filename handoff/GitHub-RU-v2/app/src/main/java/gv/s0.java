package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 {
    public final String a;
    public final b1 b;

    public s0(String str, b1 b1Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return k71.k.b(this.a, s0Var.a) && k71.k.b(this.b, s0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b1 b1Var = this.b;
        return hashCode + (b1Var == null ? 0 : b1Var.hashCode());
    }

    public final String toString() {
        return "FileType(__typename=" + this.a + ", onImageFileType=" + this.b + ")";
    }
}
