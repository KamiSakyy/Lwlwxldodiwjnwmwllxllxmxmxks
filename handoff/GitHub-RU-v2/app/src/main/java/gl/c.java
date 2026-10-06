package gl;

import c71.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import sy.y;
import v71.z;
import w61.a0;
import x61.m;
import x61.n;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c extends j implements j71.e {
    public int A;
    public int B;
    public final /* synthetic */ d C;
    public d v;
    public Collection w;
    public Iterator x;
    public Collection y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, a71.c cVar) {
        super(2, cVar);
        this.C = dVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new c(this.C, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0099 -> B:5:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        d dVar;
        Collection arrayList;
        int i;
        Iterator it;
        int i2;
        b71.a aVar = b71.a.r;
        int i3 = this.B;
        if (i3 == 0) {
            y.j(obj);
            d dVar2 = this.C;
            ArrayList e = dVar2.a.e();
            ArrayList arrayList2 = new ArrayList();
            int size = e.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = e.get(i4);
                i4++;
                oa.j jVar = (oa.j) obj2;
                if (jVar.o && !jVar.f(com.github.rudroid.common.a.w) && jVar.c().w()) {
                    arrayList2.add(obj2);
                }
            }
            dVar = dVar2;
            arrayList = new ArrayList(n.F(arrayList2, 10));
            i = 0;
            it = arrayList2.iterator();
            i2 = 0;
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.A;
            i2 = this.z;
            arrayList = this.y;
            it = this.x;
            Collection collection = this.w;
            dVar = this.v;
            y.j(obj);
            arrayList.add((i) obj);
            arrayList = collection;
            if (it.hasNext()) {
                oa.j jVar2 = (oa.j) it.next();
                this.v = dVar;
                Collection collection2 = arrayList;
                this.w = collection2;
                this.x = it;
                this.y = collection2;
                this.z = i2;
                this.A = i;
                this.B = 1;
                obj = d.a(dVar, jVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
                collection = arrayList;
                arrayList.add((i) obj);
                arrayList = collection;
                if (it.hasNext()) {
                    return m.K0((List) arrayList);
                }
            }
        }
    }
    public Object v(Object) { return null; }
}
