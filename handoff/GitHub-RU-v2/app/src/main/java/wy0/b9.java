package wy0;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.List;
import t00.fa;
import t00.ka;
import t00.ma;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b9 extends c71.j implements j71.f {
    public final /* synthetic */ ma A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ProjectsMetaInfo z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(a71.c cVar, ProjectsMetaInfo projectsMetaInfo, ma maVar, String str, int i) {
        super(3, cVar);
        this.v = i;
        this.z = projectsMetaInfo;
        this.A = maVar;
        this.B = str;
    }

    @Override // j71.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                b9 b9Var = new b9(cVar, this.z, this.A, this.B, 0);
                b9Var.x = jVar;
                b9Var.y = obj2;
                return b9Var.v(w61.a0.a);
            default:
                b9 b9Var2 = new b9(cVar, this.z, this.A, this.B, 1);
                b9Var2.x = jVar;
                b9Var2.y = obj2;
                return b9Var2.v(w61.a0.a);
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    sy.y.j(obj);
                    y71.j jVar = this.x;
                    w61.k kVar = (w61.k) this.y;
                    yz0.w7 w7Var = (yz0.w7) kVar.r;
                    List list = (List) kVar.s;
                    ProjectsMetaInfo projectsMetaInfo = this.z;
                    fa faVar = projectsMetaInfo != null ? new fa(z01.p0.j(this.A.u, projectsMetaInfo, this.B, list), w7Var, 1) : new t00.f8(21, w7Var);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1.q(jVar, faVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            default:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    sy.y.j(obj);
                    y71.j jVar2 = this.x;
                    w61.k kVar2 = (w61.k) this.y;
                    yz0.y7 y7Var = (yz0.y7) kVar2.r;
                    List list2 = (List) kVar2.s;
                    ProjectsMetaInfo projectsMetaInfo2 = this.z;
                    ka kaVar = projectsMetaInfo2 != null ? new ka(z01.p0.j(this.A.u, projectsMetaInfo2, this.B, list2), y7Var, 1) : new t00.f8(21, y7Var);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1.q(jVar2, kaVar, this) == aVar2) {
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
