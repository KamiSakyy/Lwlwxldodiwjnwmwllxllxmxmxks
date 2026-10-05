package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ch {
    public final String a;
    public final dh b;
    public final eh c;

    public ch(String str, dh dhVar, eh ehVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = dhVar;
        this.c = ehVar;
    }

    public static ch a(ch chVar, eh ehVar) {
        String str = chVar.a;
        dh dhVar = chVar.b;
        chVar.getClass();
        k71.k.g(str, "__typename");
        return new ch(str, dhVar, ehVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch)) {
            return false;
        }
        ch chVar = (ch) obj;
        return k71.k.b(this.a, chVar.a) && k71.k.b(this.b, chVar.b) && k71.k.b(this.c, chVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dh dhVar = this.b;
        int hashCode2 = (hashCode + (dhVar == null ? 0 : dhVar.a.hashCode())) * 31;
        eh ehVar = this.c;
        return hashCode2 + (ehVar != null ? ehVar.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onNode=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
