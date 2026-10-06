package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ju {
    public final int a;
    public final iu b;
    public final du c;
    public final String d;
    public final String e;

    public ju(int i, iu iuVar, du duVar, String str, String str2) {
        this.a = i;
        this.b = iuVar;
        this.c = duVar;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju)) {
            return false;
        }
        ju juVar = (ju) obj;
        return this.a == juVar.a && k71.k.b(this.b, juVar.b) && k71.k.b(this.c, juVar.c) && k71.k.b(this.d, juVar.d) && k71.k.b(this.e, juVar.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        iu iuVar = this.b;
        int hashCode2 = (hashCode + (iuVar == null ? 0 : iuVar.hashCode())) * 31;
        du duVar = this.c;
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i((hashCode2 + (duVar != null ? duVar.hashCode() : 0)) * 31, this.d, 31);
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
