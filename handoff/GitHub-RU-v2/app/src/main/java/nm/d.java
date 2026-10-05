package nm;

import com.github.domain.database.GitHubDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m7.w;
import s0.z0;
import sy.y;
import w61.a0;
import x61.n;
import yz0.p3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ i y;
    public final /* synthetic */ oa.j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(i iVar, oa.j jVar, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.y = iVar;
        this.z = jVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                d dVar = new d(this.y, this.z, cVar, 0);
                dVar.x = obj;
                return dVar;
            default:
                d dVar2 = new d(this.y, this.z, cVar, 1);
                dVar2.x = obj;
                return dVar2;
        }
    }

    public final Object s(Object obj, Object obj2) {
        List list = (List) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return r(cVar, list).v(a0.a);
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                List<p3> list = (List) this.x;
                b71.a aVar = b71.a.r;
                int i = this.w;
                a0 a0Var = a0.a;
                if (i == 0) {
                    y.j(obj);
                    ArrayList arrayList = new ArrayList(n.F(list, 10));
                    for (p3 p3Var : list) {
                        arrayList.add(new zj.d(p3Var.a, p3Var.d, p3Var.b, p3Var.c));
                    }
                    k kVar = this.y.a;
                    this.x = null;
                    this.w = 1;
                    qj.a aVar2 = kVar.a;
                    oa.j jVar = this.z;
                    w wVar = (w) aVar2.a(jVar);
                    Object O = y9.a.O(wVar, new a10.b(wVar, new j(kVar, jVar, arrayList, null, 0), (a71.c) null), this);
                    if (O != b71.a.r) {
                        O = a0Var;
                    }
                    if (O == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var;
            default:
                List<p3> list2 = (List) this.x;
                b71.a aVar3 = b71.a.r;
                int i2 = this.w;
                a0 a0Var2 = a0.a;
                if (i2 == 0) {
                    y.j(obj);
                    ArrayList arrayList2 = new ArrayList(n.F(list2, 10));
                    for (p3 p3Var2 : list2) {
                        arrayList2.add(new zj.d(p3Var2.a, p3Var2.d, p3Var2.b, p3Var2.c));
                    }
                    k kVar2 = this.y.a;
                    this.x = null;
                    this.w = 1;
                    zj.b B = ((GitHubDatabase) kVar2.a.a(this.z)).B();
                    zj.d[] dVarArr = (zj.d[]) arrayList2.toArray(new zj.d[0]);
                    Object M = m71.a.M(this, B.a, false, true, new z0(17, B, (zj.d[]) Arrays.copyOf(dVarArr, dVarArr.length)));
                    b71.a aVar4 = b71.a.r;
                    if (M != aVar4) {
                        M = a0Var2;
                    }
                    if (M != aVar4) {
                        M = a0Var2;
                    }
                    if (M == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var2;
        }
    }
}
