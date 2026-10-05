package androidx.compose.ui.layout;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class l1 {

    /* renamed from: r, reason: collision with root package name */
    public int f2002r;

    /* renamed from: s, reason: collision with root package name */
    public int f2003s;

    /* renamed from: t, reason: collision with root package name */
    public long f2004t;

    /* renamed from: u, reason: collision with root package name */
    public long f2005u = n1.f2015a;

    /* renamed from: v, reason: collision with root package name */
    public long f2006v = 0;

    public l1() {
        long j10 = 0;
        this.f2004t = (j10 & 4294967295L) | (j10 << 32);
    }

    public Object M() {
        return null;
    }

    public abstract int f0(a aVar);

    public int g0() {
        return (int) (this.f2004t & 4294967295L);
    }

    public int j0() {
        return (int) (this.f2004t >> 32);
    }

    public final void m0() {
        this.f2002r = aa1.b.v((int) (this.f2004t >> 32), s3.a.k(this.f2005u), s3.a.i(this.f2005u));
        this.f2003s = aa1.b.v((int) (this.f2004t & 4294967295L), s3.a.j(this.f2005u), s3.a.h(this.f2005u));
        int i = this.f2002r;
        long j10 = this.f2004t;
        this.f2006v = (((i - ((int) (j10 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j10 & 4294967295L))) / 2));
    }

    public void n0(long j10, float f6, g2.b bVar) {
        p0(j10, f6, null);
    }

    public abstract void p0(long j10, float f6, j71.c cVar);

    public final void q0(long j10) {
        if (s3.l.a(this.f2004t, j10)) {
            return;
        }
        this.f2004t = j10;
        m0();
    }

    public final void s0(long j10) {
        if (s3.a.c(this.f2005u, j10)) {
            return;
        }
        this.f2005u = j10;
        m0();
    }
}
