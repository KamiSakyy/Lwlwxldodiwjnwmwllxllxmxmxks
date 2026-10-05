package sk;

import c71.j;
import com.github.service.models.response.projects.ProjectsMetaInfo;
import j71.f;
import java.util.List;
import l01.c0;
import l01.j0;
import l01.p0;
import sy.d0;
import sy.y;
import t00.h5;
import t00.u4;
import w61.a0;
import w61.k;
import y71.i;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends j implements f {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(a71.c cVar, Object obj, String str, String str2, String str3, j0 j0Var, String str4, c0 c0Var, int i) {
        super(3, cVar);
        this.v = i;
        this.D = obj;
        this.z = str;
        this.A = str2;
        this.B = str3;
        this.E = j0Var;
        this.C = str4;
        this.F = c0Var;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                a aVar = new a(cVar, (b) this.D, (oa.j) this.E, this.z, this.A, this.B, this.C, (j71.c) this.F);
                aVar.x = jVar;
                aVar.y = obj2;
                return aVar.v(a0.a);
            case 1:
                a aVar2 = new a(cVar, (h5) this.D, this.z, this.A, this.B, (j0) this.E, this.C, (c0) this.F, 1);
                aVar2.x = jVar;
                aVar2.y = obj2;
                return aVar2.v(a0.a);
            default:
                a aVar3 = new a(cVar, (h5) this.D, this.z, this.A, this.B, (j0) this.E, this.C, (c0) this.F, 2);
                aVar3.x = jVar;
                aVar3.y = obj2;
                return aVar3.v(a0.a);
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
                    y71.y a = ((b) this.D).b.a((oa.j) this.E, this.z, this.A, this.B, this.C, (j71.c) this.F);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar, a, this) == aVar) {
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
                    k kVar = (k) this.y;
                    p0 p0Var = (p0) kVar.r;
                    List list = (List) kVar.s;
                    h5 h5Var = (h5) this.D;
                    j0 j0Var = (j0) this.E;
                    c0 c0Var = (c0) this.F;
                    i e = h5Var.u.e(new ProjectsMetaInfo(this.z, this.A, this.B, j0Var, d0.n(j0Var)), this.C, c0Var, list);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    n1.s(jVar2);
                    Object b = e.b(new u4(jVar2, p0Var, 0), this);
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
                    k kVar2 = (k) this.y;
                    p0 p0Var2 = (p0) kVar2.r;
                    List list2 = (List) kVar2.s;
                    h5 h5Var2 = (h5) this.D;
                    j0 j0Var2 = (j0) this.E;
                    c0 c0Var2 = (c0) this.F;
                    i e2 = h5Var2.u.e(new ProjectsMetaInfo(this.z, this.A, this.B, j0Var2, d0.n(j0Var2)), this.C, c0Var2, list2);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    n1.s(jVar3);
                    Object b2 = e2.b(new u4(jVar3, p0Var2, 2), this);
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
    public a(a71.c cVar, b bVar, oa.j jVar, String str, String str2, String str3, String str4, j71.c cVar2) {
        super(3, cVar);
        this.v = 0;
        this.D = bVar;
        this.E = jVar;
        this.z = str;
        this.A = str2;
        this.B = str3;
        this.C = str4;
        this.F = cVar2;
    }
}
