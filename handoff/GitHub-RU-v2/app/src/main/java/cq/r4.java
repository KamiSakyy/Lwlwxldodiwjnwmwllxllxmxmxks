package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r4 {
    public final String a;
    public final String b;

    public r4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj;
        return k71.k.b(this.a, r4Var.a) && k71.k.b(this.b, r4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Owner(id=", this.a, ", avatarUrl=", this.b, ")");
    }
}
