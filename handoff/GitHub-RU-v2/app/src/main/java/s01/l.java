package s01;

import aa.r0;
import aa.s0;
import aa.v0;
import aa.w0;
import com.google.android.gms.internal.measurement.d5;
import d1.c2Shadow;
import in.r;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import m7.x;
import rm0.r3Shadow;
import rm0.ya;
import sy.y;
import t00.f8;
import v71.v;
import w61.a0;
import y71.n1;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l {
    public final com.github.service.wrapper.j a;
    public final com.github.service.wrapper.b b;
    public final v c;
    public final j71.c d;
    public final j71.c e;
    public final j71.e f;
    public final j71.e g;
    public final j71.c h;
    public final j71.c i;
    public final j71.c j;
    public final j71.c k;
    public final boolean l;
    public final j71.e m;
    public final j71.e n;
    public final Set o;
    public final j71.f p;
    public final ga.h q;
    public final j71.e r;

    public l(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v vVar, j71.c cVar, j71.c cVar2, j71.e eVar, o oVar, j71.e eVar2, j71.c cVar3, j71.c cVar4, j71.c cVar5, j71.c cVar6, boolean z, j71.e eVar3, j71.e eVar4, Set set, j71.f fVar, ga.h hVar) {
        ya yaVar;
        k71.k.g(jVar, "client");
        k71.k.g(bVar, "cachedClient");
        k71.k.g(vVar, "ioDispatcher");
        k71.k.g(set, "partialNodeErrorTypes");
        this.a = jVar;
        this.b = bVar;
        this.c = vVar;
        this.d = cVar;
        this.e = cVar2;
        this.f = eVar;
        this.g = eVar2;
        this.h = cVar3;
        this.i = cVar4;
        this.j = cVar5;
        this.k = cVar6;
        this.l = z;
        this.m = eVar3;
        this.n = eVar4;
        this.o = set;
        this.p = fVar;
        this.q = hVar;
        int ordinal = oVar.ordinal();
        if (ordinal == 0) {
            yaVar = new ya(8);
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            yaVar = new ya(9);
        }
        this.r = yaVar;
    }

    public final Object a(Object obj, Object obj2, c71.c cVar) {
        return c(obj, new b((p) this, obj2, 0), cVar);
    }

    public final y71.i b(Object obj) {
        k71.k.g(obj, "id");
        final int i = 0;
        final int i2 = 1;
        return n1.y(r.g(new f8(new x(this, obj, (a71.c) null, 8)), new j71.c(this) { // from class: s01.c
            public final /* synthetic */ l s;

            {
                this.s = this;
            }

            @Override // j71.c
            public final Object k(Object obj2) {
                x01.i iVar;
                x01.i iVar2;
                v0 v0Var = (v0) obj2;
                switch (i) {
                    case 0:
                        if (v0Var == null || (iVar = (x01.i) this.s.i.k(v0Var)) == null) {
                            return null;
                        }
                        return Boolean.valueOf(iVar.a());
                    default:
                        if (v0Var == null || (iVar2 = (x01.i) this.s.i.k(v0Var)) == null) {
                            return null;
                        }
                        return iVar2.b;
                }
            }
        }, new j71.c(this) { // from class: s01.c
            public final /* synthetic */ l s;

            {
                this.s = this;
            }

            @Override // j71.c
            public final Object k(Object obj2) {
                x01.i iVar;
                x01.i iVar2;
                v0 v0Var = (v0) obj2;
                switch (i2) {
                    case 0:
                        if (v0Var == null || (iVar = (x01.i) this.s.i.k(v0Var)) == null) {
                            return null;
                        }
                        return Boolean.valueOf(iVar.a());
                    default:
                        if (v0Var == null || (iVar2 = (x01.i) this.s.i.k(v0Var)) == null) {
                            return null;
                        }
                        return iVar2.b;
                }
            }
        }, new nf.j(15, this, obj), new a(this, obj, 0)), this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, j71.c cVar, a71.c cVar2) {
        g gVar;
        int i;
        v0 v0Var;
        r0 r0Var;
        if (cVar2 instanceof g) {
            gVar = (g) cVar2;
            int i2 = gVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.z = i2 - Integer.MIN_VALUE;
                Object obj2 = gVar.x;
                Object obj3 = b71.a.r;
                i = gVar.z;
                j71.c cVar3 = this.e;
                if (i != 0) {
                    y.j(obj2);
                    w0 w0Var = (w0) cVar3.k(obj);
                    gVar.u = obj;
                    gVar.v = cVar;
                    gVar.z = 1;
                    obj2 = g(w0Var, false, gVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v0 v0Var2 = gVar.w;
                        y.j(obj2);
                        return v0Var2;
                    }
                    cVar = gVar.v;
                    obj = gVar.u;
                    y.j(obj2);
                }
                v0Var = (v0) obj2;
                if (v0Var != null || (r0Var = (v0) cVar.k(v0Var)) == null) {
                    return null;
                }
                s0 s0Var = (s0) cVar3.k(obj);
                gVar.u = null;
                gVar.v = null;
                gVar.w = r0Var;
                gVar.z = 2;
                return this.b.j(s0Var, r0Var, gVar) == obj3 ? obj3 : r0Var;
            }
        }
        gVar = new g(this, cVar2);
        Object obj22 = gVar.x;
        Object obj32 = b71.a.r;
        i = gVar.z;
        j71.c cVar32 = this.e;
        if (i != 0) {
        }
        v0Var = (v0) obj22;
        if (v0Var != null) {
        }
        return null;
    }

    public final Object d(Object obj, j71.c cVar, j71.c cVar2, c71.c cVar3) {
        return c(obj, new c2Shadow((p) this, cVar, cVar2, 22), cVar3);
    }

    public final y71.i e(Object obj) {
        k71.k.g(obj, "id");
        int i = 1;
        return n1.y(new r3Shadow(3, d5.R(com.github.service.wrapper.b.q(this.b, (w0) this.d.k(obj), this.q, true, null, this.o, new a(this, obj, i), new b(this, obj, i), 8)), this), this.c);
    }

    public final Object f(Object obj, c71.c cVar) {
        return this.b.f((s0) this.e.k(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        if (r2 == r4) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(w0 w0Var, boolean z, c71.c cVar) {
        j jVar;
        b71.a aVar;
        int i;
        w0 w0Var2;
        boolean z2;
        v0 v0Var;
        y71.i o;
        w0 w0Var3;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i2 = jVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.z = i2 - Integer.MIN_VALUE;
                Object obj = jVar.x;
                aVar = b71.a.r;
                i = jVar.z;
                com.github.service.wrapper.b bVar = this.b;
                if (i != 0) {
                    y.j(obj);
                    jVar.u = w0Var;
                    jVar.w = z;
                    jVar.z = 1;
                    Object f = bVar.f(w0Var);
                    if (f != aVar) {
                        w0Var2 = w0Var;
                        z2 = z;
                        obj = f;
                    }
                    return aVar;
                }
                if (i == 1) {
                    z2 = jVar.w;
                    w0 w0Var4 = jVar.u;
                    y.j(obj);
                    w0Var2 = w0Var4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return (v0) obj;
                    }
                    z2 = jVar.w;
                    v0Var = jVar.v;
                    w0Var3 = jVar.u;
                    y.j(obj);
                    w0Var2 = w0Var3;
                    if (v0Var != null) {
                        return v0Var;
                    }
                    jVar.u = null;
                    jVar.v = null;
                    jVar.w = z2;
                    jVar.z = 3;
                    obj = bVar.f(w0Var2);
                }
                v0Var = (v0) obj;
                if (v0Var == null && z2) {
                    o = com.github.service.wrapper.a.o(this.b, w0Var2, null, false, null, null, 62);
                    jVar.u = w0Var2;
                    jVar.v = v0Var;
                    jVar.w = z2;
                    jVar.z = 2;
                    if (n1.j(o, jVar) != aVar) {
                        w0Var3 = w0Var2;
                        w0Var2 = w0Var3;
                    }
                    return aVar;
                }
                if (v0Var != null) {
                }
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.x;
        aVar = b71.a.r;
        i = jVar.z;
        com.github.service.wrapper.b bVar2 = this.b;
        if (i != 0) {
        }
        v0Var = (v0) obj2;
        if (v0Var == null) {
            o = com.github.service.wrapper.a.o(this.b, w0Var2, null, false, null, null, 62);
            jVar.u = w0Var2;
            jVar.v = v0Var;
            jVar.w = z2;
            jVar.z = 2;
            if (n1.j(o, jVar) != aVar) {
            }
            return aVar;
        }
        if (v0Var != null) {
        }
    }

    public final y71.i h(Object obj) {
        k71.k.g(obj, "id");
        return n1.y(r.l(com.github.service.wrapper.a.o(this.b, (w0) this.d.k(obj), null, false, null, this.o, 46)), this.c);
    }

    public final y71.i i(Object obj) {
        return n1.y(new r3Shadow(4, com.github.service.wrapper.a.o(this.b, (w0) this.d.k(obj), null, false, null, this.o, 46), this), this.c);
    }

    public final Object j(Object obj, v0 v0Var, a71.c cVar) {
        Object j = this.b.j((s0) this.e.k(obj), v0Var, cVar);
        return j == b71.a.r ? j : a0.a;
    }

    public l(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v vVar, j71.c cVar, j71.c cVar2, j71.e eVar, j71.e eVar2, j71.c cVar3, j71.c cVar4, j71.c cVar5, j71.c cVar6) {
        this(jVar, bVar, vVar, cVar, cVar2, eVar, o.r, eVar2, cVar3, cVar4, cVar5, cVar6, false, new ya(6), new ya(7), r.b, new ra.c(16), ga.h.t);
    }
}
