package dn;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import l01.l0;
import l01.o0;
import l01.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 extends c71.j implements j71.f {
    public final /* synthetic */ int v;
    public /* synthetic */ Serializable w;
    public /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Object obj, a71.c cVar, int i) {
        super(3, cVar);
        this.v = i;
        this.y = obj;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.v) {
            case 0:
                g0 g0Var = new g0((en.b) this.x, (oa.j) this.y, (a71.c) obj3, 0);
                g0Var.w = (Throwable) obj2;
                w61.a0 a0Var = w61.a0.a;
                g0Var.v(a0Var);
                return a0Var;
            case 1:
                g0 g0Var2 = new g0((do0.d) this.y, (a71.c) obj3, 1);
                g0Var2.w = (String) obj;
                g0Var2.x = (File) obj2;
                return g0Var2.v(w61.a0.a);
            case 2:
                g0 g0Var3 = new g0((do0.d) this.y, (a71.c) obj3, 2);
                g0Var3.w = (String) obj;
                g0Var3.x = (File) obj2;
                return g0Var3.v(w61.a0.a);
            case 3:
                g0 g0Var4 = new g0((do0.d) this.y, (a71.c) obj3, 3);
                g0Var4.w = (String) obj;
                g0Var4.x = (File) obj2;
                return g0Var4.v(w61.a0.a);
            case 4:
                g0 g0Var5 = new g0((j71.c) this.x, (oa.j) this.y, (a71.c) obj3, 4);
                g0Var5.w = (Throwable) obj2;
                w61.a0 a0Var2 = w61.a0.a;
                g0Var5.v(a0Var2);
                return a0Var2;
            case 5:
                g0 g0Var6 = new g0((String) this.y, (a71.c) obj3, 5);
                g0Var6.w = (w61.k) obj;
                g0Var6.x = (o0) obj2;
                return g0Var6.v(w61.a0.a);
            default:
                g0 g0Var7 = new g0((do0.d) this.y, (a71.c) obj3, 6);
                g0Var7.w = (String) obj;
                g0Var7.x = (File) obj2;
                return g0Var7.v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        String p;
        String p2;
        String p3;
        String p4;
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        Object obj2 = this.y;
        switch (i) {
            case 0:
                Throwable th2 = (Throwable) this.w;
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                Objects.toString(th2);
                en.b bVar = (en.b) this.x;
                bVar.getClass();
                try {
                    en.b.b().deleteEntry(bVar.b);
                } catch (Exception unused) {
                }
                ((oa.j) obj2).h(-1L);
                return a0Var;
            case 1:
                String str = (String) this.w;
                File file = (File) this.x;
                b71.a aVar2 = b71.a.r;
                sy.y.j(obj);
                if (str == null || (p = i21.a.p(((do0.d) obj2).t, file, str)) == null) {
                    throw new ApiFailure(ApiFailureType.EXPIRED_CHECK_LOG_URL, (String) null, (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                }
                return p;
            case 2:
                String str2 = (String) this.w;
                File file2 = (File) this.x;
                b71.a aVar3 = b71.a.r;
                sy.y.j(obj);
                if (str2 == null || (p2 = i21.a.p(((do0.d) obj2).t, file2, str2)) == null) {
                    throw new ApiFailure(ApiFailureType.EXPIRED_CHECK_LOG_URL, (String) null, (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                }
                return p2;
            case 3:
                String str3 = (String) this.w;
                File file3 = (File) this.x;
                b71.a aVar4 = b71.a.r;
                sy.y.j(obj);
                if (str3 == null || (p3 = i21.a.p(((do0.d) obj2).t, file3, str3)) == null) {
                    throw new ApiFailure(ApiFailureType.UNKNOWN, "Could not download file", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                }
                return p3;
            case 4:
                ApiFailure apiFailure = (Throwable) this.w;
                b71.a aVar5 = b71.a.r;
                sy.y.j(obj);
                j71.c cVar = (j71.c) this.x;
                ApiFailure apiFailure2 = apiFailure instanceof ApiFailure ? apiFailure : null;
                if (apiFailure2 == null) {
                    throw apiFailure;
                }
                cVar.k(com.google.common.util.concurrent.a.e(apiFailure2, (oa.j) obj2));
                return a0Var;
            case 5:
                w61.k kVar = this.w;
                o0 o0Var = (o0) this.x;
                b71.a aVar6 = b71.a.r;
                sy.y.j(obj);
                s0 s0Var = (s0) kVar.r;
                return new jl.a(s0Var.b, (l0) kVar.s, o0Var.a, s0Var.c, (String) obj2, o0Var.b);
            default:
                String str4 = (String) this.w;
                File file4 = (File) this.x;
                b71.a aVar7 = b71.a.r;
                sy.y.j(obj);
                if (str4 == null || (p4 = i21.a.p(((do0.d) obj2).t, file4, str4)) == null) {
                    throw new ApiFailure(ApiFailureType.UNKNOWN, "Could not download file", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                }
                return p4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Object obj, oa.j jVar, a71.c cVar, int i) {
        super(3, cVar);
        this.v = i;
        this.x = obj;
        this.y = jVar;
    }
}
