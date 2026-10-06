package w21;

import java.util.concurrent.CountDownLatch;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements e, d, b, c {
    public CountDownLatch r;

    public /* synthetic */ i(CountDownLatch countDownLatch) {
        this.r = countDownLatch;
    }

    @Override // w21.b
    public void a() {
        this.r.countDown();
    }

    @Override // w21.e
    public void e(Object obj) {
        this.r.countDown();
    }

    @Override // w21.d
    public void h(Exception exc) {
        this.r.countDown();
    }

    @Override // w21.c
    public void x(o oVar) {
        this.r.countDown();
    }
}
