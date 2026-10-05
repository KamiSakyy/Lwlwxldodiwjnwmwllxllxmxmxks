package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dp {
    public final String a;
    public final String b;
    public final ep c;

    public dp(String str, String str2, ep epVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = epVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp)) {
            return false;
        }
        dp dpVar = (dp) obj;
        return k71.k.b(this.a, dpVar.a) && k71.k.b(this.b, dpVar.b) && k71.k.b(this.c, dpVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ep epVar = this.c;
        return i + (epVar == null ? 0 : epVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onReactable=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
