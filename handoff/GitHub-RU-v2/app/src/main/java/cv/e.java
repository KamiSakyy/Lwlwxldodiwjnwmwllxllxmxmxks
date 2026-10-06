package cv;

/* loaded from: /home/user/work/p/classes3.dex */
public class e {
    public String a;
    public d b;
    public c c;

    public e(String str, d dVar, c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = dVar;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d dVar = this.b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c cVar = this.c;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "PinnedItem(__typename=" + this.a + ", onRepository=" + this.b + ", onGist=" + this.c + ")";
    }
}
