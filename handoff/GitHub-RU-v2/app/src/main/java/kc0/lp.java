package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lp {
    public final String a;
    public final String b;

    public lp(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp)) {
            return false;
        }
        lp lpVar = (lp) obj;
        return k71.k.b(this.a, lpVar.a) && k71.k.b(this.b, lpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Deployment(id=", this.a, ", __typename=", this.b, ")");
    }
}
