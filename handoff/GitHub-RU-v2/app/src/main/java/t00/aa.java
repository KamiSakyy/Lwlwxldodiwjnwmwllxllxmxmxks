package t00;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class aaShadow extends c71.j implements j71.f {
    public final /* synthetic */ ma A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ProjectsMetaInfo z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aa(a71.c cVar, ProjectsMetaInfo projectsMetaInfo, ma maVar, String str, int i) {
        super(3, cVar);
        this.v = i;
        this.z = projectsMetaInfo;
        this.A = maVar;
        this.B = str;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                aaShadow aaVar = new aaShadow(cVar, this.z, this.A, this.B, 0);
                aaVar.x = jVar;
                aaVar.y = obj2;
                return aaVar.v(w61.a0.a);
            default:
                aaShadow aaVar2 = new aaShadow(cVar, this.z, this.A, this.B, 1);
                aaVar2.x = jVar;
                aaVar2.y = obj2;
                return aaVar2.v(w61.a0.a);
        }
    }

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
                    y71.i faVar = projectsMetaInfo != null ? new fa(z01.p0.j(this.A.u, projectsMetaInfo, this.B, list), w7Var, 0) : new f8(21, w7Var);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1Shadow.q(jVar, faVar, this) == aVar) {
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
                    y71.i kaVar = projectsMetaInfo2 != null ? new ka(z01.p0.j(this.A.u, projectsMetaInfo2, this.B, list2), y7Var, 0) : new f8(21, y7Var);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1Shadow.q(jVar2, kaVar, this) == aVar2) {
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
