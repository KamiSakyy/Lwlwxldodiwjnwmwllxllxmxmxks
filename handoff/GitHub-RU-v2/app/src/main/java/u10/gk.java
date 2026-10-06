package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gk {
    public String a;
    public hk b;
    public y60.a c;

    public gk(String str, hk hkVar, y60.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = hkVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk)) {
            return false;
        }
        gk gkVar = (gk) obj;
        return k71.k.b(this.a, gkVar.a) && k71.k.b(this.b, gkVar.b) && k71.k.b(this.c, gkVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hk hkVar = this.b;
        return this.c.hashCode() + ((hashCode + (hkVar == null ? 0 : hkVar.a.hashCode())) * 31);
    }

    public final String toString() {
        return "MinimizedComment(__typename=" + this.a + ", onNode=" + this.b + ", minimizableCommentFragment=" + this.c + ")";
    }
}
