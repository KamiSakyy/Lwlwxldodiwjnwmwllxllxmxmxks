package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s4 implements aa.h0 {
    public String a;
    public String b;

    public s4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return k71.k.b(this.a, s4Var.a) && k71.k.b(this.b, s4Var.b);
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
