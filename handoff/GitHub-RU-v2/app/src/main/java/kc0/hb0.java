package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hb0 {
    public final String a;
    public final String b;

    public hb0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb0)) {
            return false;
        }
        hb0 hb0Var = (hb0) obj;
        return k71.k.b(this.a, hb0Var.a) && k71.k.b(this.b, hb0Var.b);
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
