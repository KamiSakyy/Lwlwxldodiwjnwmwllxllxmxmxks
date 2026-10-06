package mo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public g0 a;
    public String b;

    public r(g0 g0Var, String str) {
        this.a = g0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnSponsorship(sponsorable=" + this.a + ", id=" + this.b + ")";
    }
}
