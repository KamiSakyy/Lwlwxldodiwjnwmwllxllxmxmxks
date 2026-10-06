package zl;

import c71.c;
import com.github.domain.database.GitHubDatabase;
import fk.f;
import k71.k;
import oa.j;
import sy.y;
import xj.e;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public qj.a a;

    public b(qj.a aVar) {
        k.g(aVar, "database");
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, f fVar, c cVar) {
        a aVar;
        int i;
        e eVar;
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
                    xj.c z = ((GitHubDatabase) this.a.a(jVar)).z();
                    String key = fVar.getKey();
                    aVar.w = 1;
                    obj = m71.a.M(aVar, z.a, true, false, new tj.b(key, 14));
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                eVar = (e) obj;
                if (eVar == null) {
                    return eVar.b;
                }
                return null;
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.u;
        b71.a aVar22 = b71.a.r;
        i = aVar.w;
        if (i != 0) {
        }
        eVar = (e) obj2;
        if (eVar == null) {
        }
    }

}
