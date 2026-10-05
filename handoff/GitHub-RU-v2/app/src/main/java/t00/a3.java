package t00;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a3 extends c71.j implements j71.f {
    public final /* synthetic */ r3 A;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ProjectsMetaInfo z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(a71.c cVar, ProjectsMetaInfo projectsMetaInfo, r3 r3Var, int i) {
        super(3, cVar);
        this.v = i;
        this.z = projectsMetaInfo;
        this.A = r3Var;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                a3 a3Var = new a3(cVar, this.z, this.A, 0);
                a3Var.x = jVar;
                a3Var.y = obj2;
                return a3Var.v(w61.a0.a);
            default:
                a3 a3Var2 = new a3(cVar, this.z, this.A, 1);
                a3Var2.x = jVar;
                a3Var2.y = obj2;
                return a3Var2.v(w61.a0.a);
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
                    List list = (List) this.y;
                    y71.i A = k21.f.A(this.z, this.A.s);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    y71.n1.s(jVar);
                    Object b = A.b(new rm0.f2(jVar, list, 7), this);
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
                    y71.i A2 = k21.f.A(this.z, this.A.s);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    y71.n1.s(jVar2);
                    Object b2 = A2.b(new rm0.f2(jVar2, list2, 9), this);
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
