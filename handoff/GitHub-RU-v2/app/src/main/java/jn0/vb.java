package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vb {
    public String a;
    public ub b;
    public String c;

    public vb(String str, ub ubVar, String str2) {
        this.a = str;
        this.b = ubVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb)) {
            return false;
        }
        vb vbVar = (vb) obj;
        return k71.k.b(this.a, vbVar.a) && k71.k.b(this.b, vbVar.b) && k71.k.b(this.c, vbVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ub ubVar = this.b;
        return this.c.hashCode() + ((hashCode + (ubVar == null ? 0 : ubVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", discussion=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
