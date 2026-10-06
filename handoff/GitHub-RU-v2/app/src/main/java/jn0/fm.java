package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fm {
    public String a;
    public String b;
    public gm c;

    public fm(String str, String str2, gm gmVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = gmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm)) {
            return false;
        }
        fm fmVar = (fm) obj;
        return k71.k.b(this.a, fmVar.a) && k71.k.b(this.b, fmVar.b) && k71.k.b(this.c, fmVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        gm gmVar = this.c;
        return i + (gmVar == null ? 0 : gmVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequest=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
