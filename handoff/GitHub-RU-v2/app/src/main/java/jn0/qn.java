package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qn {
    public final nnShadow a;
    public final String b;
    public final String c;

    public qn(nnShadow nnVar, String str, String str2) {
        this.a = nnVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn)) {
            return false;
        }
        qn qnVar = (qn) obj;
        return k71.k.b(this.a, qnVar.a) && k71.k.b(this.b, qnVar.b) && k71.k.b(this.c, qnVar.c);
    }

    public final int hashCode() {
        nnShadow nnVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((nnVar == null ? 0 : nnVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Discussion(comment=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
