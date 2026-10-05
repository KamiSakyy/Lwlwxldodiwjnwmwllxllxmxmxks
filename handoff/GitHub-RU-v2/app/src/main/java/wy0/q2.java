package wy0;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q2 extends c71.j implements j71.f {
    public final /* synthetic */ rm0.c4 A;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ProjectsMetaInfo z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(a71.c cVar, ProjectsMetaInfo projectsMetaInfo, rm0.c4 c4Var, int i) {
        super(3, cVar);
        this.v = i;
        this.z = projectsMetaInfo;
        this.A = c4Var;
    }

    @Override // j71.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                q2 q2Var = new q2(cVar, this.z, this.A, 0);
                q2Var.x = jVar;
                q2Var.y = obj2;
                return q2Var.v(w61.a0.a);
            default:
                q2 q2Var2 = new q2(cVar, this.z, this.A, 1);
                q2Var2.x = jVar;
                q2Var2.y = obj2;
                return q2Var2.v(w61.a0.a);
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
                    List list = (List) this.y;
                    y71.i R = m71.a.R(this.z, this.A.t);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    y71.n1.s(jVar);
                    Object b = R.b(new rm0.f2(jVar, list, 17), this);
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
            default:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                w61.a0 a0Var2 = w61.a0.a;
                if (i2 == 0) {
                    sy.y.j(obj);
                    y71.j jVar2 = this.x;
                    List list2 = (List) this.y;
                    y71.i R2 = m71.a.R(this.z, this.A.t);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    y71.n1.s(jVar2);
                    Object b2 = R2.b(new rm0.f2(jVar2, list2, 19), this);
                    if (b2 != aVar2) {
                        b2 = a0Var2;
                    }
                    if (b2 != aVar2) {
                        b2 = a0Var2;
                    }
                    if (b2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0Var2;
        }
    }
}
