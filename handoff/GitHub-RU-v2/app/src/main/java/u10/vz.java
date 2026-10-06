package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vz {
    public String a;
    public String b;
    public w80.a2 c;
    public w80.h d;

    public vz(String str, String str2, w80.a2 a2Var, w80.h hVar) {
        this.a = str;
        this.b = str2;
        this.c = a2Var;
        this.d = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz)) {
            return false;
        }
        vz vzVar = (vz) obj;
        return k71.k.b(this.a, vzVar.a) && k71.k.b(this.b, vzVar.b) && k71.k.b(this.c, vzVar.c) && k71.k.b(this.d, vzVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", repositoryListItemFragment=");
        o.append(this.c);
        o.append(", issueTemplateFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
    public vz(String p1, String p2, Object p3, Object p4) {
    }
}
