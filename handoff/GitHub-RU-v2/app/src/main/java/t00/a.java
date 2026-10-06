package t00;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.List;
import jo.a60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends c71.j implements j71.f {
    public final /* synthetic */ k A;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ProjectsMetaInfo z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(a71.c cVar, ProjectsMetaInfo projectsMetaInfo, k kVar, int i) {
        super(3, cVar);
        this.v = i;
        this.z = projectsMetaInfo;
        this.A = kVar;
    }

    public static final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                a aVar = new a(cVar, this.z, this.A, 0);
                aVar.x = jVar;
                aVar.y = obj2;
                return aVar.v(w61.a0.a);
            case 1:
                a aVar2 = new a(cVar, this.z, this.A, 1);
                aVar2.x = jVar;
                aVar2.y = obj2;
                return aVar2.v(w61.a0.a);
            case 2:
                a aVar3 = new a(cVar, this.z, this.A, 2);
                aVar3.x = jVar;
                aVar3.y = obj2;
                return aVar3.v(w61.a0.a);
            default:
                a aVar4 = new a(cVar, this.z, this.A, 3);
                aVar4.x = jVar;
                aVar4.y = obj2;
                return aVar4.v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                w61.a0Shadow a0Var = w61.a0.a;
                if (i == 0) {
                    sy.y.j(obj);
                    y71.j jVar = this.x;
                    jo.d dVar = (jo.d) this.y;
                    y71.i A = k21.f.A(this.z, this.A.s);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    y71.n1Shadow.s(jVar);
                    Object b = A.b(new rm0.u7(2, jVar, dVar), this);
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
                    List list = (List) this.y;
                    ProjectsMetaInfo projectsMetaInfo = this.z;
                    y71.i f = projectsMetaInfo != null ? sy.oShadow.f(list, this.A.t, projectsMetaInfo.r, projectsMetaInfo.t) : new f8(21, new w61.k(list, x61.rShadow.r));
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1Shadow.q(jVar2, f, this) == aVar2) {
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
                w61.a0Shadow a0Var2 = w61.a0.a;
                if (i3 == 0) {
                    sy.y.j(obj);
                    y71.j jVar3 = this.x;
                    a60 a60Var = (a60) this.y;
                    y71.i A2 = k21.f.A(this.z, this.A.s);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    y71.n1Shadow.s(jVar3);
                    Object b2 = A2.b(new rm0.u7(3, jVar3, a60Var), this);
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
                    List list2 = (List) this.y;
                    ProjectsMetaInfo projectsMetaInfo2 = this.z;
                    y71.i f2 = projectsMetaInfo2 != null ? sy.oShadow.f(list2, this.A.t, projectsMetaInfo2.r, projectsMetaInfo2.t) : new f8(21, new w61.k(list2, x61.rShadow.r));
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1Shadow.q(jVar4, f2, this) == aVar4) {
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
    public Object a(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public static Object f0(Object p1) { return null; }
    public static Object h0(Object p1) { return null; }
    public int ordinal() { return null; }
    public static final Object r = null;
}
