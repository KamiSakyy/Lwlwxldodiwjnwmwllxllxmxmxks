package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e2 {
    public final String a;
    public final String b;

    public e2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return k71.k.b(this.a, e2Var.a) && k71.k.b(this.b, e2Var.b);
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
