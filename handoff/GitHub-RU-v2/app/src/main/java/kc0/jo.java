package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jo {
    public final String a;
    public final String b;
    public final ko c;

    public jo(String str, String str2, ko koVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = koVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo)) {
            return false;
        }
        jo joVar = (jo) obj;
        return k71.k.b(this.a, joVar.a) && k71.k.b(this.b, joVar.b) && k71.k.b(this.c, joVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ko koVar = this.c;
        return i + (koVar == null ? 0 : koVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequestReview=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
