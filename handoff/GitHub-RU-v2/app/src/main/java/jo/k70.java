package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k70 {
    public final n70 a;

    public k70(n70 n70Var) {
        this.a = n70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k70) && k71.k.b(this.a, ((k70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSponsorable(sponsorshipsAsSponsor=" + this.a + ")";
    }
}
