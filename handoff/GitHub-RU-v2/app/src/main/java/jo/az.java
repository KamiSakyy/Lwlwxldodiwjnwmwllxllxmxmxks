package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class az {
    public String a;
    public String b;
    public dw.m3 c;
    public dw.o d;

    public az(String str, String str2, dw.m3 m3Var, dw.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = m3Var;
        this.d = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        return k71.k.b(this.a, azVar.a) && k71.k.b(this.b, azVar.b) && k71.k.b(this.c, azVar.c) && k71.k.b(this.d, azVar.d);
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
}
