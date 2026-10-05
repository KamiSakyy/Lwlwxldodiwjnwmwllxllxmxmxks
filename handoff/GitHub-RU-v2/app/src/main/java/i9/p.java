package i9;

/* loaded from: /home/user/work/p/classes.dex */
public final class p extends h91.q {

    /* renamed from: t, reason: collision with root package name */
    public static final h91.k f26118t;

    /* renamed from: s, reason: collision with root package name */
    public final h91.h f26119s;

    static {
        h91.k kVar = h91.k.u;
        f26118t = c30.d.a("0021F904");
    }

    public p(h91.j jVar) {
        super(jVar);
        this.f26119s = new h91.h();
    }

    public final long U(h91.h hVar, long j10) {
        long j11;
        long j12;
        f(j10);
        h91.h hVar2 = this.f26119s;
        long j13 = 0;
        if (hVar2.s == 0) {
            return j10 == 0 ? 0L : -1L;
        }
        long j14 = 0;
        while (true) {
            long j15 = -1;
            while (true) {
                h91.k kVar = f26118t;
                j15 = this.f26119s.K(kVar.r[0], j15 + 1, Long.MAX_VALUE);
                if (j15 == -1) {
                    j11 = j13;
                    break;
                }
                j11 = j13;
                if (f(kVar.r.length) && hVar2.A0(j15, kVar)) {
                    break;
                }
                j13 = j11;
            }
            if (j15 == -1) {
                break;
            }
            long U = hVar2.U(hVar, j15 + 4);
            if (U < j11) {
                U = j11;
            }
            j14 += U;
            if (f(5L) && hVar2.F(4L) == 0 && (((hVar2.F(2L) & 255) << 8) | (hVar2.F(1L) & 255)) < 2) {
                hVar.J0(hVar2.F(j11));
                hVar.J0(10);
                hVar.J0(0);
                hVar2.skip(3L);
            }
            j13 = 0;
        }
        if (j14 < j10) {
            long U2 = hVar2.U(hVar, j10 - j14);
            j12 = 0;
            if (U2 < 0) {
                U2 = 0;
            }
            j14 += U2;
        } else {
            j12 = 0;
        }
        if (j14 == j12) {
            return -1L;
        }
        return j14;
    }

    public final boolean f(long j10) {
        h91.h hVar = this.f26119s;
        long j11 = hVar.s;
        if (j11 >= j10) {
            return true;
        }
        long j12 = j10 - j11;
        return super.U(hVar, j12) == j12;
    }
}
