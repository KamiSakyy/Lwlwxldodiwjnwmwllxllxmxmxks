package c00;

import aa.t0;
import aa.u0;
import aa.v0;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import vz.b0;
import vz.v;
import vz.w;
import vz.y;
import vz.z;
import w61.a0;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c extends c71.j implements j71.e {
    public final /* synthetic */ String A;
    public v0 B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int v;
    public int w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj, String str, a71.c cVar, int i2) {
        super(2, cVar);
        this.v = i2;
        this.z = i;
        this.C = obj;
        this.A = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                c cVar2 = new c(this.z, (u) this.C, this.A, cVar, 0);
                cVar2.y = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.z, (u) this.C, this.A, cVar, 1);
                cVar3.y = obj;
                return cVar3;
        }
    }

    public final Object s(Object obj, Object obj2) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return r(cVar, jVar).v(a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01fd, code lost:
    
        if (r8.b.b.a == true) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f7, code lost:
    
        if (r8.b.b.a == true) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0190 -> B:71:0x0194). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x008a -> B:14:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i;
        v vVar;
        Object v;
        y yVar;
        z zVar;
        v vVar2;
        z zVar2;
        y yVar2;
        z zVar3;
        int i2;
        yx0.v vVar3;
        Object v2;
        yx0.y yVar3;
        yx0.z zVar4;
        yx0.v vVar4;
        yx0.z zVar5;
        yx0.y yVar4;
        yx0.z zVar6;
        switch (this.v) {
            case 0:
                y71.j jVar = (y71.j) this.y;
                b71.a aVar = b71.a.r;
                int i3 = this.x;
                if (i3 == 0) {
                    sy.y.j(obj);
                    i = this.z;
                    vVar = null;
                    if (i > 0) {
                        int min = Math.min(i, 30);
                        i -= min;
                        u uVar = (u) this.C;
                        String str = (vVar == null || (yVar = vVar.a) == null || (zVar = yVar.c) == null) ? null : zVar.b.b.b;
                        this.y = jVar;
                        this.B = vVar;
                        this.w = i;
                        this.x = 1;
                        v = n1.v(com.github.service.wrapper.a.o(uVar.s, new b0(new u0(new Integer(min)), str == null ? t0.d : new u0(str), this.A), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), this);
                        if (v == aVar) {
                            return aVar;
                        }
                        vVar2 = (v) v;
                        if (vVar2 != null) {
                        }
                    }
                    this.y = null;
                    this.B = null;
                    this.w = i;
                    this.x = 2;
                    if (jVar.c(vVar, this) == aVar) {
                    }
                    return a0.a;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0.a;
                }
                i = this.w;
                vVar = (v) this.B;
                sy.y.j(obj);
                v = obj;
                vVar2 = (v) v;
                if (vVar2 != null) {
                    if (vVar == null) {
                        vVar = vVar2;
                    } else {
                        y yVar5 = vVar2.a;
                        if (yVar5 != null && (zVar2 = yVar5.c) != null) {
                            w wVar = zVar2.b;
                            vz.a0 a0Var = wVar.b;
                            List list = wVar.c;
                            List list2 = x61.r.r;
                            if (list == null) {
                                list = list2;
                            }
                            y yVar6 = vVar.a;
                            if (yVar6 == null) {
                                yVar2 = null;
                            } else {
                                z zVar7 = yVar6.c;
                                if (zVar7 == null) {
                                    zVar3 = null;
                                } else {
                                    w wVar2 = zVar7.b;
                                    List list3 = wVar2.c;
                                    if (list3 != null) {
                                        list2 = list3;
                                    }
                                    zVar3 = new z(zVar7.a, new w(wVar2.a, a0Var, x61.m.l0(list2, list)));
                                }
                                String str2 = yVar6.a;
                                String str3 = yVar6.b;
                                k71.k.g(str2, "__typename");
                                yVar2 = new y(str2, str3, zVar3);
                            }
                            vVar = new v(yVar2, vVar.b, vVar.c);
                        }
                    }
                    y yVar7 = vVar.a;
                    if (yVar7 != null) {
                        z zVar8 = yVar7.c;
                        if (zVar8 != null) {
                            break;
                        }
                    }
                }
                this.y = null;
                this.B = null;
                this.w = i;
                this.x = 2;
                if (jVar.c(vVar, this) == aVar) {
                    return aVar;
                }
                return a0.a;
            default:
                y71.j jVar2 = (y71.j) this.y;
                b71.a aVar2 = b71.a.r;
                int i4 = this.x;
                if (i4 == 0) {
                    sy.y.j(obj);
                    i2 = this.z;
                    vVar3 = null;
                    if (i2 > 0) {
                        int min2 = Math.min(i2, 30);
                        i2 -= min2;
                        u uVar2 = (u) this.C;
                        String str4 = (vVar3 == null || (yVar3 = vVar3.a) == null || (zVar4 = yVar3.c) == null) ? null : zVar4.b.b.b;
                        this.y = jVar2;
                        this.B = vVar3;
                        this.w = i2;
                        this.x = 1;
                        v2 = n1.v(com.github.service.wrapper.a.o(uVar2.s, new yx0.b0(new u0(new Integer(min2)), str4 == null ? t0.d : new u0(str4), this.A), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), this);
                        if (v2 == aVar2) {
                            return aVar2;
                        }
                        vVar4 = (yx0.v) v2;
                        if (vVar4 != null) {
                        }
                    }
                    this.y = null;
                    this.B = null;
                    this.w = i2;
                    this.x = 2;
                    if (jVar2.c(vVar3, this) == aVar2) {
                    }
                    return a0.a;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0.a;
                }
                i2 = this.w;
                vVar3 = (yx0.v) this.B;
                sy.y.j(obj);
                v2 = obj;
                vVar4 = (yx0.v) v2;
                if (vVar4 != null) {
                    if (vVar3 == null) {
                        vVar3 = vVar4;
                    } else {
                        yx0.y yVar8 = vVar4.a;
                        if (yVar8 != null && (zVar5 = yVar8.c) != null) {
                            yx0.w wVar3 = zVar5.b;
                            yx0.a0 a0Var2 = wVar3.b;
                            List list4 = wVar3.c;
                            List list5 = x61.r.r;
                            if (list4 == null) {
                                list4 = list5;
                            }
                            yx0.y yVar9 = vVar3.a;
                            if (yVar9 == null) {
                                yVar4 = null;
                            } else {
                                yx0.z zVar9 = yVar9.c;
                                if (zVar9 == null) {
                                    zVar6 = null;
                                } else {
                                    yx0.w wVar4 = zVar9.b;
                                    List list6 = wVar4.c;
                                    if (list6 != null) {
                                        list5 = list6;
                                    }
                                    zVar6 = new yx0.z(zVar9.a, new yx0.w(wVar4.a, a0Var2, x61.m.l0(list5, list4)));
                                }
                                String str5 = yVar9.a;
                                String str6 = yVar9.b;
                                k71.k.g(str5, "__typename");
                                yVar4 = new yx0.y(str5, str6, zVar6);
                            }
                            vVar3 = new yx0.v(yVar4, vVar3.b, vVar3.c);
                        }
                    }
                    yx0.y yVar10 = vVar3.a;
                    if (yVar10 != null) {
                        yx0.z zVar10 = yVar10.c;
                        if (zVar10 != null) {
                            break;
                        }
                    }
                }
                this.y = null;
                this.B = null;
                this.w = i2;
                this.x = 2;
                if (jVar2.c(vVar3, this) == aVar2) {
                    return aVar2;
                }
                return a0.a;
        }
    }
    public Object v(Object) { return null; }
}
