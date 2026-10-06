package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qe {
    public final String a;
    public final ne b;
    public final String c;

    public qe(String str, ne neVar, String str2) {
        this.a = str;
        this.b = neVar;
        this.c = str2;
    }

    public static qe a(qe qeVar, ne neVar) {
        String str = qeVar.a;
        String str2 = qeVar.c;
        qeVar.getClass();
        return new qe(str, neVar, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe)) {
            return false;
        }
        qe qeVar = (qe) obj;
        return k71.k.b(this.a, qeVar.a) && k71.k.b(this.b, qeVar.b) && k71.k.b(this.c, qeVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ne neVar = this.b;
        return this.c.hashCode() + ((hashCode + (neVar == null ? 0 : neVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", issueOrPullRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
