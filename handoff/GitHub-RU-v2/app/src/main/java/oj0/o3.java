package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o3 implements aa.h0 {
    public String a;
    public String b;

    public o3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return k71.k.b(this.a, o3Var.a) && k71.k.b(this.b, o3Var.b);
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
