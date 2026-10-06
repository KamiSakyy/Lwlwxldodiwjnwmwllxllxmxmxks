package z01;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.ApiRequestStatus;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x {
    public final q81.u a;
    public final q10.f b;

    public x(q81.u uVar, q10.f fVar) {
        k71.k.g(uVar, "okHttpClient");
        k71.k.g(fVar, "okHttpFactory");
        this.a = uVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, c71.c cVar) {
        w wVar;
        int i;
        xz0.c cVar2;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i2 = wVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wVar.w = i2 - Integer.MIN_VALUE;
                Object obj = wVar.u;
                b71.a aVar = b71.a.r;
                i = wVar.w;
                if (i != 0) {
                    sy.y.j(obj);
                    if (str2 == null || xb.c.a(str2)) {
                        xz0.c.Companion.getClass();
                        return xz0.b.b("");
                    }
                    q81.t a = this.a.a();
                    a.c.add(new q10.d(5, str));
                    q81.u uVar = new q81.u(a);
                    x01.d dVar = new x01.d(str2);
                    wVar.w = 1;
                    obj = i21.a.s(uVar, dVar, wVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                cVar2 = (xz0.c) obj;
                String str3 = (String) cVar2.b;
                if (cVar2.a != ApiRequestStatus.FAILURE) {
                    xz0.b bVar = xz0.c.Companion;
                    ApiFailure apiFailure = cVar2.c;
                    k71.k.d(apiFailure);
                    bVar.getClass();
                    return xz0.b.a(apiFailure, null);
                }
                if (k41.b.i(str3).w()) {
                    xz0.c.Companion.getClass();
                    return xz0.b.b(str3);
                }
                xz0.b bVar2 = xz0.c.Companion;
                ApiFailure apiFailure2 = new ApiFailure(ApiFailureType.SERVER_VERSION, null, null, null, null, x61.x.t(new w61.k("failure_data_key_server_version", str3 != null ? str3 : "")), null, 28);
                bVar2.getClass();
                return xz0.b.a(apiFailure2, str3);
            }
        }
        wVar = new w(this, cVar);
        Object obj2 = wVar.u;
        b71.a aVar2 = b71.a.r;
        i = wVar.w;
        if (i != 0) {
        }
        cVar2 = (xz0.c) obj2;
        String str32 = (String) cVar2.b;
        if (cVar2.a != ApiRequestStatus.FAILURE) {
        }
    }
}
