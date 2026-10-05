package v00;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import jo.bj0;
import t00.ua;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public static final f Companion = new f();
    public final q81.u a;
    public final com.github.service.wrapper.b b;
    public final oa.h c;
    public final oa.j d;
    public String e;
    public Object f;

    public i(q81.u uVar, com.github.service.wrapper.b bVar, oa.h hVar, oa.j jVar) {
        k71.k.g(uVar, "okHttpClient");
        k71.k.g(bVar, "cachedClient");
        k71.k.g(hVar, "tokenManager");
        this.a = uVar;
        this.b = bVar;
        this.c = hVar;
        this.d = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(g61.a aVar, Class cls, a71.c cVar) {
        g gVar;
        int i;
        String str;
        String str2;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i2 = gVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.y = i2 - Integer.MIN_VALUE;
                Object obj = gVar.w;
                b71.a aVar2 = b71.a.r;
                i = gVar.y;
                if (i != 0) {
                    sy.y.j(obj);
                    nm.g gVar2 = new nm.g(com.github.rudroid.common.flow.f.b(com.github.service.wrapper.a.o(this.b, new bj0(), ga.h.r, false, (LinkedHashSet) null, (Set) null, 56), 3, new sw0.b(22), new ua(28), 4), 5);
                    gVar.u = aVar;
                    gVar.v = cls;
                    gVar.y = 1;
                    obj = n1.v(gVar2, gVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cls = gVar.v;
                    aVar = gVar.u;
                    sy.y.j(obj);
                }
                str = (String) obj;
                if (str != null) {
                    throw new ApiFailure(ApiFailureType.UNSUPPORTED, "Invalid Copilot URL", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 124);
                }
                if (this.f == null || (str2 = this.e) == null || t71.p.T(str2) || !k71.k.b(this.e, str)) {
                    this.e = str;
                    w51.r rVar = new w51.r(11);
                    rVar.l(xb.b.a(str));
                    rVar.e(aVar);
                    q81.t a = this.a.a();
                    a.c.add(new q10.d(2, this));
                    rVar.s = new q81.u(a);
                    this.f = rVar.m().l(cls);
                }
                Object obj2 = this.f;
                if (obj2 != null) {
                    return obj2;
                }
                throw new IllegalStateException("Invalid Copilot API");
            }
        }
        gVar = new g(this, cVar);
        Object obj3 = gVar.w;
        b71.a aVar22 = b71.a.r;
        i = gVar.y;
        if (i != 0) {
        }
        str = (String) obj3;
        if (str != null) {
        }
    }
}
