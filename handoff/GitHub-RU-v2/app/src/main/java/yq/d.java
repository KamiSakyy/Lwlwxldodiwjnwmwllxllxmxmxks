package yq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public final String a;
    public final f b;
    public final g c;
    public final vx.a d;

    public d(String str, f fVar, g gVar, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = fVar;
        this.c = gVar;
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
        f fVar = this.b;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        g gVar = this.c;
        int hashCode3 = (hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        vx.a aVar = this.d;
        return hashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "Closer(__typename=" + this.a + ", onCommit=" + this.b + ", onPullRequest=" + this.c + ", nodeIdFragment=" + this.d + ")";
    }
}
