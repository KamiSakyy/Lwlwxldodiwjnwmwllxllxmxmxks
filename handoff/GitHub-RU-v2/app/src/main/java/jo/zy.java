package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zy {
    public String a;
    public String b;
    public dw.m3 c;
    public dw.o d;

    public zy(String str, String str2, dw.m3 m3Var, dw.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = m3Var;
        this.d = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy)) {
            return false;
        }
        zy zyVar = (zy) obj;
        return k71.k.b(this.a, zyVar.a) && k71.k.b(this.b, zyVar.b) && k71.k.b(this.c, zyVar.c) && k71.k.b(this.d, zyVar.d);
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
