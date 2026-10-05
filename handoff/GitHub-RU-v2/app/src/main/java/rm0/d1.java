package rm0;

import com.github.service.models.response.discussions.type.DiscussionCloseReason;
import kotlin.NoWhenBranchMatchedException;
import m10.fd;
import m10.zd;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d1 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ DiscussionCloseReason t;
    public final /* synthetic */ String u;

    public /* synthetic */ d1(y71.j jVar, DiscussionCloseReason discussionCloseReason, String str, int i) {
        this.r = i;
        this.s = jVar;
        this.t = discussionCloseReason;
        this.u = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        c1 c1Var;
        int i;
        id0.c cVar2;
        gn0.u9 u9Var;
        t00.z0 z0Var;
        int i2;
        np.c cVar3;
        zd zdVar;
        vb0.r0 r0Var;
        int i3;
        s20.c cVar4;
        hc0.i9 i9Var;
        wy0.s0 s0Var;
        int i4;
        io0.c cVar5;
        pz0.va vaVar;
        switch (this.r) {
            case 0:
                if (cVar instanceof c1) {
                    c1Var = (c1) cVar;
                    int i5 = c1Var.v;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c1Var.v = i5 - Integer.MIN_VALUE;
                        Object obj2 = c1Var.u;
                        b71.a aVar = b71.a.r;
                        i = c1Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            uf0.k kVar = (uf0.k) obj;
                            if (kVar != null) {
                                gn0.a9.Companion.getClass();
                                String str = ((aa.q) gn0.a9.l).a;
                                DiscussionCloseReason discussionCloseReason = this.t;
                                k71.k.g(discussionCloseReason, "<this>");
                                int i6 = rl0.a.a[discussionCloseReason.ordinal()];
                                if (i6 == 1) {
                                    u9Var = gn0.u9.t;
                                } else if (i6 == 2) {
                                    u9Var = gn0.u9.u;
                                } else if (i6 == 3) {
                                    u9Var = gn0.u9.v;
                                } else {
                                    if (i6 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    u9Var = gn0.u9.w;
                                }
                                cVar2 = new id0.c(new id0.a(new id0.d(str, this.u, uf0.k.a(kVar, true, u9Var))));
                            } else {
                                cVar2 = null;
                            }
                            c1Var.v = 1;
                            if (this.s.c(cVar2, c1Var) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj2);
                        }
                        return w61.a0.a;
                    }
                }
                c1Var = new c1(this, cVar);
                Object obj22 = c1Var.u;
                b71.a aVar2 = b71.a.r;
                i = c1Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof t00.z0) {
                    z0Var = (t00.z0) cVar;
                    int i7 = z0Var.v;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        z0Var.v = i7 - Integer.MIN_VALUE;
                        Object obj3 = z0Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = z0Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            is.k kVar2 = (is.k) obj;
                            if (kVar2 != null) {
                                fd.Companion.getClass();
                                String str2 = ((aa.q) fd.l).a;
                                DiscussionCloseReason discussionCloseReason2 = this.t;
                                k71.k.g(discussionCloseReason2, "<this>");
                                int i8 = wy.a.a[discussionCloseReason2.ordinal()];
                                if (i8 == 1) {
                                    zdVar = zd.t;
                                } else if (i8 == 2) {
                                    zdVar = zd.u;
                                } else if (i8 == 3) {
                                    zdVar = zd.v;
                                } else {
                                    if (i8 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    zdVar = zd.w;
                                }
                                cVar3 = new np.c(new np.a(new np.d(str2, this.u, is.k.a(kVar2, true, zdVar))));
                            } else {
                                cVar3 = null;
                            }
                            z0Var.v = 1;
                            if (this.s.c(cVar3, z0Var) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj3);
                        }
                        return w61.a0.a;
                    }
                }
                z0Var = new t00.z0(this, cVar);
                Object obj32 = z0Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = z0Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof vb0.r0) {
                    r0Var = (vb0.r0) cVar;
                    int i9 = r0Var.v;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        r0Var.v = i9 - Integer.MIN_VALUE;
                        Object obj4 = r0Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = r0Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            e50.j jVar = (e50.j) obj;
                            if (jVar != null) {
                                hc0.o8.Companion.getClass();
                                String str3 = ((aa.q) hc0.o8.l).a;
                                DiscussionCloseReason discussionCloseReason3 = this.t;
                                k71.k.g(discussionCloseReason3, "<this>");
                                int i10 = xa0.a.a[discussionCloseReason3.ordinal()];
                                if (i10 == 1) {
                                    i9Var = hc0.i9.t;
                                } else if (i10 == 2) {
                                    i9Var = hc0.i9.u;
                                } else if (i10 == 3) {
                                    i9Var = hc0.i9.v;
                                } else {
                                    if (i10 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i9Var = hc0.i9.w;
                                }
                                cVar4 = new s20.c(new s20.a(new s20.d(str3, this.u, e50.j.a(jVar, true, i9Var))));
                            } else {
                                cVar4 = null;
                            }
                            r0Var.v = 1;
                            if (this.s.c(cVar4, r0Var) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj4);
                        }
                        return w61.a0.a;
                    }
                }
                r0Var = new vb0.r0(this, cVar);
                Object obj42 = r0Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = r0Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof wy0.s0) {
                    s0Var = (wy0.s0) cVar;
                    int i12 = s0Var.v;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        s0Var.v = i12 - Integer.MIN_VALUE;
                        Object obj5 = s0Var.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = s0Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj5);
                            ar0.k kVar3 = (ar0.k) obj;
                            if (kVar3 != null) {
                                pz0.ba.Companion.getClass();
                                String str4 = ((aa.q) pz0.ba.l).a;
                                DiscussionCloseReason discussionCloseReason4 = this.t;
                                k71.k.g(discussionCloseReason4, "<this>");
                                int i13 = dx0.a.a[discussionCloseReason4.ordinal()];
                                if (i13 == 1) {
                                    vaVar = pz0.va.t;
                                } else if (i13 == 2) {
                                    vaVar = pz0.va.u;
                                } else if (i13 == 3) {
                                    vaVar = pz0.va.v;
                                } else {
                                    if (i13 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    vaVar = pz0.va.w;
                                }
                                cVar5 = new io0.c(new io0.a(new io0.d(str4, this.u, ar0.k.a(kVar3, true, vaVar))));
                            } else {
                                cVar5 = null;
                            }
                            s0Var.v = 1;
                            if (this.s.c(cVar5, s0Var) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                        }
                        return w61.a0.a;
                    }
                }
                s0Var = new wy0.s0(this, cVar);
                Object obj52 = s0Var.u;
                b71.a aVar52 = b71.a.r;
                i4 = s0Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
        }
    }
}
