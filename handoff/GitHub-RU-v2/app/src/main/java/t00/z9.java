package t00;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import jo.hd0;
import jo.ve0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z9 extends c71.j implements j71.f {
    public final /* synthetic */ ma A;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ProjectsMetaInfo z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9(a71.c cVar, ProjectsMetaInfo projectsMetaInfo, ma maVar, int i) {
        super(3, cVar);
        this.v = i;
        this.z = projectsMetaInfo;
        this.A = maVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                z9 z9Var = new z9(cVar, this.z, this.A, 0);
                z9Var.x = jVar;
                z9Var.y = obj2;
                return z9Var.v(w61.a0.a);
            case 1:
                z9 z9Var2 = new z9(cVar, this.z, this.A, 1);
                z9Var2.x = jVar;
                z9Var2.y = obj2;
                return z9Var2.v(w61.a0.a);
            case 2:
                z9 z9Var3 = new z9(cVar, this.z, this.A, 2);
                z9Var3.x = jVar;
                z9Var3.y = obj2;
                return z9Var3.v(w61.a0.a);
            default:
                z9 z9Var4 = new z9(cVar, this.z, this.A, 3);
                z9Var4.x = jVar;
                z9Var4.y = obj2;
                return z9Var4.v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                w61.a0 a0Var = w61.a0.a;
                if (i == 0) {
                    sy.y.j(obj);
                    y71.j jVar = this.x;
                    hd0 hd0Var = (hd0) this.y;
                    y71.i A = k21.f.A(this.z, this.A.t);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    y71.n1.s(jVar);
                    Object b = A.b(new rm0.u7(7, jVar, hd0Var), this);
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
                    y71.i f = projectsMetaInfo != null ? sy.o.f(w7Var, this.A.s, projectsMetaInfo.r, projectsMetaInfo.t) : new f8(21, new w61.k(w7Var, x61.r.r));
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1.q(jVar2, f, this) == aVar2) {
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
                    ve0 ve0Var = (ve0) this.y;
                    y71.i A2 = k21.f.A(this.z, this.A.t);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    y71.n1.s(jVar3);
                    Object b2 = A2.b(new rm0.u7(8, jVar3, ve0Var), this);
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
                    y71.i f2 = projectsMetaInfo2 != null ? sy.o.f(y7Var, this.A.s, projectsMetaInfo2.r, projectsMetaInfo2.t) : new f8(21, new w61.k(y7Var, x61.r.r));
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1.q(jVar4, f2, this) == aVar4) {
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
