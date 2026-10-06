package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sn {
    public String a;
    public qn b;
    public String c;

    public sn(String str, qn qnVar, String str2) {
        this.a = str;
        this.b = qnVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn)) {
            return false;
        }
        sn snVar = (sn) obj;
        return k71.k.b(this.a, snVar.a) && k71.k.b(this.b, snVar.b) && k71.k.b(this.c, snVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        qn qnVar = this.b;
        return this.c.hashCode() + ((hashCode + (qnVar == null ? 0 : qnVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationDiscussionsRepository(id=");
        sb.append(this.a);
        sb.append(", discussion=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
