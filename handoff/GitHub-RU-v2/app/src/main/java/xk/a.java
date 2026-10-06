package xk;

import java.util.List;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends c71.j implements j71.f {
    public final /* synthetic */ int v;
    public /* synthetic */ List w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, a71.c cVar, int i2) {
        super(i, cVar);
        this.v = i2;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                a aVar = new a(3, cVar, 0);
                aVar.w = list;
                return aVar.v(a0.a);
            default:
                a aVar2 = new a(3, cVar, 1);
                aVar2.w = list;
                return aVar2.v(a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                List list = this.w;
                b71.a aVar = b71.a.r;
                y.j(obj);
                return list;
            default:
                List list2 = this.w;
                b71.a aVar2 = b71.a.r;
                y.j(obj);
                return list2;
        }
    }
    public Object a(Object p1) { return null; }
}
