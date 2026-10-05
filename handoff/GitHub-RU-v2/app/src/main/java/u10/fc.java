package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fc {
    public final String a;
    public final a50.a b;

    public fc(String str, a50.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc)) {
            return false;
        }
        fc fcVar = (fc) obj;
        return k71.k.b(this.a, fcVar.a) && k71.k.b(this.b, fcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
}
