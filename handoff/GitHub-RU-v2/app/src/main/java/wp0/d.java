package wp0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public String a;
    public e b;
    public f c;
    public kw0.a d;

    public d(String str, e eVar, f fVar, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = eVar;
        this.c = fVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b) && k71.k.b(this.c, dVar.c) && k71.k.b(this.d, dVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e eVar = this.b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        f fVar = this.c;
        int hashCode3 = (hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        kw0.a aVar = this.d;
        return hashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "Closer(__typename=" + this.a + ", onCommit=" + this.b + ", onPullRequest=" + this.c + ", nodeIdFragment=" + this.d + ")";
    }
}
