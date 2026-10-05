package wy0;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.List;
import jn0.a40;
import t00.xa;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c extends c71.j implements j71.f {
    public final /* synthetic */ t00.k A;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ProjectsMetaInfo z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(a71.c cVar, ProjectsMetaInfo projectsMetaInfo, t00.k kVar, int i) {
        super(3, cVar);
        this.v = i;
        this.z = projectsMetaInfo;
        this.A = kVar;
    }

    @Override // j71.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                c cVar2 = new c(cVar, this.z, this.A, 0);
                cVar2.x = jVar;
                cVar2.y = obj2;
                return cVar2.v(w61.a0.a);
            default:
                c cVar3 = new c(cVar, this.z, this.A, 1);
                cVar3.x = jVar;
                cVar3.y = obj2;
                return cVar3.v(w61.a0.a);
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
                    a40 a40Var = (a40) this.y;
                    y71.i R = m71.a.R(this.z, this.A.s);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    y71.n1.s(jVar);
                    Object b = R.b(new rm0.u7(11, jVar, a40Var), this);
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
                if (i2 == 0) {
                    sy.y.j(obj);
                    y71.j jVar2 = this.x;
                    List list = (List) this.y;
                    ProjectsMetaInfo projectsMetaInfo = this.z;
                    xa k = projectsMetaInfo != null ? sy.a0.k(list, this.A.t, projectsMetaInfo.r, projectsMetaInfo.t) : new t00.f8(21, new w61.k(list, x61.r.r));
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1.q(jVar2, k, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }
}
