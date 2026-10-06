package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class iy {
    public int a;
    public hy b;
    public cy c;
    public String d;
    public String e;

    public iy(int i, hy hyVar, cy cyVar, String str, String str2) {
        this.a = i;
        this.b = hyVar;
        this.c = cyVar;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy)) {
            return false;
        }
        iy iyVar = (iy) obj;
        return this.a == iyVar.a && k71.k.b(this.b, iyVar.b) && k71.k.b(this.c, iyVar.c) && k71.k.b(this.d, iyVar.d) && k71.k.b(this.e, iyVar.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        hy hyVar = this.b;
        int hashCode2 = (hashCode + (hyVar == null ? 0 : hyVar.hashCode())) * 31;
        cy cyVar = this.c;
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i((hashCode2 + (cyVar != null ? cyVar.hashCode() : 0)) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(planLimit=");
        sb.append(this.a);
        sb.append(", pullRequest=");
        sb.append(this.b);
        sb.append(", collaborators=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
