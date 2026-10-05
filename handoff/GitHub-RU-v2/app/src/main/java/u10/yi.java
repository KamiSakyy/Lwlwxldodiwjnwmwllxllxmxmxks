package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yi {
    public final String a;
    public final String b;
    public final aj c;
    public final bj d;
    public final zi e;

    public yi(String str, String str2, aj ajVar, bj bjVar, zi ziVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = ajVar;
        this.d = bjVar;
        this.e = ziVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi)) {
            return false;
        }
        yi yiVar = (yi) obj;
        return k71.k.b(this.a, yiVar.a) && k71.k.b(this.b, yiVar.b) && k71.k.b(this.c, yiVar.c) && k71.k.b(this.d, yiVar.d) && k71.k.b(this.e, yiVar.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        aj ajVar = this.c;
        int hashCode = (i + (ajVar == null ? 0 : ajVar.hashCode())) * 31;
        bj bjVar = this.d;
        int hashCode2 = (hashCode + (bjVar == null ? 0 : bjVar.hashCode())) * 31;
        zi ziVar = this.e;
        return hashCode2 + (ziVar != null ? ziVar.hashCode() : 0);
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
