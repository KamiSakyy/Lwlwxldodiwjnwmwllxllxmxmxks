package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vd {
    public final String a;
    public final String b;
    public final gv.b c;

    public vd(String str, String str2, gv.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return k71.k.b(this.a, vdVar.a) && k71.k.b(this.b, vdVar.b) && k71.k.b(this.c, vdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequest(__typename=", this.a, ", id=", this.b, ", autoMergeRequestFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
