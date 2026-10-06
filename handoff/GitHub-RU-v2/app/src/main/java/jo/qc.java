package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qc implements aaShadow.v0 {
    public sc a;
    public String b;
    public String c;

    public qc(sc scVar, String str, String str2) {
        this.a = scVar;
        this.b = str;
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
        sc scVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((scVar == null ? 0 : scVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
