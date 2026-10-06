package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rt {
    public String a;
    public int b;
    public tt c;
    public String d;

    public rt(String str, int i, tt ttVar, String str2) {
        this.a = str;
        this.b = i;
        this.c = ttVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt)) {
            return false;
        }
        rt rtVar = (rt) obj;
        return k71.k.b(this.a, rtVar.a) && this.b == rtVar.b && k71.k.b(this.c, rtVar.c) && k71.k.b(this.d, rtVar.d);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, this.a.hashCode() * 31, 31);
        tt ttVar = this.c;
        return this.d.hashCode() + ((b + (ttVar == null ? 0 : ttVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "Node(id=", this.a, ", position=", ", pullRequest=");
        n.append(this.c);
        n.append(", __typename=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
