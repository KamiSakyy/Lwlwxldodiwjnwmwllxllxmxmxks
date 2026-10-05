package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gw {
    public final String a;
    public final bl0.a b;

    public gw(String str, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw)) {
            return false;
        }
        gw gwVar = (gw) obj;
        return k71.k.b(this.a, gwVar.a) && k71.k.b(this.b, gwVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bl0.a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "GitObject(__typename=" + this.a + ", nodeIdFragment=" + this.b + ")";
    }
}
