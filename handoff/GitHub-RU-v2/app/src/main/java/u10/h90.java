package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h90 {
    public String a;
    public String b;

    public h90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h90)) {
            return false;
        }
        h90 h90Var = (h90) obj;
        return k71.k.b(this.a, h90Var.a) && k71.k.b(this.b, h90Var.b);
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
