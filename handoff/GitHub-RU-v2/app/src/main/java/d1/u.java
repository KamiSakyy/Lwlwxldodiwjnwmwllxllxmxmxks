package d1;

/* loaded from: /home/user/work/p/classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public long f21230a;

    /* renamed from: b, reason: collision with root package name */
    public int f21231b;

    /* renamed from: c, reason: collision with root package name */
    public int f21232c;

    /* renamed from: d, reason: collision with root package name */
    public int f21233d;

    /* renamed from: e, reason: collision with root package name */
    public int f21234e;

    /* renamed from: f, reason: collision with root package name */
    public g3.m0 f21235f;

    public u(long j10, int i, int i10, int i11, int i12, g3.m0 m0Var) {
        this.f21230a = j10;
        this.f21231b = i;
        this.f21232c = i10;
        this.f21233d = i11;
        this.f21234e = i12;
        this.f21235f = m0Var;
    }

    public final w a(int i) {
        return new w(h1.u(this.f21235f, i), i, this.f21230a);
    }

    public final g b() {
        int i = this.f21232c;
        int i10 = this.f21233d;
        return i < i10 ? g.f21081s : i > i10 ? g.f21080r : g.f21082t;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionInfo(id=");
        sb2.append(this.f21230a);
        sb2.append(", range=(");
        int i = this.f21232c;
        sb2.append(i);
        sb2.append('-');
        g3.m0 m0Var = this.f21235f;
        sb2.append(h1.u(m0Var, i));
        sb2.append(',');
        int i10 = this.f21233d;
        sb2.append(i10);
        sb2.append('-');
        sb2.append(h1.u(m0Var, i10));
        sb2.append("), prevOffset=");
        return x.i.j(sb2, this.f21234e, ')');
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class g {
        public g() {
        }
    }
}
