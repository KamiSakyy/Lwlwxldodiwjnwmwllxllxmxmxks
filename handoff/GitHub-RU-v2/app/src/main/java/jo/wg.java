package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wg {
    public String a;
    public ug b;

    public wg(String str, ug ugVar) {
        this.a = str;
        this.b = ugVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg)) {
            return false;
        }
        wg wgVar = (wg) obj;
        return k71.k.b(this.a, wgVar.a) && k71.k.b(this.b, wgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnCommit(id=" + this.a + ", history=" + this.b + ")";
    }
}
