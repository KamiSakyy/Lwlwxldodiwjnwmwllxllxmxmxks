package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ax {
    public xw a;
    public zw b;
    public String c;
    public String d;

    public ax(xw xwVar, zw zwVar, String str, String str2) {
        this.a = xwVar;
        this.b = zwVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax)) {
            return false;
        }
        ax axVar = (ax) obj;
        return k71.k.b(this.a, axVar.a) && k71.k.b(this.b, axVar.b) && k71.k.b(this.c, axVar.c) && k71.k.b(this.d, axVar.d);
    }

    public final int hashCode() {
        xw xwVar = this.a;
        int hashCode = (xwVar == null ? 0 : xwVar.hashCode()) * 31;
        zw zwVar = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (zwVar != null ? zwVar.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(defaultBranchRef=");
        sb.append(this.a);
        sb.append(", refs=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
