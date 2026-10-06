package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sy {
    public String a;
    public c60.j b;

    public sy(String str, c60.j jVar) {
        this.a = str;
        this.b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy)) {
            return false;
        }
        sy syVar = (sy) obj;
        return k71.k.b(this.a, syVar.a) && k71.k.b(this.b, syVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LabelableRecord(__typename=" + this.a + ", labelsFragment=" + this.b + ")";
    }
    public sy(String p1, Object p2) {
    }
}
