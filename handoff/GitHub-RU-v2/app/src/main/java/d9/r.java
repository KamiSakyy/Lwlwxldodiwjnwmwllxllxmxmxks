package d9;

import w61.a0;
import y41.t1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class r implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21745r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f21746s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f21747t;

    public /* synthetic */ r(int i, long j10, String str) {
        this.f21745r = i;
        this.f21746s = j10;
        this.f21747t = str;
    }

    public final Object k(Object obj) {
        v7.c F0;
        switch (this.f21745r) {
            case k5.f.J /* 0 */:
                long j10 = this.f21746s;
                String str = this.f21747t;
                v7.a aVar = (v7.a) obj;
                k71.k.g(aVar, "_connection");
                F0 = aVar.F0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    F0.c(1, j10);
                    F0.k0(str, 2);
                    F0.B0();
                    int D = t1.D(aVar);
                    F0.close();
                    return Integer.valueOf(D);
                } finally {
                }
            default:
                long j11 = this.f21746s;
                String str2 = this.f21747t;
                v7.a aVar2 = (v7.a) obj;
                k71.k.g(aVar2, "_connection");
                F0 = aVar2.F0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    F0.c(1, j11);
                    F0.k0(str2, 2);
                    F0.B0();
                    F0.close();
                    return a0.a;
                } finally {
                }
        }
    }
}
