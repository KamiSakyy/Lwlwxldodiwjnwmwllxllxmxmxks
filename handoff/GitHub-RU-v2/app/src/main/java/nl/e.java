package nl;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.List;
import l01.c0;
import l01.j0;
import l01.p0;
import sy.d0;
import sy.y;
import t00.h5;
import t00.u4;
import w61.a0;
import y71.n1;
import z01.c1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e extends c71.j implements j71.f {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(a71.c cVar, Object obj, String str, String str2, String str3, j0 j0Var, String str4, int i) {
        super(3, cVar);
        this.v = i;
        this.D = obj;
        this.z = str;
        this.A = str2;
        this.B = str3;
        this.E = j0Var;
        this.C = str4;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                e eVar = new e(cVar, (f) this.D, (oa.j) this.E, this.z, this.A, this.B, this.C);
                eVar.x = jVar;
                eVar.y = obj2;
                return eVar.v(a0.a);
            case 1:
                e eVar2 = new e(cVar, (h5) this.D, this.z, this.A, this.B, (j0) this.E, this.C, 1);
                eVar2.x = jVar;
                eVar2.y = obj2;
                return eVar2.v(a0.a);
            default:
                e eVar3 = new e(cVar, (h5) this.D, this.z, this.A, this.B, (j0) this.E, this.C, 2);
                eVar3.x = jVar;
                eVar3.y = obj2;
                return eVar3.v(a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    y.j(obj);
                    y71.j jVar = this.x;
                    String str = (String) this.y;
                    y71.i e = ((c1) ((f) this.D).b.a((oa.j) this.E)).e(str, this.z, this.A, this.B, this.C);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar, e, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 1:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                a0 a0Var = a0.a;
                if (i2 == 0) {
                    y.j(obj);
                    y71.j jVar2 = this.x;
                    w61.k kVar = (w61.k) this.y;
                    p0 p0Var = (p0) kVar.r;
                    List list = (List) kVar.s;
                    h5 h5Var = (h5) this.D;
                    j0 j0Var = (j0) this.E;
                    y71.i e2 = h5Var.u.e(new ProjectsMetaInfo(this.z, this.A, this.B, j0Var, d0.n(j0Var)), this.C, (c0) null, list);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    n1.s(jVar2);
                    Object b = e2.b(new u4(jVar2, p0Var, 1), this);
                    if (b != aVar2) {
                        b = a0Var;
                    }
                    if (b != aVar2) {
                        b = a0Var;
                    }
                    if (b == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var;
            default:
                b71.a aVar3 = b71.a.r;
                int i3 = this.w;
                a0 a0Var2 = a0.a;
                if (i3 == 0) {
                    y.j(obj);
                    y71.j jVar3 = this.x;
                    w61.k kVar2 = (w61.k) this.y;
                    p0 p0Var2 = (p0) kVar2.r;
                    List list2 = (List) kVar2.s;
                    h5 h5Var2 = (h5) this.D;
                    j0 j0Var2 = (j0) this.E;
                    y71.i e3 = h5Var2.u.e(new ProjectsMetaInfo(this.z, this.A, this.B, j0Var2, d0.n(j0Var2)), this.C, (c0) null, list2);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    n1.s(jVar3);
                    Object b2 = e3.b(new u4(jVar3, p0Var2, 3), this);
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
                    y.j(obj);
                }
                return a0Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a71.c cVar, f fVar, oa.j jVar, String str, String str2, String str3, String str4) {
        super(3, cVar);
        this.v = 0;
        this.D = fVar;
        this.E = jVar;
        this.z = str;
        this.A = str2;
        this.B = str3;
        this.C = str4;
    }
}
