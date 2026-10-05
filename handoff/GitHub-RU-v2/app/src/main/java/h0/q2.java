package h0;

/* loaded from: /home/user/work/p/classes.dex */
public final class q2 implements p2.a {

    /* renamed from: r, reason: collision with root package name */
    public final c3 f25160r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f25161s;

    public q2(c3 c3Var, boolean z10) {
        this.f25160r = c3Var;
        this.f25161s = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // p2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I(long j10, long j11, a71.c cVar) {
        p2 p2Var;
        int i;
        long j12;
        if (cVar instanceof p2) {
            p2Var = (p2) cVar;
            int i10 = p2Var.f25144x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                p2Var.f25144x = i10 - Integer.MIN_VALUE;
                Object obj = p2Var.f25142v;
                b71.a aVar = b71.a.r;
                i = p2Var.f25144x;
                if (i != 0) {
                    sy.y.j(obj);
                    j12 = 0;
                    if (this.f25161s) {
                        c3 c3Var = this.f25160r;
                        if (!c3Var.i) {
                            p2Var.f25141u = j11;
                            p2Var.f25144x = 1;
                            obj = c3Var.a(j11, p2Var);
                            if (obj == aVar) {
                                return aVar;
                            }
                        }
                        j12 = s3.q.d(j11, j12);
                    }
                    return new s3.q(j12);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = p2Var.f25141u;
                sy.y.j(obj);
                j12 = ((s3.q) obj).f31712a;
                j12 = s3.q.d(j11, j12);
                return new s3.q(j12);
            }
        }
        p2Var = new p2(this, (c71.c) cVar);
        Object obj2 = p2Var.f25142v;
        b71.a aVar2 = b71.a.r;
        i = p2Var.f25144x;
        if (i != 0) {
        }
        j12 = ((s3.q) obj2).f31712a;
        j12 = s3.q.d(j11, j12);
        return new s3.q(j12);
    }

    @Override // p2.a
    public final long g0(int i, long j10, long j11) {
        if (!this.f25161s) {
            return 0L;
        }
        c3 c3Var = this.f25160r;
        if (c3Var.f24934a.a()) {
            return 0L;
        }
        return c3Var.h(c3Var.d(c3Var.f24934a.e(c3Var.d(c3Var.g(j11)))));
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c3<T1,T2,T3,T4> {
        public c3() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class u<T1,T2,T3,T4> {
        public u() {
        }
    }
}
