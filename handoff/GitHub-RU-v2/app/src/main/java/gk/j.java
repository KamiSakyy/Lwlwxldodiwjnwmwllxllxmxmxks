package gk;

import com.github.domain.database.GitHubDatabase;
import sy.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public final d a;

    public j(d dVar) {
        k71.k.g(dVar, "store");
        this.a = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (r13 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r13 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, c71.c cVar) {
        i iVar;
        int i;
        String str3;
        oa.j jVar2;
        Long l;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i2 = iVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.z = i2 - Integer.MIN_VALUE;
                Object obj = iVar.x;
                b71.a aVar = b71.a.r;
                i = iVar.z;
                d dVar = this.a;
                if (i != 0) {
                    y.j(obj);
                    if (str2 != null) {
                        iVar.u = jVar;
                        iVar.v = str;
                        iVar.w = null;
                        iVar.z = 1;
                        obj = m71.a.M(iVar, ((GitHubDatabase) dVar.a.a(jVar)).x().a, true, false, new tj.b(d.c(str, str2), 6));
                    } else {
                        str3 = str;
                        jVar2 = jVar;
                        l = null;
                        iVar.u = null;
                        iVar.v = null;
                        iVar.w = l;
                        iVar.z = 2;
                        obj = m71.a.M(iVar, ((GitHubDatabase) dVar.a.a(jVar2)).x().a, true, false, new tj.b(d.a(str3), 6));
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        l = iVar.w;
                        y.j(obj);
                        Long l2 = (Long) obj;
                        if (l == null && l2 == null) {
                            return null;
                        }
                        return new k(l, l2);
                    }
                    str = iVar.v;
                    jVar = iVar.u;
                    y.j(obj);
                }
                str3 = str;
                jVar2 = jVar;
                l = (Long) obj;
                iVar.u = null;
                iVar.v = null;
                iVar.w = l;
                iVar.z = 2;
                obj = m71.a.M(iVar, ((GitHubDatabase) dVar.a.a(jVar2)).x().a, true, false, new tj.b(d.a(str3), 6));
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.x;
        b71.a aVar2 = b71.a.r;
        i = iVar.z;
        d dVar2 = this.a;
        if (i != 0) {
        }
        str3 = str;
        jVar2 = jVar;
        l = (Long) obj2;
        iVar.u = null;
        iVar.v = null;
        iVar.w = l;
        iVar.z = 2;
        obj2 = m71.a.M(iVar, ((GitHubDatabase) dVar2.a.a(jVar2)).x().a, true, false, new tj.b(d.a(str3), 6));
    }
}
