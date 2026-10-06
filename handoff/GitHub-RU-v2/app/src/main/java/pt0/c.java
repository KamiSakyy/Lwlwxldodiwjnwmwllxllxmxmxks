package pt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final String a;
    public final f b;

    public c(String str, f fVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f fVar = this.b;
        return hashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        return "FileType(__typename=" + this.a + ", onImageFileType=" + this.b + ")";
    }
    public Object b(Object p1) { return null; }
    public static final Object a = null;
    public static final Object f = null;
    public static final Object i = null;
}
