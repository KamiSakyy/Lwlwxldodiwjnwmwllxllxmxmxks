package c00;

import a61.l0;
import aa.m0;
import aa.n0;
import aa.r0;
import aa.s0;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.github.rudroid.common.e;
import com.github.service.models.ApiFailure;
import com.github.service.models.response.projects.ProjectsMetaInfo;
import in.b0;
import in.b1;
import in.d0;
import in.i0;
import in.z;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import jn0.e40;
import jo.e60;
import kotlin.NoWhenBranchMatchedException;
import l01.u0;
import l01.v;
import l01.v0;
import m7.x;
import rm0.b6;
import rm0.fa;
import rm0.j3;
import rm0.o5;
import rm0.u7;
import rm0.y8;
import sy.y;
import t00.c9;
import t00.f8;
import t00.h7;
import t00.u1;
import vb0.a4;
import vb0.e2;
import w61.a0;
import wy0.d6;
import y71.n1;
import z01.p0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m extends c71.j implements j71.f {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(a71.c cVar, ProjectsMetaInfo projectsMetaInfo, Object obj, int i) {
        super(3, cVar);
        this.v = i;
        this.A = projectsMetaInfo;
        this.z = obj;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        switch (this.v) {
            case 0:
                m mVar = new m((a71.c) obj3, (u) this.z, (ProjectsMetaInfo) this.A, 0);
                mVar.x = jVar;
                mVar.y = obj2;
                return mVar.v(a0.a);
            case 1:
                m mVar2 = new m((a71.c) obj3, (u) this.z, (String) this.A, 1);
                mVar2.x = jVar;
                mVar2.y = obj2;
                return mVar2.v(a0.a);
            case 2:
                m mVar3 = new m((a71.c) obj3, (com.github.service.wrapper.i) this.z, (n0) this.A, 2);
                mVar3.x = jVar;
                mVar3.y = obj2;
                return mVar3.v(a0.a);
            case 3:
                m mVar4 = new m((j71.e) this.y, (j71.c) this.z, (oa.j) this.A, (a71.c) obj3);
                mVar4.x = (Throwable) obj2;
                return mVar4.v(a0.a);
            case 4:
                m mVar5 = new m((a71.c) obj3, (u) this.z, (ProjectsMetaInfo) this.A, 4);
                mVar5.x = jVar;
                mVar5.y = obj2;
                return mVar5.v(a0.a);
            case 5:
                m mVar6 = new m((a71.c) obj3, (u) this.z, (String) this.A, 5);
                mVar6.x = jVar;
                mVar6.y = obj2;
                return mVar6.v(a0.a);
            case 6:
                m mVar7 = new m((a71.c) obj3, (il.m) this.z, (oa.j) this.A, 6);
                mVar7.x = jVar;
                mVar7.y = obj2;
                return mVar7.v(a0.a);
            case 7:
                m mVar8 = new m((in.n0) this.z, (in.t) this.A, (a71.c) obj3, 7);
                mVar8.x = jVar;
                mVar8.y = (Throwable) obj2;
                return mVar8.v(a0.a);
            case 8:
                m mVar9 = new m((s0) this.z, (e1.g) this.A, (a71.c) obj3, 8);
                mVar9.x = jVar;
                mVar9.y = (Throwable) obj2;
                return mVar9.v(a0.a);
            case 9:
                m mVar10 = new m((a71.c) obj3, (b6) this.z, (String) this.A, 9);
                mVar10.x = jVar;
                mVar10.y = obj2;
                return mVar10.v(a0.a);
            case 10:
                m mVar11 = new m((a71.c) obj3, (y8) this.z, (String) this.A, 10);
                mVar11.x = jVar;
                mVar11.y = obj2;
                return mVar11.v(a0.a);
            case 11:
                m mVar12 = new m((a71.c) obj3, (b6) this.z, (String) this.A, 11);
                mVar12.x = jVar;
                mVar12.y = obj2;
                return mVar12.v(a0.a);
            case 12:
                m mVar13 = new m((a71.c) obj3, (c9) this.z, (String) this.A, 12);
                mVar13.x = jVar;
                mVar13.y = obj2;
                return mVar13.v(a0.a);
            case 13:
                m mVar14 = new m((a71.c) obj3, (ProjectsMetaInfo) this.A, this.z, 13);
                mVar14.x = jVar;
                mVar14.y = obj2;
                return mVar14.v(a0.a);
            case 14:
                m mVar15 = new m((a71.c) obj3, (b6) this.z, (String) this.A, 14);
                mVar15.x = jVar;
                mVar15.y = obj2;
                return mVar15.v(a0.a);
            case 15:
                m mVar16 = new m((a71.c) obj3, (y8) this.z, (String) this.A, 15);
                mVar16.x = jVar;
                mVar16.y = obj2;
                return mVar16.v(a0.a);
            case 16:
                m mVar17 = new m((a71.c) obj3, (b6) this.z, (String) this.A, 16);
                mVar17.x = jVar;
                mVar17.y = obj2;
                return mVar17.v(a0.a);
            case 17:
                m mVar18 = new m((a71.c) obj3, (c9) this.z, (String) this.A, 17);
                mVar18.x = jVar;
                mVar18.y = obj2;
                return mVar18.v(a0.a);
            default:
                m mVar19 = new m((a71.c) obj3, (ProjectsMetaInfo) this.A, this.z, 18);
                mVar19.x = jVar;
                mVar19.y = obj2;
                return mVar19.v(a0.a);
        }
    }

    public final Object v(Object obj) {
        y71.i f8Var;
        Object obj2;
        y71.i f8Var2;
        Object obj3;
        y71.i f8Var3;
        Object obj4;
        y71.i f8Var4;
        Object obj5;
        y71.i f8Var5;
        int i = this.v;
        Object obj6 = this.A;
        Object obj7 = this.z;
        a0 a0Var = a0.a;
        switch (i) {
            case 0:
                b71.a aVar = b71.a.r;
                int i2 = this.w;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar = (y71.j) this.x;
                y71.i m = u.m((u) obj7, ((ProjectsMetaInfo) obj6).r, (List) this.y);
                this.x = null;
                this.y = null;
                this.w = 1;
                return n1.q(jVar, m, this) == aVar ? aVar : a0Var;
            case 1:
                b71.a aVar2 = b71.a.r;
                int i3 = this.w;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar2 = (y71.j) this.x;
                y71.i m2 = u.m((u) obj7, (String) obj6, (List) this.y);
                this.x = null;
                this.y = null;
                this.w = 1;
                return n1.q(jVar2, m2, this) == aVar2 ? aVar2 : a0Var;
            case 2:
                b71.a aVar3 = b71.a.r;
                int i4 = this.w;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar3 = (y71.j) this.x;
                y71.i k = ((com.github.service.wrapper.i) obj7).k((n0) obj6, (m0) this.y);
                this.x = null;
                this.y = null;
                this.w = 1;
                return n1.q(jVar3, k, this) == aVar3 ? aVar3 : a0Var;
            case 3:
                Throwable th2 = (Throwable) this.x;
                b71.a aVar4 = b71.a.r;
                int i5 = this.w;
                if (i5 == 0) {
                    y.j(obj);
                    c71.j jVar4 = (c71.j) this.y;
                    this.x = th2;
                    this.w = 1;
                    if (jVar4.s(th2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                j71.c cVar = (j71.c) obj7;
                ApiFailure apiFailure = th2 instanceof ApiFailure ? (ApiFailure) th2 : null;
                if (apiFailure == null) {
                    throw th2;
                }
                cVar.k(com.google.common.util.concurrent.a.e(apiFailure, (oa.j) obj6));
                return a0Var;
            case 4:
                b71.a aVar5 = b71.a.r;
                int i6 = this.w;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar5 = (y71.j) this.x;
                y71.i n = u.n((u) obj7, ((ProjectsMetaInfo) obj6).r, (List) this.y);
                this.x = null;
                this.y = null;
                this.w = 1;
                return n1.q(jVar5, n, this) == aVar5 ? aVar5 : a0Var;
            case 5:
                b71.a aVar6 = b71.a.r;
                int i7 = this.w;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar6 = (y71.j) this.x;
                y71.i n2 = u.n((u) obj7, (String) obj6, (List) this.y);
                this.x = null;
                this.y = null;
                this.w = 1;
                return n1.q(jVar6, n2, this) == aVar6 ? aVar6 : a0Var;
            case 6:
                oa.j jVar7 = (oa.j) obj6;
                il.m mVar = (il.m) obj7;
                b71.a aVar7 = b71.a.r;
                int i8 = this.w;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar8 = (y71.j) this.x;
                v vVar = (v) this.y;
                l01.r rVar = vVar.b;
                if (rVar instanceof l01.r) {
                    f8Var = ((p0) mVar.a.a(jVar7)).c(rVar.a);
                } else if (rVar instanceof u0) {
                    f8Var = ((p0) mVar.a.a(jVar7)).c(((u0) rVar).a);
                } else {
                    if (!(rVar instanceof l01.a) && !(rVar instanceof v0) && rVar != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f8Var = new f8(21, mVar.b);
                }
                y71.y yVar = new y71.y(new gi.b(vVar, (a71.c) null, 10), new l0(f8Var, vVar, 20));
                this.x = null;
                this.y = null;
                this.w = 1;
                return n1.q(jVar8, yVar, this) == aVar7 ? aVar7 : a0Var;
            case 7:
                in.t tVar = (in.t) obj6;
                String str = tVar.d;
                String str2 = tVar.b;
                qe.a aVar8 = ((in.n0) obj7).d;
                y71.j jVar9 = (y71.j) this.x;
                Throwable th3 = (Throwable) this.y;
                b71.a aVar9 = b71.a.r;
                int i9 = this.w;
                if (i9 != 0) {
                    if (i9 != 1 && i9 != 2 && i9 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                if (th3 instanceof b1) {
                    in.y yVar2 = ((b1) th3).r;
                    if (!(yVar2 instanceof in.u) && !(yVar2 instanceof in.v)) {
                        if (!(yVar2 instanceof z) && !(yVar2 instanceof b0) && !(yVar2 instanceof d0) && !(yVar2 instanceof i0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e.a aVar10 = com.github.rudroid.common.e.Companion;
                        aVar8.b("MediaFileUpload", th3, true);
                    }
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (jVar9.c(yVar2, this) != aVar9) {
                        return a0Var;
                    }
                } else if (th3 instanceof IOException) {
                    e.a aVar11 = com.github.rudroid.common.e.Companion;
                    aVar8.b("MediaFileUpload", th3, true);
                    b0 b0Var = new b0("failure : " + th3, str2, str);
                    this.x = null;
                    this.y = null;
                    this.w = 2;
                    if (jVar9.c(b0Var, this) != aVar9) {
                        return a0Var;
                    }
                } else {
                    e.a aVar12 = com.github.rudroid.common.e.Companion;
                    aVar8.b("MediaFileUpload", th3, true);
                    i0 i0Var = new i0("failure : " + th3, str2, str);
                    this.x = null;
                    this.y = null;
                    this.w = 3;
                    if (jVar9.c(i0Var, this) != aVar9) {
                        return a0Var;
                    }
                }
                return aVar9;
            case 8:
                b71.a aVar13 = b71.a.r;
                int i11 = this.w;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar10 = (y71.j) this.x;
                ApolloException apolloException = (Throwable) this.y;
                s0 s0Var = (s0) obj7;
                UUID randomUUID = UUID.randomUUID();
                k71.k.f(randomUUID, "randomUUID(...)");
                k71.k.g(s0Var, "operation");
                aa.f fVar = new aa.f(randomUUID, s0Var, (r0) null, (List) null, apolloException instanceof ApolloException ? apolloException : new ApolloNetworkException(apolloException, "Error while reading response"), x61.s.r, aa.z.a, false);
                this.x = null;
                this.w = 1;
                return jVar10.c(fVar, this) == aVar13 ? aVar13 : a0Var;
            case 9:
                String str3 = (String) obj6;
                b6 b6Var = (b6) obj7;
                b71.a aVar14 = b71.a.r;
                int i12 = this.w;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar11 = (y71.j) this.x;
                Integer num = (Integer) this.y;
                if (num != null) {
                    obj2 = null;
                    f8Var2 = in.r.l(new y71.y(com.github.rudroid.common.flow.f.b(com.github.service.wrapper.a.o(b6Var.s, new dl0.i0(str3, num.intValue()), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 0, (j71.e) null, o5.r, 7), new x(b6Var, str3, num, (a71.c) null, 6), 6));
                } else {
                    obj2 = null;
                    f8Var2 = new f8(21, a0Var);
                }
                this.x = obj2;
                this.y = obj2;
                this.w = 1;
                return n1.q(jVar11, f8Var2, this) == aVar14 ? aVar14 : a0Var;
            case 10:
                b71.a aVar15 = b71.a.r;
                int i13 = this.w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar12 = (y71.j) this.x;
                nm0.a aVar16 = (nm0.a) this.y;
                f8 f8Var6 = aVar16 != null ? new f8(21, aVar16) : new j3(com.github.service.wrapper.a.o(((y8) obj7).t, new lm0.e((String) obj6), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 22);
                this.x = null;
                this.y = null;
                this.w = 1;
                return n1.q(jVar12, f8Var6, this) == aVar15 ? aVar15 : a0Var;
            case 11:
                String str4 = (String) obj6;
                b6 b6Var2 = (b6) obj7;
                b71.a aVar17 = b71.a.r;
                int i14 = this.w;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar13 = (y71.j) this.x;
                Integer num2 = (Integer) this.y;
                if (num2 != null) {
                    obj3 = null;
                    f8Var3 = in.r.l(new y71.y(com.github.rudroid.common.flow.f.b(com.github.service.wrapper.a.o(b6Var2.s, new zx.b1(str4, num2.intValue()), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 0, (j71.e) null, u1.D, 7), new x(b6Var2, str4, num2, (a71.c) null, 12), 6));
                } else {
                    obj3 = null;
                    f8Var3 = new f8(21, a0Var);
                }
                this.x = obj3;
                this.y = obj3;
                this.w = 1;
                return n1.q(jVar13, f8Var3, this) == aVar17 ? aVar17 : a0Var;
            case 12:
                b71.a aVar18 = b71.a.r;
                int i15 = this.w;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar14 = (y71.j) this.x;
                o00.b bVar = (o00.b) this.y;
                y71.i f8Var7 = bVar != null ? new f8(21, bVar) : new h7(com.github.service.wrapper.a.o(((c9) obj7).t, new m00.j((String) obj6), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 8);
                this.x = null;
                this.y = null;
                this.w = 1;
                return n1.q(jVar14, f8Var7, this) == aVar18 ? aVar18 : a0Var;
            case 13:
                b71.a aVar19 = b71.a.r;
                int i16 = this.w;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar15 = (y71.j) this.x;
                e60 e60Var = (e60) this.y;
                y71.i A = k21.f.A((ProjectsMetaInfo) obj6, ((fa) obj7).t);
                this.x = null;
                this.y = null;
                this.w = 1;
                n1.s(jVar15);
                Object b = A.b(new u7(6, jVar15, e60Var), this);
                if (b != aVar19) {
                    b = a0Var;
                }
                if (b != aVar19) {
                    b = a0Var;
                }
                return b == aVar19 ? aVar19 : a0Var;
            case 14:
                String str5 = (String) obj6;
                b6 b6Var3 = (b6) obj7;
                b71.a aVar20 = b71.a.r;
                int i17 = this.w;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar16 = (y71.j) this.x;
                Integer num3 = (Integer) this.y;
                if (num3 != null) {
                    obj4 = null;
                    f8Var4 = in.r.l(new y71.y(com.github.rudroid.common.flow.f.b(com.github.service.wrapper.a.o(b6Var3.s, new na0.i0(str5, num3.intValue()), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 0, (j71.e) null, a4.r, 7), new x(b6Var3, str5, num3, (a71.c) null, 14), 6));
                } else {
                    obj4 = null;
                    f8Var4 = new f8(21, a0Var);
                }
                this.x = obj4;
                this.y = obj4;
                this.w = 1;
                return n1.q(jVar16, f8Var4, this) == aVar20 ? aVar20 : a0Var;
            case 15:
                b71.a aVar21 = b71.a.r;
                int i18 = this.w;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar17 = (y71.j) this.x;
                rb0.a aVar22 = (rb0.a) this.y;
                f8 f8Var8 = aVar22 != null ? new f8(21, aVar22) : new e2(com.github.service.wrapper.a.o(((y8) obj7).t, new pb0.e((String) obj6), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 17);
                this.x = null;
                this.y = null;
                this.w = 1;
                return n1.q(jVar17, f8Var8, this) == aVar21 ? aVar21 : a0Var;
            case 16:
                String str6 = (String) obj6;
                b6 b6Var4 = (b6) obj7;
                b71.a aVar23 = b71.a.r;
                int i19 = this.w;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar18 = (y71.j) this.x;
                Integer num4 = (Integer) this.y;
                if (num4 != null) {
                    obj5 = null;
                    f8Var5 = in.r.l(new y71.y(com.github.rudroid.common.flow.f.b(com.github.service.wrapper.a.o(b6Var4.s, new ow0.m0(str6, num4.intValue()), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 0, (j71.e) null, wy0.n1.D, 7), new x(b6Var4, str6, num4, (a71.c) null, 20), 6));
                } else {
                    obj5 = null;
                    f8Var5 = new f8(21, a0Var);
                }
                this.x = obj5;
                this.y = obj5;
                this.w = 1;
                return n1.q(jVar18, f8Var5, this) == aVar23 ? aVar23 : a0Var;
            case 17:
                b71.a aVar24 = b71.a.r;
                int i21 = this.w;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar19 = (y71.j) this.x;
                ry0.b bVar2 = (ry0.b) this.y;
                f8 f8Var9 = bVar2 != null ? new f8(21, bVar2) : new d6(com.github.service.wrapper.a.o(((c9) obj7).t, new py0.j((String) obj6), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 11);
                this.x = null;
                this.y = null;
                this.w = 1;
                return n1.q(jVar19, f8Var9, this) == aVar24 ? aVar24 : a0Var;
            default:
                b71.a aVar25 = b71.a.r;
                int i22 = this.w;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                y71.j jVar20 = (y71.j) this.x;
                e40 e40Var = (e40) this.y;
                y71.i R = m71.a.R((ProjectsMetaInfo) obj6, ((fa) obj7).t);
                this.x = null;
                this.y = null;
                this.w = 1;
                n1.s(jVar20);
                Object b2 = R.b(new u7(14, jVar20, e40Var), this);
                if (b2 != aVar25) {
                    b2 = a0Var;
                }
                if (b2 != aVar25) {
                    b2 = a0Var;
                }
                return b2 == aVar25 ? aVar25 : a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(a71.c cVar, Object obj, Object obj2, int i) {
        super(3, cVar);
        this.v = i;
        this.z = obj;
        this.A = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j71.e eVar, j71.c cVar, oa.j jVar, a71.c cVar2) {
        super(3, cVar2);
        this.v = 3;
        this.y = (c71.j) eVar;
        this.z = cVar;
        this.A = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, Object obj2, a71.c cVar, int i) {
        super(3, cVar);
        this.v = i;
        this.z = obj;
        this.A = obj2;
    }
}
