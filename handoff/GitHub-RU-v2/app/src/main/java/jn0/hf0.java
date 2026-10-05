package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hf0 {
    public final String a;
    public final String b;

    public hf0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf0)) {
            return false;
        }
        hf0 hf0Var = (hf0) obj;
        return k71.k.b(this.a, hf0Var.a) && k71.k.b(this.b, hf0Var.b);
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
