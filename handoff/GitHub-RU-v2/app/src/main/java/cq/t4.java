package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t4 {
    public String a;
    public String b;

    public t4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        return k71.k.b(this.a, t4Var.a) && k71.k.b(this.b, t4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Target(id=", this.a, ", oid=", this.b, ")");
    }
}
