package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wu {
    public final String a;
    public final ru b;
    public final qu c;

    public wu(String str, ru ruVar, qu quVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = ruVar;
        this.c = quVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu)) {
            return false;
        }
        wu wuVar = (wu) obj;
        return k71.k.b(this.a, wuVar.a) && k71.k.b(this.b, wuVar.b) && k71.k.b(this.c, wuVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ru ruVar = this.b;
        int hashCode2 = (hashCode + (ruVar == null ? 0 : ruVar.hashCode())) * 31;
        qu quVar = this.c;
        return hashCode2 + (quVar != null ? quVar.hashCode() : 0);
    }

    public final String toString() {
        return "RepositoryOwner(__typename=" + this.a + ", onUser=" + this.b + ", onOrganization=" + this.c + ")";
    }
}
