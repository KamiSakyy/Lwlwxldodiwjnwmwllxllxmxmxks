package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class he {
    public String a;
    public kr0.a b;

    public he(String str, kr0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he)) {
            return false;
        }
        he heVar = (he) obj;
        return k71.k.b(this.a, heVar.a) && k71.k.b(this.b, heVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Filter(__typename=" + this.a + ", feedFiltersFragment=" + this.b + ")";
    }
}
