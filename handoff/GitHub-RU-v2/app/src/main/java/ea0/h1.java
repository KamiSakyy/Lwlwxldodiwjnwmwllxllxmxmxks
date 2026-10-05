package ea0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h1 {
    public final String a;
    public final r70.f b;

    public h1(String str, r70.f fVar) {
        this.a = str;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return k71.k.b(this.a, h1Var.a) && k71.k.b(this.b, h1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ItemShowcase(__typename=" + this.a + ", itemShowcaseFragment=" + this.b + ")";
    }
}
