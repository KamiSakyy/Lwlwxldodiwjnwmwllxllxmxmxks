package v8;

import androidx.work.Worker;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class o0 implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f32830r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Worker f32831s;

    public /* synthetic */ o0(Worker worker, int i) {
        this.f32830r = i;
        this.f32831s = worker;
    }

    public final Object a() {
        switch (this.f32830r) {
            case k5.f.J /* 0 */:
                return this.f32831s.c();
            default:
                this.f32831s.getClass();
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
        }
    }
}
