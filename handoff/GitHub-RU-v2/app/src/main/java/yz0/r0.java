package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r0 {
    public String a;
    public String b;

    public r0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return k71.k.b(this.a, r0Var.a) && k71.k.b(this.b, r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Commit(id=", this.a, ", abbreviatedOid=", qb.b.a(this.b), ")");
    }
}
