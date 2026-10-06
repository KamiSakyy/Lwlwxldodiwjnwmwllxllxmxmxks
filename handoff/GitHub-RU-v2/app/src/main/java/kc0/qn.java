package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qn {
    public String a;
    public String b;
    public wk0.j c;

    public qn(String str, String str2, wk0.j jVar) {
        this.a = str;
        this.b = str2;
        this.c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn)) {
            return false;
        }
        qn qnVar = (qn) obj;
        return k71.k.b(this.a, qnVar.a) && k71.k.b(this.b, qnVar.b) && k71.k.b(this.c, qnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Viewer(__typename=", this.a, ", id=", this.b, ", homePinnedItems=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
