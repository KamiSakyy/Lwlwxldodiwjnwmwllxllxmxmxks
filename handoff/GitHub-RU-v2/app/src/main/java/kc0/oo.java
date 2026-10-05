package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oo {
    public final String a;
    public final String b;
    public final oj0.e2 c;
    public final oj0.h d;

    public oo(String str, String str2, oj0.e2 e2Var, oj0.h hVar) {
        this.a = str;
        this.b = str2;
        this.c = e2Var;
        this.d = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo)) {
            return false;
        }
        oo ooVar = (oo) obj;
        return k71.k.b(this.a, ooVar.a) && k71.k.b(this.b, ooVar.b) && k71.k.b(this.c, ooVar.c) && k71.k.b(this.d, ooVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", repositoryListItemFragment=");
        o.append(this.c);
        o.append(", issueTemplateFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
