package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class da0 {
    public final String a;
    public final kr0.a b;

    public da0(String str, kr0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da0)) {
            return false;
        }
        da0 da0Var = (da0) obj;
        return k71.k.b(this.a, da0Var.a) && k71.k.b(this.b, da0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Filter(__typename=" + this.a + ", feedFiltersFragment=" + this.b + ")";
    }
}
