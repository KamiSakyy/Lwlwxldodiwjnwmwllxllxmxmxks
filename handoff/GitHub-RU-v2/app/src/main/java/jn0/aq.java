package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class aq {
    public String a;
    public String b;
    public bq c;

    public aq(String str, String str2, bq bqVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = bqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        return k71.k.b(this.a, aqVar.a) && k71.k.b(this.b, aqVar.b) && k71.k.b(this.c, aqVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        bq bqVar = this.c;
        return i + (bqVar == null ? 0 : bqVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequestReview=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
