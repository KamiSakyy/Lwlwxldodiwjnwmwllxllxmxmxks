package gl;

import com.google.android.gms.internal.measurement.d5;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import k71.k;
import oa.j;
import oa.m;
import sy.y;
import v71.b0;
import v71.v;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public m a;
    public h b;
    public v c;

    public d(m mVar, h hVar, v vVar) {
        k.g(mVar, "userManager");
        k.g(hVar, "fetchLocalPushNotificationSettingsUseCase");
        k.g(vVar, "ioDispatcher");
        this.a = mVar;
        this.b = hVar;
        this.c = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Enum a(d dVar, j jVar, c71.c cVar) {
        a aVar;
        int i;
        dVar.getClass();
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i2 = aVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.w = i2 - Integer.MIN_VALUE;
                Object obj = aVar.u;
                b71.a aVar2 = b71.a.r;
                i = aVar.w;
                if (i != 0) {
                    y.j(obj);
                    h hVar = dVar.b;
                    aVar.w = 1;
                    obj = hVar.a(jVar, aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                ArrayList v = d5.v((Map) obj);
                return v != null ? i.r : !v.isEmpty() ? i.s : i.t;
            }
        }
        aVar = new a(dVar, cVar);
        Object obj2 = aVar.u;
        b71.a aVar22 = b71.a.r;
        i = aVar.w;
        if (i != 0) {
        }
        ArrayList v2 = d5.v((Map) obj2);
        if (v2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(c71.c cVar) {
        b bVar;
        int i;
        Set set;
        i iVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i2 = bVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.w = i2 - Integer.MIN_VALUE;
                Object obj = bVar.u;
                b71.a aVar = b71.a.r;
                i = bVar.w;
                if (i != 0) {
                    y.j(obj);
                    c cVar2 = new c(this, null);
                    bVar.w = 1;
                    obj = b0.L(this.c, cVar2, bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                set = (Set) obj;
                iVar = i.s;
                if (!set.contains(iVar)) {
                    return iVar;
                }
                i iVar2 = i.r;
                return set.contains(iVar2) ? iVar2 : i.t;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.u;
        b71.a aVar2 = b71.a.r;
        i = bVar.w;
        if (i != 0) {
        }
        set = (Set) obj2;
        iVar = i.s;
        if (!set.contains(iVar)) {
        }
    }


}
