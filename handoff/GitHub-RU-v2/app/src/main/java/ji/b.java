package ji;

import c71.j;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public class b extends j implements j71.f {
    public final /* synthetic */ int v;
    public final /* synthetic */ oa.j w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(oa.j jVar, a71.c cVar, int i) {
        super(3, cVar);
        this.v = i;
        this.w = jVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                b bVar = new b(this.w, cVar, 0);
                a0 a0Var = a0.a;
                bVar.v(a0Var);
                return a0Var;
            default:
                b bVar2 = new b(this.w, cVar, 1);
                a0 a0Var2 = a0.a;
                bVar2.v(a0Var2);
                return a0Var2;
        }
    }

    public final Object v(Object obj) {
        int i = this.v;
        a0 a0Var = a0.a;
        oa.j jVar = this.w;
        switch (i) {
            case 0:
                b71.a aVar = b71.a.r;
                y.j(obj);
                String str = jVar.c;
                break;
            default:
                b71.a aVar2 = b71.a.r;
                y.j(obj);
                String str2 = jVar.c;
                break;
        }
        return a0Var;
    }
}
