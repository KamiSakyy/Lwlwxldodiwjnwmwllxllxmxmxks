package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yy {
    public final String a;
    public final az b;
    public final bz c;
    public final bl0.a d;

    public yy(String str, az azVar, bz bzVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = azVar;
        this.c = bzVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy)) {
            return false;
        }
        yy yyVar = (yy) obj;
        return k71.k.b(this.a, yyVar.a) && k71.k.b(this.b, yyVar.b) && k71.k.b(this.c, yyVar.c) && k71.k.b(this.d, yyVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        az azVar = this.b;
        int hashCode2 = (hashCode + (azVar == null ? 0 : azVar.hashCode())) * 31;
        bz bzVar = this.c;
        int hashCode3 = (hashCode2 + (bzVar == null ? 0 : bzVar.hashCode())) * 31;
        bl0.a aVar = this.d;
        return hashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ", nodeIdFragment=" + this.d + ")";
    }
}
