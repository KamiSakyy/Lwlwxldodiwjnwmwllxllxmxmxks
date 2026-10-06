package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vh0 {
    public final String a;
    public final String b;

    public vh0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh0)) {
            return false;
        }
        vh0 vh0Var = (vh0) obj;
        return k71.k.b(this.a, vh0Var.a) && k71.k.b(this.b, vh0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return x.i.g("SuggestedListName(id=", this.a, ", name=", this.b, ")");
    }
}
