package gk;

import android.util.Base64;
import com.github.domain.database.GitHubDatabase;
import java.security.MessageDigest;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public qj.a a;

    public d(qj.a aVar) {
        k71.k.g(aVar, "cachedForUserDatabase");
        this.a = aVar;
    }

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(t71.a.a);
            k71.k.f(bytes, "getBytes(...)");
            byte[] digest = messageDigest.digest(bytes);
            k71.k.f(digest, "digest(...)");
            String encodeToString = Base64.encodeToString(digest, 2);
            k71.k.f(encodeToString, "encodeToString(...)");
            return encodeToString;
        } catch (Exception unused) {
            return String.valueOf(str.hashCode());
        }
    }

    public static String c(String str, String str2) {
        return a(str + "/" + str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(oa.j jVar, String str, String str2, c71.c cVar) {
        b bVar;
        b71.a aVar;
        int i;
        String str3;
        vj.c cVar2;
        int i2;
        Object M;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i3 = bVar.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.A = i3 - Integer.MIN_VALUE;
                Object obj = bVar.y;
                aVar = b71.a.r;
                i = bVar.A;
                a0 a0Var = a0.a;
                if (i != 0) {
                    y.j(obj);
                    vj.c x = ((GitHubDatabase) this.a.a(jVar)).x();
                    vj.d dVar = new vj.d(a(str));
                    bVar.u = str;
                    bVar.v = str2;
                    bVar.w = x;
                    bVar.x = 0;
                    bVar.A = 1;
                    Object M2 = m71.a.M(bVar, x.a, false, true, new vj.a(x, dVar, 0));
                    if (M2 != aVar) {
                        M2 = a0Var;
                    }
                    if (M2 != aVar) {
                        str3 = str;
                        cVar2 = x;
                        i2 = 0;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        y.j(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = bVar.x;
                cVar2 = bVar.w;
                str2 = bVar.v;
                str3 = bVar.u;
                y.j(obj);
                vj.d dVar2 = new vj.d(c(str3, str2));
                bVar.u = null;
                bVar.v = null;
                bVar.w = null;
                bVar.x = i2;
                bVar.A = 2;
                M = m71.a.M(bVar, cVar2.a, false, true, new vj.a(cVar2, dVar2, 0));
                if (M != aVar) {
                    M = a0Var;
                }
                return M != aVar ? aVar : a0Var;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.y;
        aVar = b71.a.r;
        i = bVar.A;
        a0 a0Var2 = a0.a;
        if (i != 0) {
        }
        vj.d dVar22 = new vj.d(c(str3, str2));
        bVar.u = null;
        bVar.v = null;
        bVar.w = null;
        bVar.x = i2;
        bVar.A = 2;
        M = m71.a.M(bVar, cVar2.a, false, true, new vj.a(cVar2, dVar22, 0));
        if (M != aVar) {
        }
        if (M != aVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oa.j jVar, String str, String str2, c71.c cVar) {
        c cVar2;
        b71.a aVar;
        int i;
        String str3;
        vj.c cVar3;
        int i2;
        Object M;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i3 = cVar2.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar2.A = i3 - Integer.MIN_VALUE;
                Object obj = cVar2.y;
                aVar = b71.a.r;
                i = cVar2.A;
                a0 a0Var = a0.a;
                if (i != 0) {
                    y.j(obj);
                    vj.c x = ((GitHubDatabase) this.a.a(jVar)).x();
                    vj.d dVar = new vj.d(a(str));
                    cVar2.u = str;
                    cVar2.v = str2;
                    cVar2.w = x;
                    cVar2.x = 0;
                    cVar2.A = 1;
                    Object M2 = m71.a.M(cVar2, x.a, false, true, new vj.a(x, dVar, 1));
                    if (M2 != aVar) {
                        M2 = a0Var;
                    }
                    if (M2 != aVar) {
                        str3 = str;
                        cVar3 = x;
                        i2 = 0;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        y.j(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = cVar2.x;
                cVar3 = cVar2.w;
                str2 = cVar2.v;
                str3 = cVar2.u;
                y.j(obj);
                vj.d dVar2 = new vj.d(c(str3, str2));
                cVar2.u = null;
                cVar2.v = null;
                cVar2.w = null;
                cVar2.x = i2;
                cVar2.A = 2;
                M = m71.a.M(cVar2, cVar3.a, false, true, new vj.a(cVar3, dVar2, 1));
                if (M != aVar) {
                    M = a0Var;
                }
                return M != aVar ? aVar : a0Var;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.y;
        aVar = b71.a.r;
        i = cVar2.A;
        a0 a0Var2 = a0.a;
        if (i != 0) {
        }
        vj.d dVar22 = new vj.d(c(str3, str2));
        cVar2.u = null;
        cVar2.v = null;
        cVar2.w = null;
        cVar2.x = i2;
        cVar2.A = 2;
        M = m71.a.M(cVar2, cVar3.a, false, true, new vj.a(cVar3, dVar22, 1));
        if (M != aVar) {
        }
        if (M != aVar) {
        }
    }
}
