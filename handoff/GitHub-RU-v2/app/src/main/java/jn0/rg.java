package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rg {
    public ng a;
    public mg b;

    public rg(ng ngVar, mg mgVar) {
        this.a = ngVar;
        this.b = mgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg)) {
            return false;
        }
        rg rgVar = (rg) obj;
        return k71.k.b(this.a, rgVar.a) && k71.k.b(this.b, rgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnUser(following=" + this.a + ", followers=" + this.b + ")";
    }
}
