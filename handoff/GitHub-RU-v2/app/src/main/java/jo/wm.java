package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wm {
    public final String a;
    public final String b;
    public final ym c;
    public final zm d;
    public final xm e;

    public wm(String str, String str2, ym ymVar, zm zmVar, xm xmVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = ymVar;
        this.d = zmVar;
        this.e = xmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm)) {
            return false;
        }
        wm wmVar = (wm) obj;
        return k71.k.b(this.a, wmVar.a) && k71.k.b(this.b, wmVar.b) && k71.k.b(this.c, wmVar.c) && k71.k.b(this.d, wmVar.d) && k71.k.b(this.e, wmVar.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ym ymVar = this.c;
        int hashCode = (i + (ymVar == null ? 0 : ymVar.hashCode())) * 31;
        zm zmVar = this.d;
        int hashCode2 = (hashCode + (zmVar == null ? 0 : zmVar.hashCode())) * 31;
        xm xmVar = this.e;
        return hashCode2 + (xmVar != null ? xmVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onIssue=");
        o.append(this.c);
        o.append(", onPullRequest=");
        o.append(this.d);
        o.append(", onDiscussion=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
