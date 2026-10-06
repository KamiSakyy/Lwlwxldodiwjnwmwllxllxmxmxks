package wy0;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import jn0.hc0;
import jn0.ta0;
import t00.ma;
import t00.xa;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a9 extends c71.j implements j71.f {
    public final /* synthetic */ ma A;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ProjectsMetaInfo z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9(a71.c cVar, ProjectsMetaInfo projectsMetaInfo, ma maVar, int i) {
        super(3, cVar);
        this.v = i;
        this.z = projectsMetaInfo;
        this.A = maVar;
    }

    @Override // j71.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                a9 a9Var = new a9(cVar, this.z, this.A, 0);
                a9Var.x = jVar;
                a9Var.y = obj2;
                return a9Var.v(w61.a0.a);
            case 1:
                a9 a9Var2 = new a9(cVar, this.z, this.A, 1);
                a9Var2.x = jVar;
                a9Var2.y = obj2;
                return a9Var2.v(w61.a0.a);
            case 2:
                a9 a9Var3 = new a9(cVar, this.z, this.A, 2);
                a9Var3.x = jVar;
                a9Var3.y = obj2;
                return a9Var3.v(w61.a0.a);
            default:
                a9 a9Var4 = new a9(cVar, this.z, this.A, 3);
                a9Var4.x = jVar;
                a9Var4.y = obj2;
                return a9Var4.v(w61.a0.a);
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                w61.a0 a0Var = w61.a0.a;
                if (i == 0) {
                    sy.y.j(obj);
                    y71.j jVar = this.x;
                    ta0 ta0Var = (ta0) this.y;
                    y71.i R = m71.a.R(this.z, this.A.t);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    y71.n1Shadow.s(jVar);
                    Object b = R.b(new rm0.u7(15, jVar, ta0Var), this);
                    if (b != aVar) {
                        b = a0Var;
                    }
                    if (b != aVar) {
                        b = a0Var;
                    }
                    if (b == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0Var;
            case 1:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    sy.y.j(obj);
                    y71.j jVar2 = this.x;
                    yz0.w7 w7Var = (yz0.w7) this.y;
                    ProjectsMetaInfo projectsMetaInfo = this.z;
                    xa k = projectsMetaInfo != null ? sy.a0.k(w7Var, this.A.s, projectsMetaInfo.r, projectsMetaInfo.t) : new t00.f8(21, new w61.k(w7Var, x61.rShadow.r));
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1Shadow.q(jVar2, k, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 2:
                b71.a aVar3 = b71.a.r;
                int i3 = this.w;
                w61.a0 a0Var2 = w61.a0.a;
                if (i3 == 0) {
                    sy.y.j(obj);
                    y71.j jVar3 = this.x;
                    hc0 hc0Var = (hc0) this.y;
                    y71.i R2 = m71.a.R(this.z, this.A.t);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    y71.n1Shadow.s(jVar3);
                    Object b2 = R2.b(new rm0.u7(16, jVar3, hc0Var), this);
                    if (b2 != aVar3) {
                        b2 = a0Var2;
                    }
                    if (b2 != aVar3) {
                        b2 = a0Var2;
                    }
                    if (b2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0Var2;
            default:
                b71.a aVar4 = b71.a.r;
                int i4 = this.w;
                if (i4 == 0) {
                    sy.y.j(obj);
                    y71.j jVar4 = this.x;
                    yz0.y7 y7Var = (yz0.y7) this.y;
                    ProjectsMetaInfo projectsMetaInfo2 = this.z;
                    xa k2 = projectsMetaInfo2 != null ? sy.a0.k(y7Var, this.A.s, projectsMetaInfo2.r, projectsMetaInfo2.t) : new t00.f8(21, new w61.k(y7Var, x61.rShadow.r));
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1Shadow.q(jVar4, k2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }
}
