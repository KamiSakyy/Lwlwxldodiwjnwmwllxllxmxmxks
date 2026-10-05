package dn;

import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.domain.twofactor.RegisterAuthCertGeneralException;
import com.github.domain.twofactor.RegisterAuthCertServiceException;
import com.github.rudroid.common.e;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.shortcuts.ShortcutType;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 extends c71.j implements j71.f {
    public final /* synthetic */ int v = 1;
    public /* synthetic */ Object w;
    public /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ShortcutType shortcutType, com.github.service.models.response.shortcuts.a aVar, a71.c cVar) {
        super(3, cVar);
        this.y = shortcutType;
        this.z = aVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.v) {
            case 0:
                c0 c0Var = new c0((en.b) this.x, (oa.j) this.y, (e0) this.z, (a71.c) obj3);
                c0Var.w = (Throwable) obj2;
                w61.a0 a0Var = w61.a0.a;
                c0Var.v(a0Var);
                return a0Var;
            default:
                c0 c0Var2 = new c0((ShortcutType) this.y, (com.github.service.models.response.shortcuts.a) this.z, (a71.c) obj3);
                c0Var2.w = (List) obj;
                c0Var2.x = (List) obj2;
                return c0Var2.v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        int i = this.v;
        Throwable th2 = null;
        Object obj2 = this.z;
        Object obj3 = this.y;
        switch (i) {
            case 0:
                ApiFailure apiFailure = (Throwable) this.w;
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                Objects.toString(apiFailure);
                ((en.b) this.x).c();
                ((oa.j) obj3).i(-1L);
                e0 e0Var = (e0) obj2;
                ApiFailure apiFailure2 = apiFailure instanceof ApiFailure ? apiFailure : null;
                ApiFailureType apiFailureType = apiFailure2 != null ? apiFailure2.r : null;
                switch (apiFailureType == null ? -1 : a0.a[apiFailureType.ordinal()]) {
                    case -1:
                        String concat = "adding auth public key failed with ".concat(apiFailure.getClass().getName());
                        k71.k.g(concat, "message");
                        th2 = new RegisterAuthCertGeneralException(concat);
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        String str = "adding auth public key failed with " + apiFailureType;
                        k71.k.g(str, "message");
                        th2 = new RegisterAuthCertServiceException(str);
                        break;
                }
                if (th2 != null) {
                    qe.a aVar2 = e0Var.d;
                    e.a aVar3 = com.github.rudroid.common.e.Companion;
                    aVar2.b("RegisterAuthCertificateUseCase", th2, true);
                }
                return w61.a0.a;
            default:
                List list = (List) this.w;
                List list2 = (List) this.x;
                b71.a aVar4 = b71.a.r;
                sy.y.j(obj);
                ShortcutType shortcutType = (ShortcutType) obj3;
                com.github.service.models.response.shortcuts.a aVar5 = (com.github.service.models.response.shortcuts.a) obj2;
                for (Object obj4 : list) {
                    StoredShortcutModel storedShortcutModel = (StoredShortcutModel) obj4;
                    if (shortcutType == storedShortcutModel.y && aVar5.equals(storedShortcutModel.x) && com.google.common.util.concurrent.a.p(storedShortcutModel.u, list2)) {
                        return obj4;
                    }
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(en.b bVar, oa.j jVar, e0 e0Var, a71.c cVar) {
        super(3, cVar);
        this.x = bVar;
        this.y = jVar;
        this.z = e0Var;
    }
}
