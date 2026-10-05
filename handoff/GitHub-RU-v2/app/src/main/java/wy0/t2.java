package wy0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t2 extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ rm0.c4 y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2(rm0.c4 c4Var, String str, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.y = c4Var;
        this.z = str;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                t2 t2Var = new t2(this.y, this.z, cVar, 0);
                t2Var.x = obj;
                return t2Var;
            default:
                t2 t2Var2 = new t2(this.y, this.z, cVar, 1);
                t2Var2.x = obj;
                return t2Var2;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        List list = (List) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return ((t2) r(cVar, list)).v(w61.a0.a);
    }

    @Override // c71.a
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                List list = (List) this.x;
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    sy.y.j(obj);
                    int size = list.size();
                    this.x = list;
                    this.w = 1;
                    obj = rm0.c4.u(this.y, this.z, size, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return new rm0.g2((y71.i) obj, list, 12);
            default:
                List list2 = (List) this.x;
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    sy.y.j(obj);
                    int size2 = list2.size();
                    this.x = list2;
                    this.w = 1;
                    obj = rm0.c4.r(this.y, this.z, size2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return new rm0.g2((y71.i) obj, list2, 13);
        }
    }
}
