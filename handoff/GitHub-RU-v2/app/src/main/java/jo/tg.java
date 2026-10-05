package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tg {
    public final String a;
    public final wg b;
    public final vx.a c;

    public tg(String str, wg wgVar, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = wgVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg)) {
            return false;
        }
        tg tgVar = (tg) obj;
        return k71.k.b(this.a, tgVar.a) && k71.k.b(this.b, tgVar.b) && k71.k.b(this.c, tgVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wg wgVar = this.b;
        int hashCode2 = (hashCode + (wgVar == null ? 0 : wgVar.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GitObject(__typename=");
        sb.append(this.a);
        sb.append(", onCommit=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}
