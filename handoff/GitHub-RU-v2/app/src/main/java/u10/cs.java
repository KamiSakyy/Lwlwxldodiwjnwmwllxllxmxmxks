package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cs {
    public final String a;
    public final String b;
    public final w80.a2 c;
    public final w80.h d;

    public cs(String str, String str2, w80.a2 a2Var, w80.h hVar) {
        this.a = str;
        this.b = str2;
        this.c = a2Var;
        this.d = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs)) {
            return false;
        }
        cs csVar = (cs) obj;
        return k71.k.b(this.a, csVar.a) && k71.k.b(this.b, csVar.b) && k71.k.b(this.c, csVar.c) && k71.k.b(this.d, csVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(__typename=", this.a, ", id=", this.b, ", repositoryListItemFragment=");
        o.append(this.c);
        o.append(", issueTemplateFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
