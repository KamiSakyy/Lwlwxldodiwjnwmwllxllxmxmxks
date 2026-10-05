package bl;

import cn.s;
import com.github.service.models.response.TimelineItem;
import java.util.ArrayList;
import java.util.List;
import sy.d0;
import sy.y;
import w61.a0;
import y71.j;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements j {
    public final /* synthetic */ int r;
    public final /* synthetic */ j s;
    public final /* synthetic */ List t;
    public final /* synthetic */ oa.j u;
    public final /* synthetic */ String v;
    public final /* synthetic */ Object w;

    public /* synthetic */ b(j jVar, List list, Object obj, oa.j jVar2, String str, int i) {
        this.r = i;
        this.s = jVar;
        this.t = list;
        this.w = obj;
        this.u = jVar2;
        this.v = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        a aVar;
        int i;
        e eVar;
        int i2;
        switch (this.r) {
            case 0:
                oa.j jVar = this.u;
                String str = jVar.c;
                d dVar = (d) this.w;
                if (cVar instanceof a) {
                    aVar = (a) cVar;
                    int i3 = aVar.v;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        aVar.v = i3 - Integer.MIN_VALUE;
                        Object obj2 = aVar.u;
                        b71.a aVar2 = b71.a.r;
                        i = aVar.v;
                        a0 a0Var = a0.a;
                        if (i != 0) {
                            y.j(obj2);
                            List list = (List) obj;
                            List list2 = this.t;
                            ArrayList Q = b31.b.Q(list2, list);
                            ArrayList Q2 = b31.b.Q(list, list2);
                            y61.b i4 = d0.i();
                            w50.c cVar2 = dVar.c;
                            i4.addAll(w50.c.a(Q, TimelineItem.LinkedItemConnectorType.UNLINKED, str));
                            i4.addAll(w50.c.a(Q2, TimelineItem.LinkedItemConnectorType.LINKED, str));
                            ((s) dVar.b.a(jVar)).b(this.v, d0.h(i4));
                            aVar.v = 1;
                            if (this.s.c(a0Var, aVar) == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj2);
                        }
                        return a0Var;
                    }
                }
                aVar = new a(this, cVar);
                Object obj22 = aVar.u;
                b71.a aVar22 = b71.a.r;
                i = aVar.v;
                a0 a0Var2 = a0.a;
                if (i != 0) {
                }
                return a0Var2;
            default:
                oa.j jVar2 = this.u;
                String str2 = jVar2.c;
                f fVar = (f) this.w;
                if (cVar instanceof e) {
                    eVar = (e) cVar;
                    int i5 = eVar.v;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        eVar.v = i5 - Integer.MIN_VALUE;
                        Object obj3 = eVar.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = eVar.v;
                        a0 a0Var3 = a0.a;
                        if (i2 != 0) {
                            y.j(obj3);
                            List list3 = (List) obj;
                            List list4 = this.t;
                            ArrayList Q3 = b31.b.Q(list4, list3);
                            ArrayList Q4 = b31.b.Q(list3, list4);
                            y61.b i6 = d0.i();
                            w50.c cVar3 = fVar.c;
                            i6.addAll(w50.c.a(Q3, TimelineItem.LinkedItemConnectorType.UNLINKED, str2));
                            i6.addAll(w50.c.a(Q4, TimelineItem.LinkedItemConnectorType.LINKED, str2));
                            ((s) fVar.b.a(jVar2)).b(this.v, d0.h(i6));
                            eVar.v = 1;
                            if (this.s.c(a0Var3, eVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj3);
                        }
                        return a0Var3;
                    }
                }
                eVar = new e(this, cVar);
                Object obj32 = eVar.u;
                b71.a aVar32 = b71.a.r;
                i2 = eVar.v;
                a0 a0Var32 = a0.a;
                if (i2 != 0) {
                }
                return a0Var32;
        }
    }
}
