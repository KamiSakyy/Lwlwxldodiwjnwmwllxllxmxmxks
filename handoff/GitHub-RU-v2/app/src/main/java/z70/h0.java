package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 {
    public String a;
    public q0 b;

    public h0(String str, q0 q0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return k71.k.b(this.a, h0Var.a) && k71.k.b(this.b, h0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q0 q0Var = this.b;
        return hashCode + (q0Var == null ? 0 : q0Var.hashCode());
    }

    public final String toString() {
        return "FileType(__typename=" + this.a + ", onImageFileType=" + this.b + ")";
    }
}
