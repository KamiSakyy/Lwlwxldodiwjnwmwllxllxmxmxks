package g40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public int a;
    public int b;
    public int c;
    public t d;

    public e(int i, int i2, int i3, t tVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && k71.k.b(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.s0.b(this.c, a0.s0.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m = x.i.m(this.a, this.b, "Diff(linesAdded=", ", linesDeleted=", ", filesChanged=");
        m.append(this.c);
        m.append(", patches=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
