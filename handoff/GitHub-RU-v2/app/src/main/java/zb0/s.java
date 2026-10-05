package zb0;

import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s extends c71.j implements j71.c {
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, a71.c cVar, int i2) {
        super(i, cVar);
        this.v = i2;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        a71.c cVar = (a71.c) obj;
        switch (this.v) {
            case 0:
                s sVar = new s(1, cVar, 0);
                a0 a0Var = a0.a;
                sVar.v(a0Var);
                return a0Var;
            case 1:
                s sVar2 = new s(1, cVar, 1);
                a0 a0Var2 = a0.a;
                sVar2.v(a0Var2);
                return a0Var2;
            default:
                s sVar3 = new s(1, cVar, 2);
                a0 a0Var3 = a0.a;
                sVar3.v(a0Var3);
                return a0Var3;
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        int i = this.v;
        a0 a0Var = a0.a;
        switch (i) {
            case 0:
                b71.a aVar = b71.a.r;
                y.j(obj);
                break;
            case 1:
                b71.a aVar2 = b71.a.r;
                y.j(obj);
                break;
            default:
                b71.a aVar3 = b71.a.r;
                y.j(obj);
                break;
        }
        return a0Var;
    }
}
