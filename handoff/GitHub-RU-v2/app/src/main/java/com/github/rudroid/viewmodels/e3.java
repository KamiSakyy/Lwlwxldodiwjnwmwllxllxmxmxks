package com.github.rudroid.viewmodels;

import com.github.rudroid.common.e;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiRequestStatus;
import java.util.Objects;

@c71.e(c = "com.github.rudroid.viewmodels.LoginViewModel$fetchAccessToken$1", f = "LoginViewModel.kt", l = {124, 150, 151, 152, 183}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class e3 extends c71.j implements j71.e {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ u2 C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public xz0.c v;
    public v71.f0 w;
    public v71.e0 x;
    public xz0.c y;
    public xz0.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(u2 u2Var, String str, String str2, String str3, String str4, a71.c cVar) {
        super(2, cVar);
        this.C = u2Var;
        this.D = str;
        this.E = str2;
        this.F = str3;
        this.G = str4;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        e3 e3Var = new e3(this.C, this.D, this.E, this.F, this.G, cVar);
        e3Var.B = obj;
        return e3Var;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x018f, code lost:
    
        if (com.github.rudroid.viewmodels.u2.Q(r0, r1, r22.G, r3, r4, r22) == r7) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
    
        if (r3 == r7) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008e, code lost:
    
        if (r3 == r7) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object s;
        xz0.c cVar;
        v71.e0 f;
        v71.e0 f2;
        Object s2;
        Object M;
        v71.e0 e0Var;
        xz0.c cVar2;
        xz0.c cVar3;
        Object M2;
        xz0.c cVar4;
        xz0.c cVar5;
        ApiRequestStatus apiRequestStatus;
        ApiRequestStatus apiRequestStatus2;
        Object obj2;
        u2 u2Var = this.C;
        y71.y1 y1Var = u2Var.F;
        qe.a aVar = u2Var.y;
        v71.z zVar = (v71.z) this.B;
        b71.a aVar2 = b71.a.r;
        int i = this.A;
        w61.a0 a0Var = w61.a0.a;
        if (i == 0) {
            sy.y.j(obj);
            z01.x xVar = u2Var.t;
            String str = u2Var.D;
            String str2 = u2Var.E;
            this.B = zVar;
            this.A = 1;
            xVar.getClass();
            s = i21.a.s(xVar.a, new x01.f(str, str2, this.D, this.E, this.F, this.G), this);
        } else if (i == 1) {
            sy.y.j(obj);
            s = obj;
        } else {
            if (i == 2) {
                f2 = this.x;
                v71.e0 e0Var2 = this.w;
                cVar = this.v;
                sy.y.j(obj);
                f = e0Var2;
                s2 = obj;
                xz0.c cVar6 = (xz0.c) s2;
                this.B = null;
                this.v = cVar;
                this.w = null;
                this.x = f2;
                this.y = cVar6;
                this.A = 3;
                M = f.M(this);
                if (M != aVar2) {
                    e0Var = f2;
                    cVar2 = cVar6;
                    cVar3 = cVar;
                    xz0.c cVar7 = (xz0.c) M;
                    this.B = null;
                    this.v = cVar3;
                    this.w = null;
                    this.x = null;
                    this.y = cVar2;
                    this.z = cVar7;
                    this.A = 4;
                    M2 = e0Var.M(this);
                    if (M2 != aVar2) {
                    }
                }
                return aVar2;
            }
            if (i == 3) {
                cVar2 = this.y;
                e0Var = this.x;
                xz0.c cVar8 = this.v;
                sy.y.j(obj);
                M = obj;
                cVar3 = cVar8;
                xz0.c cVar72 = (xz0.c) M;
                this.B = null;
                this.v = cVar3;
                this.w = null;
                this.x = null;
                this.y = cVar2;
                this.z = cVar72;
                this.A = 4;
                M2 = e0Var.M(this);
                if (M2 != aVar2) {
                    cVar4 = cVar2;
                    cVar5 = cVar72;
                    e.a aVar3 = com.github.rudroid.common.e.Companion;
                    com.github.rudroid.common.l0 R = u2.R(u2Var, cVar4);
                    ApiFailure apiFailure = cVar4.c;
                    aVar3.getClass();
                    aVar.f(e.a.f(R));
                    com.github.rudroid.common.l0 R2 = u2.R(u2Var, cVar5);
                    ApiFailure apiFailure2 = cVar5.c;
                    aVar.f(e.a.h(R2));
                    aVar.f(e.a.d(u2.R(u2Var, (xz0.c) M2)));
                    apiRequestStatus = cVar4.a;
                    apiRequestStatus2 = ApiRequestStatus.FAILURE;
                    if (apiRequestStatus != apiRequestStatus2) {
                    }
                }
                return aVar2;
            }
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                com.github.rudroid.common.e.Companion.getClass();
                aVar.f(e.a.w);
                return a0Var;
            }
            cVar5 = this.z;
            xz0.c cVar9 = this.y;
            cVar3 = this.v;
            sy.y.j(obj);
            cVar4 = cVar9;
            M2 = obj;
            e.a aVar32 = com.github.rudroid.common.e.Companion;
            com.github.rudroid.common.l0 R3 = u2.R(u2Var, cVar4);
            ApiFailure apiFailure3 = cVar4.c;
            aVar32.getClass();
            aVar.f(e.a.f(R3));
            com.github.rudroid.common.l0 R22 = u2.R(u2Var, cVar5);
            ApiFailure apiFailure22 = cVar5.c;
            aVar.f(e.a.h(R22));
            aVar.f(e.a.d(u2.R(u2Var, (xz0.c) M2)));
            apiRequestStatus = cVar4.a;
            apiRequestStatus2 = ApiRequestStatus.FAILURE;
            if (apiRequestStatus != apiRequestStatus2) {
                Objects.toString(apiFailure3);
                aVar.f(e.a.A);
                com.github.rudroid.auth.p.a(y1Var, com.github.rudroid.auth.i.w, apiFailure3);
                return a0Var;
            }
            if (cVar5.a == apiRequestStatus2 || (obj2 = cVar5.b) == null) {
                Objects.toString(apiFailure22);
                aVar.f(e.a.B);
                com.github.rudroid.auth.p.a(y1Var, com.github.rudroid.auth.i.x, apiFailure22);
                return a0Var;
            }
            String str3 = (String) obj2;
            String str4 = (String) cVar4.b;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = str4;
            Object obj3 = cVar3.b;
            k71.k.d(obj3);
            String str6 = (String) obj3;
            this.B = null;
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.A = 5;
        }
        cVar = (xz0.c) s;
        Object obj4 = cVar.b;
        ApiFailure apiFailure4 = cVar.c;
        String str7 = (String) obj4;
        if (cVar.a == ApiRequestStatus.FAILURE || str7 == null || str7.length() == 0) {
            Objects.toString(apiFailure4);
            com.github.rudroid.common.e.Companion.getClass();
            aVar.f(e.a.x);
            com.github.rudroid.auth.p.a(y1Var, com.github.rudroid.auth.i.v, apiFailure4);
            return a0Var;
        }
        com.github.rudroid.common.e.Companion.getClass();
        aVar.f(e.a.y);
        String str8 = this.G;
        v71.f0 f3 = v71.b0.f(zVar, (w71.d) null, new c3(u2Var, str7, str8, null), 3);
        f = v71.b0.f(zVar, (w71.d) null, new d3(u2Var, str7, str8, null), 3);
        f2 = v71.b0.f(zVar, (w71.d) null, new b3(u2Var, str7, str8, null), 3);
        this.B = null;
        this.v = cVar;
        this.w = f;
        this.x = f2;
        this.A = 2;
        s2 = f3.s(this);
    }
}
