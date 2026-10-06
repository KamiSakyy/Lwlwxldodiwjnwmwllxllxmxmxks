package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ef {
    public String a;
    public ss.a b;

    public ef(String str, ss.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef)) {
            return false;
        }
        ef efVar = (ef) obj;
        return k71.k.b(this.a, efVar.a) && k71.k.b(this.b, efVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Filter(__typename=" + this.a + ", feedFiltersFragment=" + this.b + ")";
    }
}
