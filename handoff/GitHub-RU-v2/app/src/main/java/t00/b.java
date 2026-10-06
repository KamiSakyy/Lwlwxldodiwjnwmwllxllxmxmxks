package t00;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends c71.j implements j71.f {
    public final /* synthetic */ k A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ProjectsMetaInfo z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(a71.c cVar, ProjectsMetaInfo projectsMetaInfo, k kVar, String str, int i) {
        super(3, cVar);
        this.v = i;
        this.z = projectsMetaInfo;
        this.A = kVar;
        this.B = str;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                b bVar = new b(cVar, this.z, this.A, this.B, 0);
                bVar.x = jVar;
                bVar.y = obj2;
                return bVar.v(w61.a0.a);
            default:
                b bVar2 = new b(cVar, this.z, this.A, this.B, 1);
                bVar2.x = jVar;
                bVar2.y = obj2;
                return bVar2.v(w61.a0.a);
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
                    List list = (List) kVar.r;
                    List list2 = (List) kVar.s;
                    ProjectsMetaInfo projectsMetaInfo = this.z;
                    rm0.g2 g2Var = projectsMetaInfo != null ? new rm0.g2(z01.p0.j(this.A.u, projectsMetaInfo, this.B, list2), list, 3) : new f8(21, list);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1.q(jVar, g2Var, this) == aVar) {
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
                    List list3 = (List) kVar2.r;
                    List list4 = (List) kVar2.s;
                    ProjectsMetaInfo projectsMetaInfo2 = this.z;
                    rm0.g2 g2Var2 = projectsMetaInfo2 != null ? new rm0.g2(z01.p0.j(this.A.u, projectsMetaInfo2, this.B, list4), list3, 4) : new f8(21, list3);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1.q(jVar2, g2Var2, this) == aVar2) {
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
    public static Object B(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; }
    public Object p(Object p1, Object p2) { return null; }
    public static final Object c = null;
    public static final Object d = null;
    public static final Object r = null;
    public Object ordinal() { return null; }
}
