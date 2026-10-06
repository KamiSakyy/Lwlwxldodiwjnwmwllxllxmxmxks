package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class px {
    public final String a;
    public final String b;
    public final qx c;

    public px(String str, String str2, qx qxVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = qxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px)) {
            return false;
        }
        px pxVar = (px) obj;
        return k71.k.b(this.a, pxVar.a) && k71.k.b(this.b, pxVar.b) && k71.k.b(this.c, pxVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        qx qxVar = this.c;
        return i + (qxVar == null ? 0 : qxVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
