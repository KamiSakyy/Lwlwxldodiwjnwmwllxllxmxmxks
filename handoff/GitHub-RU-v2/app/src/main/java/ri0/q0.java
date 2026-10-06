package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q0 {
    public String a;
    public i0 b;

    public q0(String str, i0 i0Var) {
        this.a = str;
        this.b = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.a, q0Var.a) && k71.k.b(this.b, q0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        i0 i0Var = this.b;
        return hashCode + (i0Var != null ? i0Var.hashCode() : 0);
    }

    public final String toString() {
        return "OldTreeEntry(path=" + this.a + ", fileType=" + this.b + ")";
    }
}
