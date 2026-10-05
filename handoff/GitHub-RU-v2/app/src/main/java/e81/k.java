package e81;

import a81.r;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: /home/user/work/p/classes5.dex */
public final class k extends r {
    public final /* synthetic */ AtomicReferenceArray v;

    public k(long j, k kVar, int i) {
        super(j, kVar, i);
        this.v = new AtomicReferenceArray(j.f);
    }

    @Override // a81.r
    public final int g() {
        return j.f;
    }

    @Override // a81.r
    public final void h(int i, a71.h hVar) {
        this.v.set(i, j.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.t + ", hashCode=" + hashCode() + ']';
    }
}
