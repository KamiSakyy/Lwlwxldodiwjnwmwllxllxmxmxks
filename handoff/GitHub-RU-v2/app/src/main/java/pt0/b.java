package pt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public String a;
    public xt0.k b;

    public b(String str, xt0.k kVar) {
        this.a = str;
        this.b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FileType1(__typename=" + this.a + ", fileTypeFragment=" + this.b + ")";
    }
}
