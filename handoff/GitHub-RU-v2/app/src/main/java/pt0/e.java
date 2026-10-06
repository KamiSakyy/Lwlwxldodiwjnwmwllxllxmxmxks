package pt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public String a;
    public c b;

    public e(String str, c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        c cVar = this.b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "OldTreeEntry(path=" + this.a + ", fileType=" + this.b + ")";
    }
    public static Object z(Object p1, Object p2, Object p3) { return null; }
}
