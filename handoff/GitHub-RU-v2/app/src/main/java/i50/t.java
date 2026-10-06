package i50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public String a;
    public r b;
    public s c;
    public String d;

    public t(String str, r rVar, s sVar, String str2) {
        this.a = str;
        this.b = rVar;
        this.c = sVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return k71.k.b(this.a, tVar.a) && k71.k.b(this.b, tVar.b) && k71.k.b(this.c, tVar.c) && k71.k.b(this.d, tVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r rVar = this.b;
        int hashCode2 = (hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        s sVar = this.c;
        return this.d.hashCode() + ((hashCode2 + (sVar != null ? sVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Discussion(id=" + this.a + ", answer=" + this.b + ", answerChosenBy=" + this.c + ", __typename=" + this.d + ")";
    }
}
