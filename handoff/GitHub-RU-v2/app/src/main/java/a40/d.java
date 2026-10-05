package a40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public final String a;
    public final e b;
    public final f c;

    public d(String str, e eVar, f fVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = eVar;
        this.c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b) && k71.k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e eVar = this.b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        f fVar = this.c;
        return hashCode2 + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "Closer(__typename=" + this.a + ", onCommit=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
