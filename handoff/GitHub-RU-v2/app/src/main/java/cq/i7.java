package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i7 {
    public String a;
    public String b;

    public i7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj;
        return k71.k.b(this.a, i7Var.a) && k71.k.b(this.b, i7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Owner(id=", this.a, ", login=", this.b, ")");
    }
}
