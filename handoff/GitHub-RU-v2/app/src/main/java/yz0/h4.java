package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h4 {
    public final String a;
    public final String b;

    public h4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        return k71.k.b(this.a, h4Var.a) && k71.k.b(this.b, h4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("SavedReply(title=", this.a, ", body=", this.b, ")");
    }
}
