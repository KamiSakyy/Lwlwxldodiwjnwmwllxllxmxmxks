package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oh {
    public kh a;
    public jh b;

    public oh(kh khVar, jh jhVar) {
        this.a = khVar;
        this.b = jhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh)) {
            return false;
        }
        oh ohVar = (oh) obj;
        return k71.k.b(this.a, ohVar.a) && k71.k.b(this.b, ohVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnUser(following=" + this.a + ", followers=" + this.b + ")";
    }
}
