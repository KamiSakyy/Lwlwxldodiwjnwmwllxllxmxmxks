package y71;

import java.io.Serializable;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class y implements i {
    public final /* synthetic */ int r;
    public final /* synthetic */ i s;
    public final /* synthetic */ c71.j t;

    public y(j71.e eVar, i iVar) {
        this.r = 0;
        this.t = (c71.j) eVar;
        this.s = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0161  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0124 -> B:55:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0136 -> B:58:0x0133). Please report as a decompilation issue!!! */
    @Override // y71.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(j jVar, a71.c cVar) {
        Object e = null;
        x xVar;
        b71.a aVar;
        int i;
        Throwable th;
        z71.u uVar;
        y yVar;
        j jVar2;
        i iVar;
        z zVar;
        int i2;
        y yVar2;
        Throwable th2;
        c0 c0Var;
        int i3;
        long j;
        y yVar3;
        y yVar4;
        j jVar3;
        Throwable th3;
        Serializable i4;
        a71.c i0Var;
        int i5;
        k0 k0Var;
        switch (this.r) {
            case 0:
                if (cVar instanceof x) {
                    xVar = (x) cVar;
                    int i6 = xVar.v;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        xVar.v = i6 - Integer.MIN_VALUE;
                        Object obj = xVar.u;
                        aVar = b71.a.r;
                        i = xVar.v;
                        if (i != 0) {
                            sy.y.j(obj);
                            a71.h hVar = ((c71.c) xVar).s;
                            k71.k.d(hVar);
                            z71.u uVar2 = new z71.u(jVar, hVar);
                            try {
                                c71.j jVar4 = this.t;
                                xVar.x = this;
                                xVar.y = jVar;
                                xVar.z = uVar2;
                                xVar.v = 1;
                                if (jVar4.s(uVar2, xVar) == aVar) {
                                    return aVar;
                                }
                                yVar = this;
                                jVar2 = jVar;
                                uVar = uVar2;
                            } catch (Throwable th4) {
                                th = th4;
                                uVar = uVar2;
                                uVar.w();
                                throw th;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                sy.y.j(obj);
                                return w61.a0.a;
                            }
                            uVar = xVar.z;
                            jVar2 = xVar.y;
                            yVar = xVar.x;
                            try {
                                sy.y.j(obj);
                            } catch (Throwable th5) {
                                th = th5;
                                uVar.w();
                                throw th;
                            }
                        }
                        uVar.w();
                        iVar = yVar.s;
                        xVar.x = null;
                        xVar.y = null;
                        xVar.z = null;
                        xVar.v = 2;
                        if (iVar.b(jVar2, xVar) == aVar) {
                            return aVar;
                        }
                        return w61.a0.a;
                    }
                }
                xVar = new x(this, cVar);
                Object obj2 = xVar.u;
                aVar = b71.a.r;
                i = xVar.v;
                if (i != 0) {
                }
                uVar.w();
                iVar = yVar.s;
                xVar.x = null;
                xVar.y = null;
                xVar.z = null;
                xVar.v = 2;
                if (iVar.b(jVar2, xVar) == aVar) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof z) {
                    zVar = (z) cVar;
                    int i7 = zVar.v;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        zVar.v = i7 - Integer.MIN_VALUE;
                        Object obj3 = zVar.u;
                        Object obj4 = b71.a.r;
                        i2 = zVar.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            zVar.x = this;
                            zVar.y = jVar;
                            zVar.v = 1;
                            obj3 = n1.i(this.s, jVar, zVar);
                            if (obj3 == obj4) {
                                return obj4;
                            }
                            yVar2 = this;
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                sy.y.j(obj3);
                                return w61.a0.a;
                            }
                            jVar = zVar.y;
                            yVar2 = zVar.x;
                            sy.y.j(obj3);
                        }
                        th2 = (Throwable) obj3;
                        if (th2 != null) {
                            c71.j jVar5 = yVar2.t;
                            zVar.x = null;
                            zVar.y = null;
                            zVar.v = 2;
                            if (jVar5.f(jVar, th2, zVar) == obj4) {
                                return obj4;
                            }
                        }
                        return w61.a0.a;
                    }
                }
                zVar = new z(this, cVar);
                Object obj32 = zVar.u;
                Object obj42 = b71.a.r;
                i2 = zVar.v;
                if (i2 != 0) {
                }
                th2 = (Throwable) obj32;
                if (th2 != null) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof c0) {
                    c0Var = (c0) cVar;
                    int i8 = c0Var.v;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0Var.v = i8 - Integer.MIN_VALUE;
                        Object obj5 = c0Var.u;
                        Serializable serializable = b71.a.r;
                        i3 = c0Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj5);
                            j = 0;
                            yVar3 = this;
                            i iVar2 = yVar3.s;
                            c0Var.x = yVar3;
                            c0Var.y = jVar;
                            c0Var.z = null;
                            c0Var.A = j;
                            c0Var.v = 1;
                            i4 = n1.i(iVar2, jVar, c0Var);
                            if (i4 != serializable) {
                            }
                        } else if (i3 == 1) {
                            j = c0Var.A;
                            jVar = c0Var.y;
                            y yVar5 = c0Var.x;
                            sy.y.j(obj5);
                            yVar4 = yVar5;
                            jVar3 = jVar;
                            th3 = (Throwable) obj5;
                            if (th3 == null) {
                            }
                        } else {
                            if (i3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j = c0Var.A;
                            th3 = c0Var.z;
                            jVar3 = c0Var.y;
                            yVar4 = c0Var.x;
                            sy.y.j(obj5);
                            if (!((Boolean) obj5).booleanValue()) {
                                j++;
                                boolean z = true;
                                yVar3 = yVar4;
                                if (z) {
                                    return w61.a0.a;
                                }
                                jVar = jVar3;
                                i iVar22 = yVar3.s;
                                c0Var.x = yVar3;
                                c0Var.y = jVar;
                                c0Var.z = null;
                                c0Var.A = j;
                                c0Var.v = 1;
                                i4 = n1.i(iVar22, jVar, c0Var);
                                if (i4 != serializable) {
                                    return serializable;
                                }
                                yVar4 = yVar3;
                                obj5 = i4;
                                jVar3 = jVar;
                                th3 = (Throwable) obj5;
                                if (th3 == null) {
                                    c71.j jVar6 = yVar4.t;
                                    Long l = new Long(j);
                                    c0Var.x = yVar4;
                                    c0Var.y = jVar3;
                                    c0Var.z = th3;
                                    c0Var.A = j;
                                    c0Var.v = 2;
                                    obj5 = jVar6.n(jVar3, th3, l, c0Var);
                                    if (obj5 == serializable) {
                                        return serializable;
                                    }
                                    if (!((Boolean) obj5).booleanValue()) {
                                        throw th3;
                                    }
                                } else {
                                    z = false;
                                    yVar3 = yVar4;
                                    if (z) {
                                    }
                                }
                            }
                        }
                    }
                }
                c0Var = new c0(this, cVar);
                Object obj52 = c0Var.u;
                Serializable serializable2 = b71.a.r;
                i3 = c0Var.v;
                if (i3 != 0) {
                }
            case 3:
                Object b = this.s.b(new c00.f(new k71.s(), jVar, this.t), cVar);
                return b == b71.a.r ? b : w61.a0.a;
            case 4:
                if (cVar instanceof i0) {
                    i0Var = (i0) cVar;
                    int i9 = i0Var.v;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        i0Var.v = i9 - Integer.MIN_VALUE;
                        Object obj6 = i0Var.u;
                        b71.a aVar2 = b71.a.r;
                        i5 = i0Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj6);
                            i iVar3 = this.s;
                            k0 k0Var2 = new k0(this.t, jVar);
                            try {
                                i0Var.x = k0Var2;
                                i0Var.v = 1;
                                if (iVar3.b(k0Var2, i0Var) == aVar2) {
                                    return aVar2;
                                }
                            } catch (AbortFlowException e) {
                                e = e;
                                k0Var = k0Var2;
                                if (e.r == k0Var) {
                                    throw e;
                                }
                                a71.h hVar2 = ((c71.c) i0Var).s;
                                k71.k.d(hVar2);
                                v71.b0.m(hVar2);
                                return w61.a0.a;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            k0Var = i0Var.x;
                            try {
                                sy.y.j(obj6);
                            } catch (AbortFlowException e2) {
                                e = e2;
                                if (e.r == k0Var) {
                                }
                            }
                        }
                        return w61.a0.a;
                    }
                }
                i0Var = new i0(this, cVar);
                Object obj62 = i0Var.u;
                b71.a aVar22 = b71.a.r;
                i5 = i0Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                Object b2 = this.s.b(new k0(jVar, this.t, 1), cVar);
                return b2 == b71.a.r ? b2 : w61.a0.a;
            default:
                Object b3 = this.s.b(new k0(jVar, this.t, 2), cVar);
                return b3 == b71.a.r ? b3 : w61.a0.a;
        }
    }

    public y(i iVar, j71.e eVar, int i) {
        this.r = i;
        switch (i) {
            case 4:
                this.s = iVar;
                this.t = (c71.j) eVar;
                break;
            case 5:
                this.s = iVar;
                this.t = (c71.j) eVar;
                break;
            case 6:
                this.s = iVar;
                this.t = (c71.j) eVar;
                break;
            default:
                this.s = iVar;
                this.t = (c71.j) eVar;
                break;
        }
    }

    public y(i iVar, j71.f fVar) {
        this.r = 1;
        this.s = iVar;
        this.t = (c71.j) fVar;
    }

    public y(i iVar, j71.g gVar) {
        this.r = 2;
        this.s = iVar;
        this.t = (c71.j) gVar;
    }
    public y(Object p1, Object p2) {
    }
    public y(Object p1, Object p2, int p3) {
    }
}
