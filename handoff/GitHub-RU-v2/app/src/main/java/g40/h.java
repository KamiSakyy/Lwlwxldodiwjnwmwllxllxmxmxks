package g40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public String a;
    public p b;

    public h(String str, p pVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p pVar = this.b;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    public final String toString() {
        return "FileType(__typename=" + this.a + ", onImageFileType=" + this.b + ")";
    }
}
