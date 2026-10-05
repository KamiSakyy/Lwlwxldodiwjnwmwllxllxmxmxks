package di;

import androidx.compose.foundation.lazy.layout.l1;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.w;
import c71.j;
import k.i;
import n4.g;
import sy.y;
import v71.z;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends j implements j71.e {
    public int v;
    public final /* synthetic */ i w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i, int i2, a71.c cVar, i iVar) {
        super(2, cVar);
        this.w = iVar;
        this.x = i;
        this.y = i2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new b(this.x, this.y, cVar, this.w);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            y.j(obj);
            i iVar = this.w;
            e0 e0Var = ((g) iVar).r;
            w wVar = w.u;
            l1 l1Var = new l1(this.x, this.y, (a71.c) null, iVar);
            this.v = 1;
            if (d1.m(e0Var, wVar, l1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.j(obj);
        }
        return a0.a;
    }

}
