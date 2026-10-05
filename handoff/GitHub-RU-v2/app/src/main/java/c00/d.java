package c00;

import aa.t0;
import aa.u0;
import com.github.rudroid.fileschanged.delete.e0;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import sy.y;
import t00.f8;
import w61.a0;
import xz.v;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d extends c71.j implements j71.f {
    public final /* synthetic */ String A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(a71.c cVar, Object obj, String str, String str2, String str3, ha.b bVar, int i) {
        super(3, cVar);
        this.v = i;
        this.D = obj;
        this.z = str;
        this.A = str2;
        this.B = str3;
        this.C = bVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                d dVar = new d(cVar, (u) this.D, this.z, this.A, (String) this.B, (ha.b) this.C, 0);
                dVar.x = jVar;
                dVar.y = obj2;
                return dVar.v(a0.a);
            case 1:
                d dVar2 = new d(cVar, (u) this.D, this.z, this.A, (String) this.B, (ha.b) this.C, 1);
                dVar2.x = jVar;
                dVar2.y = obj2;
                return dVar2.v(a0.a);
            default:
                d dVar3 = new d(cVar, (ml.c) this.D, (oa.j) this.B, this.z, this.A, (e0) this.C);
                dVar3.x = jVar;
                dVar3.y = obj2;
                return dVar3.v(a0.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        y71.i f8Var;
        int i;
        y71.i f8Var2;
        int i2;
        switch (this.v) {
            case 0:
                u uVar = (u) this.D;
                b71.a aVar = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    y.j(obj);
                    y71.j jVar = this.x;
                    v vVar = (v) this.y;
                    xz.o oVar = vVar != null ? vVar.c.b.b : null;
                    if (oVar != null) {
                        String str = oVar.b;
                        if (oVar.a) {
                            x61.r rVar = x61.r.r;
                            int i4 = 30;
                            if (str != null) {
                                x61.r rVar2 = vVar.c.b.c;
                                if (rVar2 != null) {
                                    i = 30;
                                    rVar = rVar2;
                                    f8Var = n1.y(new g(new g(new bz0.e(com.github.service.wrapper.a.o(uVar.s, new vz.o(this.z, new u0(this.A), i, str != null ? t0.d : new u0(str), new u0((String) this.B)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 12), vVar, rVar, 0), uVar, (ha.b) this.C, 1), uVar.u);
                                    this.x = null;
                                    this.y = null;
                                    this.w = 1;
                                    if (n1.q(jVar, f8Var, this) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                List list = vVar.c.b.c;
                                int size = list != null ? list.size() : 0;
                                if (size > 0) {
                                    i4 = Math.min(size, 100);
                                }
                            }
                            i = i4;
                            f8Var = n1.y(new g(new g(new bz0.e(com.github.service.wrapper.a.o(uVar.s, new vz.o(this.z, new u0(this.A), i, str != null ? t0.d : new u0(str), new u0((String) this.B)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 12), vVar, rVar, 0), uVar, (ha.b) this.C, 1), uVar.u);
                            this.x = null;
                            this.y = null;
                            this.w = 1;
                            if (n1.q(jVar, f8Var, this) == aVar) {
                            }
                        }
                    }
                    f8Var = new f8(21, Boolean.FALSE);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar, f8Var, this) == aVar) {
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 1:
                u uVar2 = (u) this.D;
                b71.a aVar2 = b71.a.r;
                int i5 = this.w;
                if (i5 == 0) {
                    y.j(obj);
                    y71.j jVar2 = this.x;
                    ay0.v vVar2 = (ay0.v) this.y;
                    ay0.o oVar2 = vVar2 != null ? vVar2.c.b.b : null;
                    if (oVar2 != null) {
                        String str2 = oVar2.b;
                        if (oVar2.a) {
                            x61.r rVar3 = x61.r.r;
                            int i6 = 30;
                            if (str2 != null) {
                                x61.r rVar4 = vVar2.c.b.c;
                                if (rVar4 != null) {
                                    i2 = 30;
                                    rVar3 = rVar4;
                                    f8Var2 = n1.y(new g(new g(new bz0.e(com.github.service.wrapper.a.o(uVar2.s, new yx0.o(this.z, new u0(this.A), i2, str2 != null ? t0.d : new u0(str2), new u0((String) this.B)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 26), vVar2, rVar3, 5), uVar2, (ha.b) this.C, 6), uVar2.u);
                                    this.x = null;
                                    this.y = null;
                                    this.w = 1;
                                    if (n1.q(jVar2, f8Var2, this) == aVar2) {
                                        return aVar2;
                                    }
                                }
                            } else {
                                List list2 = vVar2.c.b.c;
                                int size2 = list2 != null ? list2.size() : 0;
                                if (size2 > 0) {
                                    i6 = Math.min(size2, 100);
                                }
                            }
                            i2 = i6;
                            f8Var2 = n1.y(new g(new g(new bz0.e(com.github.service.wrapper.a.o(uVar2.s, new yx0.o(this.z, new u0(this.A), i2, str2 != null ? t0.d : new u0(str2), new u0((String) this.B)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 26), vVar2, rVar3, 5), uVar2, (ha.b) this.C, 6), uVar2.u);
                            this.x = null;
                            this.y = null;
                            this.w = 1;
                            if (n1.q(jVar2, f8Var2, this) == aVar2) {
                            }
                        }
                    }
                    f8Var2 = new f8(21, Boolean.FALSE);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar2, f8Var2, this) == aVar2) {
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            default:
                b71.a aVar3 = b71.a.r;
                int i7 = this.w;
                if (i7 == 0) {
                    y.j(obj);
                    y71.j jVar3 = this.x;
                    String str3 = ((p01.g) this.y).c;
                    f8 f8Var3 = str3 == null ? new f8(21, null) : new go0.n(((ml.c) this.D).b.a((oa.j) this.B, this.z, this.A, (e0) this.C), str3, 4);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar3, f8Var3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a71.c cVar, ml.c cVar2, oa.j jVar, String str, String str2, e0 e0Var) {
        super(3, cVar);
        this.v = 2;
        this.D = cVar2;
        this.B = jVar;
        this.z = str;
        this.A = str2;
        this.C = e0Var;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e0<T1,T2,T3,T4> {
        public e0() {
        }
    }
}
