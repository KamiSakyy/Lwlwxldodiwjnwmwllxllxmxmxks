package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zt {
    public final String a;
    public final String b;
    public final au c;

    public zt(String str, String str2, au auVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = auVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt)) {
            return false;
        }
        zt ztVar = (zt) obj;
        return k71.k.b(this.a, ztVar.a) && k71.k.b(this.b, ztVar.b) && k71.k.b(this.c, ztVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        au auVar = this.c;
        return i + (auVar == null ? 0 : auVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
