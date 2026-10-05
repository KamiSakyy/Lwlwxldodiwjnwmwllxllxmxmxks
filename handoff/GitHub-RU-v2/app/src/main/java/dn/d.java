package dn;

import android.os.Build;
import com.github.domain.twofactor.keystore.TwoFactorException;
import com.github.rudroid.common.e;
import com.github.service.models.ApiFailure;
import java.security.KeyStoreException;
import java.util.Map;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d extends c71.j implements j71.f {
    public final /* synthetic */ int v;
    public /* synthetic */ Throwable w;
    public final /* synthetic */ oa.j x;
    public final /* synthetic */ j71.c y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(j71.c cVar, oa.j jVar, Object obj, a71.c cVar2, int i) {
        super(3, cVar2);
        this.v = i;
        this.y = cVar;
        this.x = jVar;
        this.z = obj;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        Throwable th2 = (Throwable) obj2;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                d dVar = new d((com.github.rudroid.twofactor.i) this.y, this.x, (e) this.z, cVar, 0);
                dVar.w = th2;
                w61.a0 a0Var = w61.a0.a;
                dVar.v(a0Var);
                return a0Var;
            default:
                d dVar2 = new d((com.github.rudroid.twofactor.i) this.y, this.x, (g) this.z, cVar, 1);
                dVar2.w = th2;
                w61.a0 a0Var2 = w61.a0.a;
                dVar2.v(a0Var2);
                return a0Var2;
        }
    }

    public final Object v(Object obj) {
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        Object obj2 = this.z;
        oa.j jVar = this.x;
        com.github.rudroid.twofactor.i iVar = (com.github.rudroid.twofactor.i) this.y;
        switch (i) {
            case 0:
                ApiFailure apiFailure = this.w;
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                if (apiFailure instanceof ApiFailure) {
                    iVar.k(com.google.common.util.concurrent.a.e(apiFailure, jVar));
                } else {
                    boolean z = apiFailure instanceof TwoFactorException;
                    x61.s sVar = x61.s.r;
                    if (z) {
                        iVar.k(new fl.b(fl.c.G, (String) null, new Integer(0), (Map) sVar, this.x, (ApiFailure) null, 96));
                    } else {
                        if (!(apiFailure instanceof KeyStoreException)) {
                            if (Build.VERSION.SDK_INT < 33) {
                                throw apiFailure;
                            }
                            if (!d8.m.e(apiFailure)) {
                                throw apiFailure;
                            }
                        }
                        qe.a aVar2 = ((e) obj2).c;
                        e.a aVar3 = com.github.rudroid.common.e.Companion;
                        aVar2.b("ApproveTwoFactorRequestUseCase", apiFailure, true);
                        iVar.k(new fl.b(fl.c.G, (String) null, new Integer(0), (Map) sVar, this.x, (ApiFailure) null, 96));
                    }
                }
                return a0Var;
            default:
                ApiFailure apiFailure2 = this.w;
                b71.a aVar4 = b71.a.r;
                sy.y.j(obj);
                if (apiFailure2 instanceof ApiFailure) {
                    iVar.k(com.google.common.util.concurrent.a.e(apiFailure2, jVar));
                } else {
                    boolean z2 = apiFailure2 instanceof TwoFactorException;
                    x61.s sVar2 = x61.s.r;
                    if (z2) {
                        iVar.k(new fl.b(fl.c.G, (String) null, new Integer(0), (Map) sVar2, this.x, (ApiFailure) null, 96));
                    } else {
                        if (!(apiFailure2 instanceof KeyStoreException)) {
                            if (Build.VERSION.SDK_INT < 33) {
                                throw apiFailure2;
                            }
                            if (!d8.m.e(apiFailure2)) {
                                throw apiFailure2;
                            }
                        }
                        qe.a aVar5 = ((g) obj2).c;
                        e.a aVar6 = com.github.rudroid.common.e.Companion;
                        aVar5.b("ApproveTwoFactorRequestWithoutChallengeUseCase", apiFailure2, true);
                        iVar.k(new fl.b(fl.c.G, (String) null, new Integer(0), (Map) sVar2, this.x, (ApiFailure) null, 96));
                    }
                }
                return a0Var;
        }
    }
}
