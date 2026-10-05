package pi0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final String a;
    public final d b;

    public c(String str, d dVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = dVar;
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
        d dVar = this.b;
        return hashCode + (dVar == null ? 0 : dVar.a.hashCode());
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onNode=" + this.b + ")";
    }
}
