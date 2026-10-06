package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g8 {
    public String a;
    public String b;

    public g8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8)) {
            return false;
        }
        g8 g8Var = (g8) obj;
        return k71.k.b(this.a, g8Var.a) && k71.k.b(this.b, g8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("UserListSuggestion(name=", this.a, ", id=", this.b, ")");
    }
}
