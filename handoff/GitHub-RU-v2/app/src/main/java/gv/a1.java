package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a1 {
    public String a;
    public s0 b;

    public a1(String str, s0 s0Var) {
        this.a = str;
        this.b = s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return k71.k.b(this.a, a1Var.a) && k71.k.b(this.b, a1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        s0 s0Var = this.b;
        return hashCode + (s0Var != null ? s0Var.hashCode() : 0);
    }

    public final String toString() {
        return "OldTreeEntry(path=" + this.a + ", fileType=" + this.b + ")";
    }
}
