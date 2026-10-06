package we0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n {
    public final String a;
    public final h b;

    public n(String str, h hVar) {
        this.a = str;
        this.b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        h hVar = this.b;
        return hashCode + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "OldTreeEntry(path=" + this.a + ", fileType=" + this.b + ")";
    }
}
