package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t30 {
    public final String a;
    public final String b;

    public t30(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t30)) {
            return false;
        }
        t30 t30Var = (t30) obj;
        return k71.k.b(this.a, t30Var.a) && k71.k.b(this.b, t30Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return x.i.g("Readme(contentHTML=", this.a, ", path=", this.b, ")");
    }
}
