package y71;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class o0 implements j {
    public final /* synthetic */ int r;
    public final /* synthetic */ k71.w s;

    public /* synthetic */ o0(k71.w wVar, int i) {
        this.r = i;
        this.s = wVar;
    }

    @Override // y71.j
    public final Object c(Object obj, a71.c cVar) {
        switch (this.r) {
            case 0:
                this.s.r = obj;
                throw new AbortFlowException(this);
            case 1:
                this.s.r = obj;
                throw new AbortFlowException(this);
            case 2:
                k71.w wVar = this.s;
                if (wVar.r != z71.b.b) {
                    throw new IllegalArgumentException("Flow has more than one element");
                }
                wVar.r = obj;
                return w61.a0.a;
            default:
                k71.w wVar2 = this.s;
                Object obj2 = wVar2.r;
                a81.t tVar = z71.b.b;
                if (obj2 == tVar) {
                    wVar2.r = obj;
                    return w61.a0.a;
                }
                wVar2.r = tVar;
                throw new AbortFlowException(this);
        }
    }
}
