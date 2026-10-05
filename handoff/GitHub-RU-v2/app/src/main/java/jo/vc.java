package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vc implements aa.v0 {
    public final wc a;
    public final String b;
    public final String c;

    public vc(wc wcVar, String str, String str2) {
        this.a = wcVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc)) {
            return false;
        }
        vc vcVar = (vc) obj;
        return k71.k.b(this.a, vcVar.a) && k71.k.b(this.b, vcVar.b) && k71.k.b(this.c, vcVar.c);
    }

    public final int hashCode() {
        wc wcVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((wcVar == null ? 0 : wcVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
