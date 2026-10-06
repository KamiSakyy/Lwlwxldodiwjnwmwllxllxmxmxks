package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 {
    public String a;
    public String b;

    public w0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return k71.k.b(this.a, w0Var.a) && k71.k.b(this.b, w0Var.b);
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
