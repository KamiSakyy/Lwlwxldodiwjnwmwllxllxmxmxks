package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r {
    public String a;
    public q b;
    public String c;

    public r(String str, q qVar, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "__typename");
        this.a = str;
        this.b = qVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && k71.k.b(this.c, rVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q qVar = this.b;
        return this.c.hashCode() + ((hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollOption(id=");
        sb.append(this.a);
        sb.append(", poll=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
