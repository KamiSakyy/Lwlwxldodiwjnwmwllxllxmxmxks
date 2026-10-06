package com.github.rudroid.viewmodels;

import android.app.Application;
import com.github.rudroid.common.e;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiRequestStatus;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u2 extends androidx.lifecycle.a {
    public static final a Companion = new a();
    public com.github.rudroid.auth.saml.usecases.a A;
    public com.github.rudroid.featureflags.f B;
    public v71.v C;
    public String D;
    public String E;
    public y71.y1 F;
    public z01.x t;
    public zk.u u;
    public kj.s v;
    public oa.m w;
    public dn.z x;
    public qe.a y;
    public oa.h z;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Application application, z01.x xVar, zk.u uVar, kj.s sVar, oa.m mVar, dn.z zVar, qe.a aVar, oa.h hVar, com.github.rudroid.auth.saml.usecases.a aVar2, com.github.rudroid.featureflags.f fVar, v71.v vVar) {
        super(application);
        k71.k.g(xVar, "oauthService");
        k71.k.g(uVar, "fetchCapabilitiesUseCase");
        k71.k.g(sVar, "fetchUserAccountInfoUseCase");
        k71.k.g(mVar, "userManager");
        k71.k.g(zVar, "prepareTwoFactorAuthHandler");
        k71.k.g(hVar, "tokenManager");
        k71.k.g(aVar2, "invalidateTokenUseCase");
        k71.k.g(fVar, "refreshEnabledFeatureFlagsUseCase");
        k71.k.g(vVar, "ioDispatcher");
        this.t = xVar;
        this.u = uVar;
        this.v = sVar;
        this.w = mVar;
        this.x = zVar;
        this.y = aVar;
        this.z = hVar;
        this.A = aVar2;
        this.B = fVar;
        this.C = vVar;
        String string = application.getResources().getString(2131952673);
        k71.k.f(string, "getString(...)");
        this.D = string;
        String string2 = application.getResources().getString(2131952674);
        k71.k.f(string2, "getString(...)");
        this.E = string2;
        this.F = y71.n1Shadow.c(com.github.rudroid.auth.g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(u2 u2Var, String str, String str2, String str3, String str4, c71.c cVar) {
        w2 w2Var;
        b71.a aVar;
        int i;
        oa.j jVar;
        oa.j jVar2;
        String str5;
        Object a2;
        y71.i iVar;
        String str6;
        oa.j jVar3;
        Object a3;
        u2Var.getClass();
        if (cVar instanceof w2) {
            w2Var = (w2) cVar;
            int i2 = w2Var.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w2Var.z = i2 - Integer.MIN_VALUE;
                Object obj = w2Var.x;
                aVar = b71.a.r;
                i = w2Var.z;
                w61.a0 a0Var = w61.a0.a;
                if (i != 0) {
                    sy.y.j(obj);
                    try {
                        jVar = u2Var.w.c(str, str2, str3, str4, new t2(u2Var, 0));
                    } catch (SecurityException e) {
                        r41.c.a().b(e);
                        jVar = null;
                    }
                    if (jVar == null) {
                        qe.a aVar2 = u2Var.y;
                        com.github.rudroid.common.e.Companion.getClass();
                        aVar2.f(e.a.v);
                        y71.y1 y1Var = u2Var.F;
                        com.github.rudroid.auth.i iVar2 = com.github.rudroid.auth.i.B;
                        k71.k.g(y1Var, "<this>");
                        y1Var.k((Object) null, new com.github.rudroid.auth.k(iVar2, (ApiFailure) null, (Throwable) null, 6));
                        return a0Var;
                    }
                    kj.s sVar = u2Var.v;
                    com.github.rudroid.repositories.repositoryownerrepositories.d dVar = new com.github.rudroid.repositories.repositoryownerrepositories.d(17, u2Var, jVar);
                    w2Var.u = str4;
                    w2Var.v = jVar;
                    w2Var.z = 1;
                    Object a4 = sVar.a(jVar, dVar, w2Var);
                    if (a4 == aVar) {
                        return aVar;
                    }
                    jVar2 = jVar;
                    obj = a4;
                    str5 = str4;
                    y71.i iVar3 = (y71.i) obj;
                    zk.u uVar = u2Var.u;
                    w2Var.u = str5;
                    w2Var.v = jVar2;
                    w2Var.w = iVar3;
                    w2Var.z = 2;
                    a2 = ((z01.e) uVar.a.a(jVar2)).a();
                    if (a2 != aVar) {
                    }
                } else if (i == 1) {
                    jVar2 = w2Var.v;
                    str5 = w2Var.u;
                    sy.y.j(obj);
                    y71.i iVar32 = (y71.i) obj;
                    zk.u uVar2 = u2Var.u;
                    w2Var.u = str5;
                    w2Var.v = jVar2;
                    w2Var.w = iVar32;
                    w2Var.z = 2;
                    a2 = ((z01.e) uVar2.a.a(jVar2)).a();
                    if (a2 != aVar) {
                        return aVar;
                    }
                    oa.j jVar4 = jVar2;
                    iVar = iVar32;
                    obj = a2;
                    str6 = str5;
                    jVar3 = jVar4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var;
                    }
                    iVar = w2Var.w;
                    jVar3 = w2Var.v;
                    str6 = w2Var.u;
                    sy.y.j(obj);
                }
                y71.i yVar = new y71.y((y71.i) obj, new a3(u2Var, jVar3, null));
                x2 x2Var = new x2(3, null);
                z2 z2Var = new z2(u2Var, jVar3, str6);
                w2Var.u = null;
                w2Var.v = null;
                w2Var.w = null;
                w2Var.z = 3;
                a3 = z71.b.a(w2Var, y71.e1.r, new y71.b1(x2Var, (a71.c) null), z2Var, new y71.i[]{iVar, yVar});
                if (a3 != b71.a.r) {
                    a3 = a0Var;
                }
                if (a3 == aVar) {
                    return aVar;
                }
                return a0Var;
            }
        }
        w2Var = new w2(u2Var, cVar);
        Object obj2 = w2Var.x;
        aVar = b71.a.r;
        i = w2Var.z;
        w61.a0 a0Var2 = w61.a0.a;
        if (i != 0) {
        }
        y71.i yVar2 = new y71.y((y71.i) obj2, new a3(u2Var, jVar3, null));
        x2 x2Var2 = new x2(3, null);
        z2 z2Var2 = new z2(u2Var, jVar3, str6);
        w2Var.u = null;
        w2Var.v = null;
        w2Var.w = null;
        w2Var.z = 3;
        a3 = z71.b.a(w2Var, y71.e1.r, new y71.b1(x2Var2, (a71.c) null), z2Var2, new y71.i[]{iVar, yVar2});
        if (a3 != b71.a.r) {
        }
        if (a3 == aVar) {
        }
        return a0Var2;
    }

    public static final com.github.rudroid.common.l0 R(u2 u2Var, xz0.c cVar) {
        ApiFailure apiFailure = cVar.c;
        if (cVar.a == ApiRequestStatus.SUCCESS) {
            return new com.github.rudroid.common.l0("request successful", "hardcoded string");
        }
        if (apiFailure == null) {
            return new com.github.rudroid.common.l0("request failed without known error", "hardcoded string");
        }
        return new com.github.rudroid.common.l0("request failed with " + apiFailure.r + ", code: " + apiFailure.u, "failureType is an enum, failure.code an int response code");
    }

    public final void S(String str, String str2, String str3, String str4) {
        k71.k.g(str2, "code");
        k71.k.g(str3, "state");
        y71.y1 y1Var = this.F;
        k71.k.g(y1Var, "<this>");
        y1Var.k((Object) null, com.github.rudroid.auth.h.a);
        v71.b0.z(androidx.lifecycle.d1.k(this), this.C, (v71.a0Shadow) null, new e3(this, str, str2, str3, str4, null), 2);
    }

    public final oa.j T() {
        Object obj;
        ArrayList e = this.w.e();
        int size = e.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = e.get(i);
            i++;
            String str = ((oa.j) obj).b;
            if (str == null || str.length() == 0) {
                break;
            }
        }
        return (oa.j) obj;
    }

    public final boolean U(String str) {
        if (str == null || !xb.c.a(str) || T() == null) {
            return false;
        }
        y71.y1 y1Var = this.F;
        k71.k.g(y1Var, "<this>");
        y1Var.k((Object) null, com.github.rudroid.auth.h.a);
        v71.b0.z(androidx.lifecycle.d1.k(this), this.C, (v71.a0Shadow) null, new v2(this, str, null), 2);
        return true;
    }
}
