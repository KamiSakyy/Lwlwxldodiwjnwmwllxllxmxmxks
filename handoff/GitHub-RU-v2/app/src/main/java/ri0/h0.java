package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h0 {
    public String a;
    public k b;

    public h0(String str, k kVar) {
        this.a = str;
        this.b = kVar;
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
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FileType1(__typename=" + this.a + ", fileTypeFragment=" + this.b + ")";
    }
}
