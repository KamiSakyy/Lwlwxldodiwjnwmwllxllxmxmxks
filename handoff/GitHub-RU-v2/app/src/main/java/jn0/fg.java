package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fg {
    public final String a;
    public final gg b;
    public final hg c;

    public fg(String str, gg ggVar, hg hgVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = ggVar;
        this.c = hgVar;
    }

    public static fg a(fg fgVar, hg hgVar) {
        String str = fgVar.a;
        gg ggVar = fgVar.b;
        fgVar.getClass();
        k71.k.g(str, "__typename");
        return new fg(str, ggVar, hgVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg)) {
            return false;
        }
        fg fgVar = (fg) obj;
        return k71.k.b(this.a, fgVar.a) && k71.k.b(this.b, fgVar.b) && k71.k.b(this.c, fgVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gg ggVar = this.b;
        int hashCode2 = (hashCode + (ggVar == null ? 0 : ggVar.a.hashCode())) * 31;
        hg hgVar = this.c;
        return hashCode2 + (hgVar != null ? hgVar.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onNode=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
