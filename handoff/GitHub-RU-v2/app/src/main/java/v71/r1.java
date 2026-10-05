package v71;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class r1 extends a81.q {
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(a71.h hVar, a71.c cVar, int i) {
        super(cVar, hVar);
        this.v = i;
    }

    @Override // v71.j1
    public final boolean B(Throwable th) {
        switch (this.v) {
            case 0:
                return false;
            default:
                if (th instanceof ChildCancelledException) {
                    return true;
                }
                return u(th);
        }
    }
}
