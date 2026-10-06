package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mj {
    public String a;
    public String b;
    public nj c;

    public mj(String str, String str2, nj njVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = njVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj)) {
            return false;
        }
        mj mjVar = (mj) obj;
        return k71.k.b(this.a, mjVar.a) && k71.k.b(this.b, mjVar.b) && k71.k.b(this.c, mjVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        nj njVar = this.c;
        return i + (njVar == null ? 0 : njVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequest=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
