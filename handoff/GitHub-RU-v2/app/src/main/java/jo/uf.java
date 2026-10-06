package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uf {
    public final String a;
    public final vf b;

    public uf(String str, vf vfVar) {
        this.a = str;
        this.b = vfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf)) {
            return false;
        }
        uf ufVar = (uf) obj;
        return k71.k.b(this.a, ufVar.a) && k71.k.b(this.b, ufVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        vf vfVar = this.b;
        return hashCode + (vfVar != null ? vfVar.hashCode() : 0);
    }

    public final String toString() {
        return "File(extension=" + this.a + ", fileType=" + this.b + ")";
    }
}
