package yf0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u {
    public final String a;
    public final s b;
    public final t c;
    public final String d;

    public u(String str, s sVar, t tVar, String str2) {
        this.a = str;
        this.b = sVar;
        this.c = tVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && k71.k.b(this.b, uVar.b) && k71.k.b(this.c, uVar.c) && k71.k.b(this.d, uVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s sVar = this.b;
        int hashCode2 = (hashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        t tVar = this.c;
        return this.d.hashCode() + ((hashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Discussion(id=" + this.a + ", answer=" + this.b + ", answerChosenBy=" + this.c + ", __typename=" + this.d + ")";
    }
}
