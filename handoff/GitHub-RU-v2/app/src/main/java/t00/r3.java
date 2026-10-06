package t00;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import jo.f90;
import jo.mi0;
import jo.sj0;
import jo.sl;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r3 implements z01.f0, mi0 {
    public com.github.service.wrapper.j r;
    public com.github.service.wrapper.b s;
    public v71.v t;
    public a00.b u;

    public r3(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v71.v vVar) {
        k71.k.g(jVar, "client");
        k71.k.g(bVar, "cachedClient");
        k71.k.g(vVar, "ioDispatcher");
        this.r = jVar;
        this.s = bVar;
        this.t = vVar;
        this.u = new a00.b(jVar, bVar, vVar, new com.github.rudroid.utilities.ui.emojipicker.e(16), new com.github.rudroid.widget.contribution.a(5), s01.o.r, new com.github.rudroid.widget.contribution.a(6), new com.github.rudroid.utilities.ui.emojipicker.e(17), new com.github.rudroid.utilities.ui.emojipicker.e(18), new com.github.rudroid.utilities.ui.emojipicker.e(19), new com.github.rudroid.utilities.ui.emojipicker.e(20), null, null, 129024);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        if (r3.p(r8, r10, r1, r4) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cd, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r2 == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(r3 r3Var, String str, int i, c71.c cVar) {
        p3 p3Var;
        int i2;
        int i3;
        ct.u uVar;
        String str2 = str;
        com.github.service.wrapper.b bVar = r3Var.s;
        if (cVar instanceof p3) {
            p3Var = (p3) cVar;
            int i4 = p3Var.y;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                p3Var.y = i4 - Integer.MIN_VALUE;
                Object obj = p3Var.w;
                b71.a aVar = b71.a.r;
                i2 = p3Var.y;
                if (i2 != 0) {
                    sy.y.j(obj);
                    ct.w wVar = new ct.w();
                    p3Var.u = str2;
                    i3 = i;
                    p3Var.v = i3;
                    p3Var.y = 1;
                    obj = bVar.c(wVar, str2);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = p3Var.u;
                        sy.y.j(obj);
                        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(r3Var.s, new zx.f(str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62)), r3Var.t);
                    }
                    int i5 = p3Var.v;
                    String str3 = p3Var.u;
                    sy.y.j(obj);
                    i3 = i5;
                    str2 = str3;
                }
                uVar = (ct.u) obj;
                if (uVar != null) {
                    ct.w wVar2 = new ct.w();
                    ct.u uVar2 = new ct.u(uVar.a, uVar.b, uVar.c, uVar.d, uVar.e, uVar.f, uVar.g, uVar.h, uVar.i, uVar.j, uVar.k, uVar.l, uVar.m, uVar.n != null ? new ct.n(i3) : null, uVar.o, uVar.p, uVar.q, uVar.r, uVar.s, uVar.t);
                    p3Var.u = str2;
                    p3Var.v = i3;
                    p3Var.y = 2;
                }
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(r3Var.s, new zx.f(str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62)), r3Var.t);
            }
        }
        p3Var = new p3(r3Var, cVar);
        Object obj2 = p3Var.w;
        b71.a aVar2 = b71.a.r;
        i2 = p3Var.y;
        if (i2 != 0) {
        }
        uVar = (ct.u) obj2;
        if (uVar != null) {
        }
        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(r3Var.s, new zx.f(str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62)), r3Var.t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00db, code lost:
    
        if (r3.p(r8, r10, r1, r4) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dd, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r2 == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(r3 r3Var, String str, int i, c71.c cVar) {
        q3 q3Var;
        int i2;
        int i3;
        gv.z2 z2Var;
        String str2 = str;
        com.github.service.wrapper.b bVar = r3Var.s;
        if (cVar instanceof q3) {
            q3Var = (q3) cVar;
            int i4 = q3Var.y;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                q3Var.y = i4 - Integer.MIN_VALUE;
                Object obj = q3Var.w;
                b71.a aVar = b71.a.r;
                i2 = q3Var.y;
                if (i2 != 0) {
                    sy.y.j(obj);
                    gv.b3 b3Var = new gv.b3();
                    q3Var.u = str2;
                    i3 = i;
                    q3Var.v = i3;
                    q3Var.y = 1;
                    obj = bVar.c(b3Var, str2);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = q3Var.u;
                        sy.y.j(obj);
                        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(r3Var.s, new zx.f(str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62)), r3Var.t);
                    }
                    int i5 = q3Var.v;
                    String str3 = q3Var.u;
                    sy.y.j(obj);
                    i3 = i5;
                    str2 = str3;
                }
                z2Var = (gv.z2) obj;
                if (z2Var != null) {
                    gv.b3 b3Var2 = new gv.b3();
                    gv.z2 z2Var2 = new gv.z2(z2Var.a, z2Var.b, z2Var.c, z2Var.d, z2Var.e, z2Var.f, z2Var.g, z2Var.h, z2Var.i, z2Var.j, z2Var.k, z2Var.l, z2Var.m, z2Var.n, z2Var.o, z2Var.p, z2Var.q, z2Var.r, z2Var.s != null ? new gv.n2(i3) : null, z2Var.t, z2Var.u, z2Var.v, z2Var.w, z2Var.x);
                    q3Var.u = str2;
                    q3Var.v = i3;
                    q3Var.y = 2;
                }
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(r3Var.s, new zx.f(str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62)), r3Var.t);
            }
        }
        q3Var = new q3(r3Var, cVar);
        Object obj2 = q3Var.w;
        b71.a aVar2 = b71.a.r;
        i2 = q3Var.y;
        if (i2 != 0) {
        }
        z2Var = (gv.z2) obj2;
        if (z2Var != null) {
        }
        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(r3Var.s, new zx.f(str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62)), r3Var.t);
    }

    public final Object a(String str) {
        return in.r.l(y71.n1.y(in.r.h(this.r.d(new sl(str))), this.t));
    }

    public final y71.i b(String str, int i, String str2) {
        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(this.s, new zx.t(str, str2, i, new aa.u0(Integer.valueOf(i))), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62)), this.t);
    }

    public final y71.i c(String str, int i, String str2) {
        return y71.n1.y(y71.n1.I(com.google.android.gms.internal.measurement.d5.R(com.github.service.wrapper.b.q(this.s, new zx.k(str, i, str2), ga.h.t, false, (Set) null, (Set) null, new bd.m(str, 8), new sw0.e(9), 28)), new rm0.j1((a71.c) null, this, i)), this.t);
    }

    public final y71.i d(String str, ArrayList arrayList, ProjectsMetaInfo projectsMetaInfo) {
        k71.k.g(str, "pullRequestId");
        return y71.n1.y(y71.n1.I(y71.n1.x(new d3(this, str, null, 0), new rm0.o3(in.r.h(this.r.d(new zx.d0(str, arrayList))), 29)), new a3(null, projectsMetaInfo, this, 0)), this.t);
    }

    public final y71.i e(String str, int i, String str2) {
        return y71.n1.y(new rm0.v9(new y00.l(com.github.service.wrapper.a.o(this.r, new sj0(str, i, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 28), this.t);
    }

    public final y71.i f(String str, ArrayList arrayList, ProjectsMetaInfo projectsMetaInfo) {
        k71.k.g(str, "issueId");
        return y71.n1.y(y71.n1.I(y71.n1.x(new d3(this, str, null, 1), new g3(in.r.h(this.r.d(new zx.d0(str, arrayList))), 0)), new a3(null, projectsMetaInfo, this, 1)), this.t);
    }

    public final y71.i g(String str) {
        k71.k.g(str, "issueId");
        return y71.n1.y(new sm.b(com.github.service.wrapper.b.a(this.s, new zx.r1(str), ga.h.t, false, (LinkedHashSet) null, 60), 18), this.t);
    }

    public final Object h() {
        return this;
    }

    public final y71.i i(String str) {
        k71.k.g(str, "issuePrId");
        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(this.s, new zx.o(str), ga.h.t, false, (LinkedHashSet) null, (Set) null, 60)), this.t);
    }

    public final y71.i j(String str) {
        k71.k.g(str, "pullRequestId");
        return this.u.e(str);
    }

    public final y71.i k(String str) {
        k71.k.g(str, "pullRequestId");
        return this.u.h(str);
    }

    public final y71.i l(String str, int i, String str2) {
        return y71.n1.y(new sm.b(com.github.service.wrapper.a.o(this.r, new zx.y1(str, str2, i, null, new aa.u0(30), null, null, null, 232), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 17), this.t);
    }

    public final y71.i m(String str, String str2, int i, String str3, z01.b0 b0Var) {
        zx.y1 y1Var;
        zx.y1 y1Var2;
        int ordinal = b0Var.ordinal();
        aa1.b bVar = aa.t0.d;
        if (ordinal == 0) {
            if (str3 != null) {
                bVar = new aa.u0(str3);
            }
            y1Var = new zx.y1(str, str2, i, bVar, new aa.u0(30), null, null, null, 224);
        } else {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                y1Var2 = new zx.y1(str, str2, i, null, null, null, new aa.u0(30), new aa.u0(str3), 56);
                return y71.n1.y(new sm.b(com.github.service.wrapper.a.o(this.r, y1Var2, (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 16), this.t);
            }
            if (str3 != null) {
                bVar = new aa.u0(str3);
            }
            y1Var = new zx.y1(str, str2, i, null, null, bVar, new aa.u0(30), null, 152);
        }
        y1Var2 = y1Var;
        return y71.n1.y(new sm.b(com.github.service.wrapper.a.o(this.r, y1Var2, (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 16), this.t);
    }

    public final y71.i n(String str) {
        k71.k.g(str, "pullRequestId");
        return this.u.b(str);
    }

    public final y71.i o(int i, String str, String str2, String str3) {
        k71.k.g(str, "ownerName");
        k71.k.g(str2, "repoName");
        k71.k.g(str3, "url");
        return y71.n1.y(new rm0.r3(6, com.github.service.wrapper.a.o(this.r, new f90(i, str, str2, str3), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), this), this.t);
    }
}
