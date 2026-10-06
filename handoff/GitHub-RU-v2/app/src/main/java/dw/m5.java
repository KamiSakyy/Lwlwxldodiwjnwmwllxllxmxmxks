package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m5 implements aa.h0 {
    public final String a;
    public final String b;

    public m5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        return k71.k.b(this.a, m5Var.a) && k71.k.b(this.b, m5Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return x.i.g("RepositoryReadmeFragment(contentHTML=", this.a, ", path=", this.b, ")");
    }
}
