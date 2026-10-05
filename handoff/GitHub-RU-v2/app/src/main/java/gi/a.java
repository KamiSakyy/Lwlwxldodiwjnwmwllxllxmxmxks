package gi;

import a61.l0;
import c71.j;
import sy.y;
import v71.z;
import w61.a0;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ c x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, a71.c cVar2, int i) {
        super(2, cVar2);
        this.v = i;
        this.x = cVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new a(this.x, cVar, 0);
            default:
                return new a(this.x, cVar, 1);
        }
    }

    public final Object s(Object obj, Object obj2) {
        z zVar = (z) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return r(cVar, zVar).v(a0.a);
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    y.j(obj);
                    l0 l0Var = this.x.b;
                    this.w = 1;
                    obj = n1.v(l0Var, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                e eVar = (e) obj;
                return new Integer(eVar != null ? eVar.b : 0);
            default:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    y.j(obj);
                    l0 l0Var2 = this.x.b;
                    this.w = 1;
                    obj = n1.v(l0Var2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                e eVar2 = (e) obj;
                return eVar2 != null ? eVar2.c : "permission_dialog_never_shown";
        }
    }
}
