package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qc {
    public final String a;
    public final pc b;
    public final String c;

    public qc(String str, pc pcVar, String str2) {
        this.a = str;
        this.b = pcVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc)) {
            return false;
        }
        qc qcVar = (qc) obj;
        return k71.k.b(this.a, qcVar.a) && k71.k.b(this.b, qcVar.b) && k71.k.b(this.c, qcVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pc pcVar = this.b;
        return this.c.hashCode() + ((hashCode + (pcVar == null ? 0 : pcVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", pullRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
