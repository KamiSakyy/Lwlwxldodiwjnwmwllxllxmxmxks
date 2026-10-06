package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 {
    public final String a;
    public final k b;

    public g0(String str, k kVar) {
        this.a = str;
        this.b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && k71.k.b(this.b, g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FileType1(__typename=" + this.a + ", fileTypeFragment=" + this.b + ")";
    }
}
