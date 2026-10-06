package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uc {
    public String a;
    public int b;
    public String c;
    public oj0.e2 d;

    public uc(String str, int i, String str2, oj0.e2 e2Var) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = e2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc)) {
            return false;
        }
        uc ucVar = (uc) obj;
        return k71.k.b(this.a, ucVar.a) && this.b == ucVar.b && k71.k.b(this.c, ucVar.c) && k71.k.b(this.d, ucVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "Node(__typename=", this.a, ", contributorsCount=", ", id=");
        n.append(this.c);
        n.append(", repositoryListItemFragment=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
