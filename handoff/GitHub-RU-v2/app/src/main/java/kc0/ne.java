package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ne {
    public final String a;
    public final oe b;
    public final pe c;

    public ne(String str, oe oeVar, pe peVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = oeVar;
        this.c = peVar;
    }

    public static ne a(ne neVar, pe peVar) {
        String str = neVar.a;
        oe oeVar = neVar.b;
        neVar.getClass();
        k71.k.g(str, "__typename");
        return new ne(str, oeVar, peVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne)) {
            return false;
        }
        ne neVar = (ne) obj;
        return k71.k.b(this.a, neVar.a) && k71.k.b(this.b, neVar.b) && k71.k.b(this.c, neVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        oe oeVar = this.b;
        int hashCode2 = (hashCode + (oeVar == null ? 0 : oeVar.a.hashCode())) * 31;
        pe peVar = this.c;
        return hashCode2 + (peVar != null ? peVar.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onNode=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
