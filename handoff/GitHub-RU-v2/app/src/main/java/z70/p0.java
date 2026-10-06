package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p0 {
    public String a;
    public h0 b;

    public p0(String str, h0 h0Var) {
        this.a = str;
        this.b = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return k71.k.b(this.a, p0Var.a) && k71.k.b(this.b, p0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        h0 h0Var = this.b;
        return hashCode + (h0Var != null ? h0Var.hashCode() : 0);
    }

    public final String toString() {
        return "OldTreeEntry(path=" + this.a + ", fileType=" + this.b + ")";
    }
}
