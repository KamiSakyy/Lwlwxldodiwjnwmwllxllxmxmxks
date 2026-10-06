package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class an {
    public String a;
    public String b;
    public ci0.q c;

    public an(String str, String str2, ci0.q qVar) {
        this.a = str;
        this.b = str2;
        this.c = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        return k71.k.b(this.a, anVar.a) && k71.k.b(this.b, anVar.b) && k71.k.b(this.c, anVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", organizationListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
