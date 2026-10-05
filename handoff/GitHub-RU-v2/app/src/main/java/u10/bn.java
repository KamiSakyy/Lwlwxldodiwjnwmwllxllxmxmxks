package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bn {
    public final String a;
    public final a50.a b;

    public bn(String str, a50.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn)) {
            return false;
        }
        bn bnVar = (bn) obj;
        return k71.k.b(this.a, bnVar.a) && k71.k.b(this.b, bnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
}
