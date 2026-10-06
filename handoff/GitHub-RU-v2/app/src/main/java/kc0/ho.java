package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ho {
    public final String a;
    public final mo b;
    public final lo c;

    public ho(String str, mo moVar, lo loVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = moVar;
        this.c = loVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho)) {
            return false;
        }
        ho hoVar = (ho) obj;
        return k71.k.b(this.a, hoVar.a) && k71.k.b(this.b, hoVar.b) && k71.k.b(this.c, hoVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mo moVar = this.b;
        int hashCode2 = (hashCode + (moVar == null ? 0 : moVar.hashCode())) * 31;
        lo loVar = this.c;
        return hashCode2 + (loVar != null ? loVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", onPullRequestReviewThread=" + this.b + ", onPullRequestReviewComment=" + this.c + ")";
    }
}
