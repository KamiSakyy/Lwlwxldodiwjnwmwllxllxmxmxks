package v00;

import com.github.rudroid.copilot.h1;
import com.github.service.dotcom.models.response.copilot.AgentTaskArtifactDataResponse;
import com.github.service.dotcom.models.response.copilot.AgentTaskArtifactResponse;
import com.github.service.dotcom.models.response.copilot.AgentTaskCollaboratorResponse;
import com.github.service.dotcom.models.response.copilot.AgentTaskResponse;
import com.github.service.dotcom.models.response.copilot.AgentTaskSessionErrorResponse;
import com.github.service.dotcom.models.response.copilot.AgentTaskSessionResponse;
import com.github.service.dotcom.models.response.copilot.CreateAgentTaskPullsResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse$AgentConfirmation;
import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse$Complete;
import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse$Content;
import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse$Debug;
import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse$Error;
import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse$FunctionCall;
import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse$Unknown;
import com.github.service.dotcom.models.response.copilot.serialization.ChatThreadResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatThreadsResponse;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.TimelineItem;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.PullRequestReviewCommentState;
import com.github.service.models.response.type.StatusState;
import com.google.android.gms.internal.measurement.z3;
import ea0.c1;
import hc0.j2;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import u10.b30;
import u10.b5;
import u10.b9;
import u10.c5;
import u10.d30;
import u10.d5;
import u10.e30;
import u10.e6;
import u10.ek;
import u10.f6;
import u10.fk;
import u10.g5;
import u10.g6;
import u10.gk;
import u10.h40;
import u10.h5;
import u10.i40;
import u10.j40;
import u10.k10;
import u10.kd;
import u10.l10;
import u10.ld;
import u10.ly;
import u10.m10;
import u10.m5;
import u10.n5;
import u10.n8;
import u10.nd;
import u10.ny;
import u10.od;
import u10.oy;
import u10.p5;
import u10.p70;
import u10.p8;
import u10.q5;
import u10.q70;
import u10.q8;
import u10.qd;
import u10.r5;
import u10.r70;
import u10.r8;
import u10.s5;
import u10.s8;
import u10.sw;
import u10.t0;
import u10.t5;
import u10.t8;
import u10.tw;
import u10.u8;
import u10.uw;
import u10.v8;
import u10.w5;
import u10.w8;
import u10.wa;
import u10.xa;
import u10.ya;
import u10.z8;
import vb0.h0;
import vb0.k0;
import vb0.l0;
import vb0.m0;
import vb0.o0;
import vb0.s0;
import xn.a1;
import xn.f3;
import xn.l3;
import xn.m3;
import xn.n3;
import xn.o3;
import xn.p3;
import xn.q3;
import xn.r0;
import xn.r3;
import xn.s3;
import xn.t3;
import xn.u3;
import xn.v3;
import xn.w3;
import xn.x0;
import xn.x3;
import xn.y0;
import xn.y3;
import yz0.a7;
import yz0.b2;
import yz0.d3;
import yz0.g4;
import yz0.j4;
import yz0.o6;
import yz0.u0;
import yz0.w0;
import yz0.x2;
import z70.b7;
import z70.c7;
import z70.d7;
import z70.g2;
import z70.k2;
import z70.l2;
import z70.z6;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tShadow implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ t(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        vb0.a0 a0Var;
        int i;
        l10 l10Var;
        if (cVar instanceof vb0.a0) {
            a0Var = (vb0.a0) cVar;
            int i2 = a0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = a0Var.u;
                b71.a aVar = b71.a.r;
                i = a0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    m10 m10Var = ((k10) obj).a;
                    if (m10Var == null || (l10Var = m10Var.a) == null) {
                        throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "unresolveReviewThread field null", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                    }
                    g4 f = sy.f0.f(l10Var.c);
                    a0Var.v = 1;
                    if (this.s.c(f, a0Var) == aVar) {
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
        a0Var = new vb0.a0(this, cVar);
        Object obj22 = a0Var.u;
        b71.a aVar2 = b71.a.r;
        i = a0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(a71.c cVar, Object obj) {
        vb0.b0 b0Var;
        int i;
        e30 e30Var;
        if (cVar instanceof vb0.b0) {
            b0Var = (vb0.b0) cVar;
            int i2 = b0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = b0Var.u;
                b71.a aVar = b71.a.r;
                i = b0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    d30 d30Var = ((b30) obj).a;
                    x2 d = (d30Var == null || (e30Var = d30Var.a) == null) ? null : sy.tShadow.d(e30Var.c);
                    if (d != null) {
                        b0Var.v = 1;
                        if (this.s.c(d, b0Var) == aVar) {
                            return aVar;
                        }
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
        b0Var = new vb0.b0(this, cVar);
        Object obj22 = b0Var.u;
        b71.a aVar2 = b71.a.r;
        i = b0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(a71.c cVar, Object obj) {
        vb0.c0 c0Var;
        int i;
        yz0.q bVar;
        i40 i40Var;
        if (cVar instanceof vb0.c0) {
            c0Var = (vb0.c0) cVar;
            int i2 = c0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = c0Var.u;
                b71.a aVar = b71.a.r;
                i = c0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    j40 j40Var = ((h40) obj).a;
                    c40.c cVar2 = (j40Var == null || (i40Var = j40Var.a) == null) ? null : i40Var.d;
                    if (cVar2 == null) {
                        yz0.s.Companion.getClass();
                        bVar = yz0.r.b;
                    } else {
                        bVar = new bb0.b(cVar2, j40Var.a.c, new yz0.d0(cVar2.b));
                    }
                    c0Var.v = 1;
                    if (this.s.c(bVar, c0Var) == aVar) {
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
        c0Var = new vb0.c0(this, cVar);
        Object obj22 = c0Var.u;
        b71.a aVar2 = b71.a.r;
        i = c0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(a71.c cVar, Object obj) {
        vb0.d0 d0Var;
        int i;
        a7 p;
        q70 q70Var;
        if (cVar instanceof vb0.d0) {
            d0Var = (vb0.d0) cVar;
            int i2 = d0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = d0Var.u;
                b71.a aVar = b71.a.r;
                i = d0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    r70 r70Var = ((p70) obj).a;
                    e80.c cVar2 = (r70Var == null || (q70Var = r70Var.a) == null) ? null : q70Var.c;
                    if (cVar2 == null) {
                        yz0.s.Companion.getClass();
                        p = new a7(yz0.r.b, false, TimelineItem.TimelinePullRequestReview.ReviewState.UNKNOWN);
                    } else {
                        p = t.a0.p(cVar2);
                    }
                    d0Var.v = 1;
                    if (this.s.c(p, d0Var) == aVar) {
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
        d0Var = new vb0.d0(this, cVar);
        Object obj22 = d0Var.u;
        b71.a aVar2 = b71.a.r;
        i = d0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(a71.c cVar, Object obj) {
        vb0.e0 e0Var;
        int i;
        g40.b0 b0Var;
        if (cVar instanceof vb0.e0) {
            e0Var = (vb0.e0) cVar;
            int i2 = e0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = e0Var.u;
                b71.a aVar = b71.a.r;
                i = e0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    h5 h5Var = ((g5) obj).a;
                    u0 n = (h5Var == null || (b0Var = h5Var.c) == null) ? null : t.z.n(b0Var);
                    if (n != null) {
                        e0Var.v = 1;
                        if (this.s.c(n, e0Var) == aVar) {
                            return aVar;
                        }
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
        e0Var = new vb0.e0(this, cVar);
        Object obj22 = e0Var.u;
        b71.a aVar2 = b71.a.r;
        i = e0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(a71.c cVar, Object obj) {
        vb0.f0 f0Var;
        int i;
        c5 c5Var;
        g40.b0 b0Var;
        if (cVar instanceof vb0.f0) {
            f0Var = (vb0.f0) cVar;
            int i2 = f0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = f0Var.u;
                b71.a aVar = b71.a.r;
                i = f0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    d5 d5Var = ((b5) obj).a;
                    u0 n = (d5Var == null || (c5Var = d5Var.b) == null || (b0Var = c5Var.c) == null) ? null : t.z.n(b0Var);
                    if (n != null) {
                        f0Var.v = 1;
                        if (this.s.c(n, f0Var) == aVar) {
                            return aVar;
                        }
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
        f0Var = new vb0.f0(this, cVar);
        Object obj22 = f0Var.u;
        b71.a aVar2 = b71.a.r;
        i = f0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(a71.c cVar, Object obj) {
        vb0.g0 g0Var;
        int i;
        x61.rShadow arrayList;
        s5 s5Var;
        r5 r5Var;
        x01.i iVar;
        s5 s5Var2;
        s5 s5Var3;
        w0 w0Var;
        if (cVar instanceof vb0.g0) {
            g0Var = (vb0.g0) cVar;
            int i2 = g0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = g0Var.u;
                b71.a aVar = b71.a.r;
                i = g0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    m5 m5Var = (m5) obj;
                    r5 r5Var2 = m5Var.a;
                    String str = null;
                    t5 t5Var = r5Var2 != null ? r5Var2.c : null;
                    x61.rShadow<q5> rVar = x61.rShadow.r;
                    if (t5Var != null) {
                        x61.rShadow rVar2 = r5Var2.c.a.b;
                        if (rVar2 != null) {
                            rVar = rVar2;
                        }
                        arrayList = new ArrayList();
                        for (p5 p5Var : rVar) {
                            j4 r = p5Var != null ? t.q.r(p5Var.b.c) : null;
                            if (r != null) {
                                arrayList.add(r);
                            }
                        }
                    } else {
                        if ((r5Var2 != null ? r5Var2.d : null) != null) {
                            n5 n5Var = r5Var2.d.a;
                            x61.rShadow rVar3 = (n5Var == null || (s5Var = n5Var.b) == null) ? null : s5Var.a.b;
                            if (rVar3 != null) {
                                rVar = rVar3;
                            }
                            arrayList = new ArrayList();
                            for (q5 q5Var : rVar) {
                                j4 r2 = q5Var != null ? t.q.r(q5Var.c) : null;
                                if (r2 != null) {
                                    arrayList.add(r2);
                                }
                            }
                        }
                        r5Var = m5Var.a;
                        if ((r5Var == null ? r5Var.c : null) == null) {
                            w5 w5Var = r5Var.c.a.a;
                            iVar = new x01.i(w5Var.b, w5Var.a, false);
                        } else if ((r5Var != null ? r5Var.d : null) != null) {
                            n5 n5Var2 = r5Var.d.a;
                            boolean z = (n5Var2 == null || (s5Var3 = n5Var2.b) == null) ? false : s5Var3.a.a.a;
                            if (n5Var2 != null && (s5Var2 = n5Var2.b) != null) {
                                str = s5Var2.a.a.b;
                            }
                            iVar = new x01.i(str, z, false);
                        } else {
                            iVar = new x01.i((String) null, false, false);
                        }
                        w0Var = new w0(rVar, iVar);
                        g0Var.v = 1;
                        if (this.s.c(w0Var, g0Var) == aVar) {
                            return aVar;
                        }
                    }
                    rVar = arrayList;
                    r5Var = m5Var.a;
                    if ((r5Var == null ? r5Var.c : null) == null) {
                    }
                    w0Var = new w0(rVar, iVar);
                    g0Var.v = 1;
                    if (this.s.c(w0Var, g0Var) == aVar) {
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
        g0Var = new vb0.g0(this, cVar);
        Object obj22 = g0Var.u;
        b71.a aVar2 = b71.a.r;
        i = g0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object i(a71.c cVar, Object obj) {
        h0 h0Var;
        int i;
        ld ldVar;
        od odVar;
        ld ldVar2;
        od odVar2;
        ld ldVar3;
        od odVar3;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i2 = h0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = h0Var.u;
                b71.a aVar = b71.a.r;
                i = h0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    kd kdVar = (kd) obj;
                    qd qdVar = kdVar.a;
                    String str = null;
                    List<nd> list = (qdVar == null || (ldVar3 = qdVar.b) == null || (odVar3 = ldVar3.b) == null) ? null : odVar3.b.b;
                    if (list == null) {
                        list = x61.rShadow.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (nd ndVar : list) {
                        j4 r = ndVar != null ? t.q.r(ndVar.c) : null;
                        if (r != null) {
                            arrayList.add(r);
                        }
                    }
                    qd qdVar2 = kdVar.a;
                    boolean z = (qdVar2 == null || (ldVar2 = qdVar2.b) == null || (odVar2 = ldVar2.b) == null) ? false : odVar2.b.a.a;
                    if (qdVar2 != null && (ldVar = qdVar2.b) != null && (odVar = ldVar.b) != null) {
                        str = odVar.b.a.b;
                    }
                    w0 w0Var = new w0(arrayList, new x01.i(str, z, false));
                    h0Var.v = 1;
                    if (this.s.c(w0Var, h0Var) == aVar) {
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
        h0Var = new h0(this, cVar);
        Object obj22 = h0Var.u;
        b71.a aVar2 = b71.a.r;
        i = h0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(a71.c cVar, Object obj) {
        l0 l0Var;
        int i;
        a01.d dVar;
        w8 w8Var;
        int i2;
        int i3;
        x61.rShadow rVar;
        String str;
        y30.b bVar;
        String str2;
        y30.b bVar2;
        List<y30.c> list;
        CheckStatusState checkStatusState;
        String str3;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i4 = l0Var.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                l0Var.v = i4 - Integer.MIN_VALUE;
                Object obj2 = l0Var.u;
                b71.a aVar = b71.a.r;
                i = l0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    v8 v8Var = ((q8) obj).a;
                    if (v8Var == null || (w8Var = v8Var.c) == null) {
                        dVar = null;
                    } else {
                        String str4 = w8Var.a;
                        String str5 = w8Var.b;
                        CheckStatusState Y = b91.g.Y(w8Var.c);
                        z8 z8Var = w8Var.d;
                        String str6 = z8Var.b;
                        String str7 = z8Var.c;
                        com.github.service.models.response.a c = t.e.c(z8Var.a.b);
                        p8 p8Var = w8Var.e;
                        com.github.service.models.response.a c2 = t.e.c(p8Var != null ? p8Var.c : null);
                        b9 b9Var = w8Var.f;
                        if (b9Var == null) {
                            throw new IllegalStateException("WorkFlowRun information can't be null");
                        }
                        String str8 = b9Var.a;
                        String str9 = b9Var.b;
                        int i5 = b9Var.c;
                        String str10 = b9Var.d.a;
                        x61.rShadow rVar2 = b9Var.e.a;
                        x61.rShadow rVar3 = x61.rShadow.r;
                        if (rVar2 == null) {
                            rVar2 = rVar3;
                        }
                        ArrayList S = x61.m.S(rVar2);
                        ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                        int size = S.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj3 = S.get(i6);
                            int i7 = i6 + 1;
                            y40.f fVar = ((s8) obj3).b;
                            ArrayList arrayList2 = S;
                            boolean z = fVar.a;
                            int i8 = size;
                            y40.a aVar2 = fVar.b;
                            String str11 = str5;
                            String str12 = aVar2.a;
                            String str13 = aVar2.b;
                            x61.rShadow rVar4 = fVar.c.a;
                            if (rVar4 == null) {
                                rVar4 = rVar3;
                            }
                            ArrayList S2 = x61.m.S(rVar4);
                            CheckStatusState checkStatusState2 = Y;
                            ArrayList arrayList3 = new ArrayList();
                            String str14 = str6;
                            int size2 = S2.size();
                            String str15 = str7;
                            int i9 = 0;
                            while (i9 < size2) {
                                Object obj4 = S2.get(i9);
                                i9++;
                                ArrayList arrayList4 = S2;
                                y40.b bVar3 = (y40.b) obj4;
                                int i11 = size2;
                                y40.c cVar2 = bVar3.c;
                                if (cVar2 != null) {
                                    str3 = cVar2.a;
                                } else {
                                    y40.d dVar2 = bVar3.b;
                                    str3 = dVar2 != null ? dVar2.a : null;
                                }
                                if (str3 != null) {
                                    arrayList3.add(str3);
                                }
                                size2 = i11;
                                S2 = arrayList4;
                            }
                            arrayList.add(new a01.c(str12, str13, arrayList3, z));
                            S = arrayList2;
                            i6 = i7;
                            size = i8;
                            str5 = str11;
                            Y = checkStatusState2;
                            str6 = str14;
                            str7 = str15;
                        }
                        String str16 = str5;
                        CheckStatusState checkStatusState3 = Y;
                        String str17 = str6;
                        String str18 = str7;
                        a01.f fVar2 = new a01.f(i5, str8, str9, str10, arrayList);
                        n8 n8Var = w8Var.g;
                        x61.rShadow rVar5 = n8Var != null ? n8Var.a : null;
                        if (rVar5 == null) {
                            rVar5 = rVar3;
                        }
                        ArrayList S3 = x61.m.S(rVar5);
                        ArrayList arrayList5 = new ArrayList(x61.n.F(S3, 10));
                        int size3 = S3.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            Object obj5 = S3.get(i12);
                            int i13 = i12 + 1;
                            y30.f fVar3 = ((t8) obj5).c;
                            String str19 = fVar3.c;
                            String str20 = fVar3.a;
                            CheckStatusState Y2 = b91.g.Y(fVar3.b);
                            j2 j2Var = fVar3.d;
                            CheckConclusionState S4 = j2Var != null ? b41.b.S(j2Var) : null;
                            String str21 = fVar3.e;
                            y30.e eVar = fVar3.g;
                            ArrayList arrayList6 = S3;
                            int i14 = eVar != null ? eVar.a : 0;
                            if (eVar == null || (list = eVar.b) == null) {
                                i2 = size3;
                                i3 = i13;
                                rVar = rVar3;
                            } else {
                                i2 = size3;
                                i3 = i13;
                                x61.rShadow arrayList7 = new ArrayList(x61.n.F(list, 10));
                                for (y30.c cVar3 : list) {
                                    y30.d dVar3 = cVar3 != null ? cVar3.b : null;
                                    if (dVar3 == null || (checkStatusState = b91.g.Y(dVar3.a)) == null) {
                                        checkStatusState = CheckStatusState.UNKNOWN__;
                                    }
                                    arrayList7.add(new a01.b(checkStatusState));
                                }
                                rVar = arrayList7;
                            }
                            y30.a aVar3 = fVar3.f;
                            if (aVar3 == null || (bVar2 = aVar3.a) == null || (str2 = bVar2.a) == null) {
                                if (aVar3 == null || (bVar = aVar3.a) == null) {
                                    str = null;
                                    arrayList5.add(new a01.a(str19, str20, Y2, S4, str21, i14, rVar, str));
                                    S3 = arrayList6;
                                    size3 = i2;
                                    i12 = i3;
                                } else {
                                    str2 = bVar.b;
                                }
                            }
                            str = str2;
                            arrayList5.add(new a01.a(str19, str20, Y2, S4, str21, i14, rVar, str));
                            S3 = arrayList6;
                            size3 = i2;
                            i12 = i3;
                        }
                        r8 r8Var = w8Var.h;
                        x61.rShadow rVar6 = r8Var != null ? r8Var.a : null;
                        if (rVar6 == null) {
                            rVar6 = rVar3;
                        }
                        ArrayList S5 = x61.m.S(rVar6);
                        ArrayList arrayList8 = new ArrayList(x61.n.F(S5, 10));
                        int size4 = S5.size();
                        int i15 = 0;
                        while (i15 < size4) {
                            Object obj6 = S5.get(i15);
                            i15++;
                            z70.e eVar2 = ((u8) obj6).c;
                            l2 l2Var = eVar2.e;
                            String str22 = l2Var.b;
                            z70.j2 j2Var2 = l2Var.m;
                            String str23 = j2Var2.b;
                            ArrayList arrayList9 = S5;
                            String str24 = l2Var.n;
                            String str25 = l2Var.d;
                            int i16 = l2Var.f;
                            d3 d3Var = new d3(j2Var2.e.b, str23);
                            ZonedDateTime zonedDateTime = eVar2.b;
                            if (zonedDateTime == null) {
                                zonedDateTime = l2Var.g;
                            }
                            ZonedDateTime zonedDateTime2 = zonedDateTime;
                            PullRequestState Q = m7.y.Q(eVar2.c);
                            x61.rShadow rVar7 = l2Var.r.a;
                            if (rVar7 == null) {
                                rVar7 = rVar3;
                            }
                            ArrayList S6 = x61.m.S(rVar7);
                            ArrayList arrayList10 = new ArrayList(x61.n.F(S6, 10));
                            int size5 = S6.size();
                            int i17 = 0;
                            while (i17 < size5) {
                                Object obj7 = S6.get(i17);
                                i17++;
                                int i18 = size5;
                                k2 k2Var = ((g2) obj7).b.b;
                                arrayList10.add(k2Var != null ? y9.a.K(k2Var.b) : null);
                                size5 = i18;
                            }
                            StatusState statusState = (StatusState) x61.m.W(arrayList10);
                            if (statusState == null) {
                                statusState = StatusState.UNKNOWN__;
                            }
                            arrayList8.add(new a01.e(str22, str24, str25, i16, d3Var, str23, zonedDateTime2, Q, statusState));
                            S5 = arrayList9;
                        }
                        dVar = new a01.d(str4, str16, checkStatusState3, str17, str18, c, c2, fVar2, arrayList5, arrayList8);
                    }
                    if (dVar != null) {
                        l0Var.v = 1;
                        if (this.s.c(dVar, l0Var) == aVar) {
                            return aVar;
                        }
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
        l0Var = new l0(this, cVar);
        Object obj22 = l0Var.u;
        b71.a aVar4 = b71.a.r;
        i = l0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(a71.c cVar, Object obj) {
        m0 m0Var;
        int i;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i2 = m0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = m0Var.u;
                b71.a aVar = b71.a.r;
                i = m0Var.v;
                w61.a0 a0Var = w61.a0.a;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                    return a0Var;
                }
                sy.y.j(obj2);
                m0Var.v = 1;
                return this.s.c(a0Var, m0Var) == aVar ? aVar : a0Var;
            }
        }
        m0Var = new m0(this, cVar);
        Object obj22 = m0Var.u;
        b71.a aVar2 = b71.a.r;
        i = m0Var.v;
        w61.a0 a0Var2 = w61.a0.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object n(a71.c cVar, Object obj) {
        o0 o0Var;
        int i;
        b01.g d;
        u10.h hVar;
        u10.h hVar2;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i2 = o0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = o0Var.u;
                b71.a aVar = b71.a.r;
                i = o0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    u10.g gVar = ((u10.k) obj).a;
                    i80.c cVar2 = null;
                    c40.c cVar3 = (gVar == null || (hVar2 = gVar.a) == null) ? null : hVar2.d.j;
                    if (gVar != null && (hVar = gVar.a) != null) {
                        cVar2 = hVar.d.n;
                    }
                    i80.c cVar4 = cVar2;
                    if (cVar3 == null || cVar4 == null) {
                        throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Invalid server response.", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                    }
                    i50.h hVar3 = gVar.a.d;
                    d = sy.rShadow.d(cVar3, hVar3.c, cVar4, (r32 & 4) != 0 ? null : null, null, hVar3.d, hVar3.e, hVar3.f, (r32 & 128) != 0 ? false : false, (r32 & 256) != 0 ? null : null, false, x61.rShadow.r, hVar3.m, (r32 & 4096) != 0 ? false : false, (r32 & 8192) != 0 ? false : false, sy.rShadow.A(hVar3));
                    o0Var.v = 1;
                    if (this.s.c(d, o0Var) == aVar) {
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
        o0Var = new o0(this, cVar);
        Object obj22 = o0Var.u;
        b71.a aVar2 = b71.a.r;
        i = o0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(a71.c cVar, Object obj) {
        s0 s0Var;
        int i;
        s20.d dVar;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i2 = s0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = s0Var.u;
                b71.a aVar = b71.a.r;
                i = s0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    s20.a aVar2 = ((s20.c) obj).a;
                    b01.f c = (aVar2 == null || (dVar = aVar2.a) == null) ? null : sy.tShadow.c(dVar.c);
                    if (c != null) {
                        s0Var.v = 1;
                        if (this.s.c(c, s0Var) == aVar) {
                            return aVar;
                        }
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
        s0Var = new s0(this, cVar);
        Object obj22 = s0Var.u;
        b71.a aVar3 = b71.a.r;
        i = s0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object p(a71.c cVar, Object obj) {
        vb0.u0 u0Var;
        int i;
        g6 g6Var;
        if (cVar instanceof vb0.u0) {
            u0Var = (vb0.u0) cVar;
            int i2 = u0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = u0Var.u;
                b71.a aVar = b71.a.r;
                i = u0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    e6 e6Var = ((f6) obj).a;
                    e50.l0 l0Var = (e6Var == null || (g6Var = e6Var.a) == null) ? null : g6Var.c;
                    if (l0Var == null) {
                        throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Invalid server response.", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                    }
                    b01.b b = sy.tShadow.b(l0Var);
                    u0Var.v = 1;
                    if (this.s.c(b, u0Var) == aVar) {
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
        u0Var = new vb0.u0(this, cVar);
        Object obj22 = u0Var.u;
        b71.a aVar2 = b71.a.r;
        i = u0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x085e, code lost:
    
        if (r1.equals("ios_mobile_mission_control") == false) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0861, code lost:
    
        r6 = r1;
        r1 = r27;
        r9 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0874, code lost:
    
        if (r1.equals("pull_request_comment_non_copilot_pull_request") == false) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x08cf, code lost:
    
        if (r1.equals("ios_mobile_repo_profile") == false) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x091f, code lost:
    
        if (r6.equals("android_mobile_mission_control") == false) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x093a, code lost:
    
        if (r6.equals("fix_failed_workflow") == false) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0991, code lost:
    
        if (r6.equals("agents_page") == false) goto L539;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:436:0x07a1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:327:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0ac4  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0ad2  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0b21  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0cb5  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x0cc3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        Object str50 = null;
        s sVar;
        int i;
        u uVar;
        int i2;
        xn.xShadow xVar;
        r0 r0Var;
        xn.wShadow wVar;
        x xVar2;
        int i3;
        y yVar;
        int i4;
        String str;
        String str2;
        y3 o3Var;
        y3 y3Var;
        String str3;
        String str4;
        List list;
        String str5;
        long j;
        y3 q3Var;
        String str6;
        String str7;
        long j2;
        String str8;
        String str9;
        y3 s3Var;
        ArrayList arrayList;
        String str10;
        z zVar;
        int i5;
        vb0.b bVar;
        int i6;
        db0.a aVar;
        vb0.c cVar2;
        int i7;
        ArrayList arrayList2;
        i30.b bVar2;
        i30.i iVar;
        i30.a aVar2;
        ly lyVar;
        vb0.m mVar;
        int i8;
        o6 i9;
        u10.b bVar3;
        u10.e eVar;
        vb0.o oVar;
        int i11;
        vb0.p pVar;
        int i12;
        f01.g gVar;
        DiffLineType diffLineType;
        String str11;
        boolean z;
        boolean z2;
        boolean z3;
        b7 b7Var;
        List list2;
        z6 z6Var;
        List list3;
        z6 z6Var2;
        vb0.q qVar;
        int i13;
        vb0.s sVar2;
        int i14;
        vb0.tShadow tVar;
        int i15;
        vb0.w wVar2;
        int i16;
        gk gkVar;
        vb0.z zVar2;
        int i17;
        uw uwVar;
        k0 k0Var;
        int i18;
        vb0.w0 w0Var;
        int i19;
        ya yaVar;
        switch (this.r) {
            case 0:
                if (cVar instanceof s) {
                    sVar = (s) cVar;
                    int i21 = sVar.v;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        sVar.v = i21 - Integer.MIN_VALUE;
                        Object obj2 = sVar.u;
                        b71.a aVar3 = b71.a.r;
                        i = sVar.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            ChatThreadsResponse chatThreadsResponse = (ChatThreadsResponse) obj;
                            k71.k.g(chatThreadsResponse, "<this>");
                            List list4 = chatThreadsResponse.a;
                            ArrayList arrayList3 = new ArrayList(x61.n.F(list4, 10));
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(t.q.b((ChatThreadResponse) it.next(), x61.rShadow.r));
                            }
                            sVar.v = 1;
                            if (this.s.c(arrayList3, sVar) == aVar3) {
                                return aVar3;
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
                sVar = new s(this, cVar);
                Object obj22 = sVar.u;
                b71.a aVar32 = b71.a.r;
                i = sVar.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof u) {
                    uVar = (u) cVar;
                    int i22 = uVar.v;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        uVar.v = i22 - Integer.MIN_VALUE;
                        Object obj3 = uVar.u;
                        b71.a aVar4 = b71.a.r;
                        i2 = uVar.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            w61.k kVar = (w61.k) obj;
                            com.github.service.dotcom.models.response.copilot.serialization.c cVar3 = (com.github.service.dotcom.models.response.copilot.serialization.c) kVar.r;
                            f3 f3Var = (f3) kVar.s;
                            k71.k.g(cVar3, "<this>");
                            if (cVar3 instanceof ChatServerSentEventDataResponse$Complete) {
                                ChatServerSentEventDataResponse$Complete chatServerSentEventDataResponse$Complete = (ChatServerSentEventDataResponse$Complete) cVar3;
                                String str12 = chatServerSentEventDataResponse$Complete.b;
                                String str13 = chatServerSentEventDataResponse$Complete.c;
                                ZonedDateTime g = sy.f0.g(chatServerSentEventDataResponse$Complete.f);
                                String str14 = chatServerSentEventDataResponse$Complete.d;
                                hz.i iVar2 = chatServerSentEventDataResponse$Complete.a;
                                k71.k.g(iVar2, "<this>");
                                switch (iVar2.ordinal()) {
                                    case 0:
                                    case 6:
                                        wVar = xn.wShadow.w;
                                        break;
                                    case 1:
                                        wVar = xn.wShadow.t;
                                        break;
                                    case 2:
                                        wVar = xn.wShadow.s;
                                        break;
                                    case 3:
                                        wVar = xn.wShadow.s;
                                        break;
                                    case 4:
                                        wVar = xn.wShadow.u;
                                        break;
                                    case 5:
                                        wVar = xn.wShadow.v;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                xVar = new xn.xShadow(str12, str13, str14, g, sy.f0.c(chatServerSentEventDataResponse$Complete.g), t.e.d(chatServerSentEventDataResponse$Complete.e), (List) null, (List) null, (ArrayList) null, wVar, (r0) null, (xn.f0) null, f3Var, 7616);
                            } else if (cVar3 instanceof ChatServerSentEventDataResponse$Content) {
                                xVar = new xn.xShadow((String) null, (String) null, ((ChatServerSentEventDataResponse$Content) cVar3).b, (ZonedDateTime) null, (ArrayList) null, (xn.a0Shadow) null, (List) null, (List) null, (ArrayList) null, xn.wShadow.s, (r0) null, (xn.f0) null, f3Var, 7675);
                            } else if (cVar3 instanceof ChatServerSentEventDataResponse$AgentConfirmation) {
                                xVar = new xn.xShadow((String) null, (String) null, (String) null, (ZonedDateTime) null, (ArrayList) null, (xn.a0Shadow) null, sy.d0Shadow.n(t.e.e((ChatServerSentEventDataResponse$AgentConfirmation) cVar3)), (List) null, (ArrayList) null, (xn.wShadow) null, (r0) null, (xn.f0) null, f3Var, 8127);
                            } else if (cVar3 instanceof ChatServerSentEventDataResponse$Debug) {
                                xVar = new xn.xShadow((String) null, (String) null, ((ChatServerSentEventDataResponse$Debug) cVar3).b, (ZonedDateTime) null, (ArrayList) null, (xn.a0Shadow) null, (List) null, (List) null, (ArrayList) null, xn.wShadow.w, (r0) null, (xn.f0) null, f3Var, 7675);
                            } else if (cVar3 instanceof ChatServerSentEventDataResponse$Error) {
                                String uuid = UUID.randomUUID().toString();
                                k71.k.f(uuid, "toString(...)");
                                ChatServerSentEventDataResponse$Error chatServerSentEventDataResponse$Error = (ChatServerSentEventDataResponse$Error) cVar3;
                                hz.j jVar = chatServerSentEventDataResponse$Error.b;
                                k71.k.g(jVar, "<this>");
                                int ordinal = jVar.ordinal();
                                if (ordinal == 0) {
                                    r0Var = r0.r;
                                } else if (ordinal == 1) {
                                    r0Var = r0.s;
                                } else {
                                    if (ordinal != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    r0Var = r0.t;
                                }
                                xVar = new xn.xShadow(uuid, (String) null, (String) null, (ZonedDateTime) null, (ArrayList) null, (xn.a0Shadow) null, (List) null, (List) null, (ArrayList) null, xn.wShadow.v, r0Var, new xn.f0(chatServerSentEventDataResponse$Error.c), f3Var, 4606);
                            } else if (cVar3 instanceof ChatServerSentEventDataResponse$FunctionCall) {
                                xVar = new xn.xShadow((String) null, (String) null, (String) null, (ZonedDateTime) null, (ArrayList) null, (xn.a0Shadow) null, (List) null, sy.d0Shadow.n(t.e.f((ChatServerSentEventDataResponse$FunctionCall) cVar3)), (ArrayList) null, xn.wShadow.s, (r0) null, (xn.f0) null, f3Var, 7551);
                            } else {
                                if (!(cVar3 instanceof ChatServerSentEventDataResponse$Unknown)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                xVar = new xn.xShadow((String) null, (String) null, (String) null, (ZonedDateTime) null, (ArrayList) null, (xn.a0Shadow) null, (List) null, (List) null, (ArrayList) null, xn.wShadow.w, (r0) null, (xn.f0) null, f3Var, 7679);
                            }
                            uVar.v = 1;
                            if (this.s.c(xVar, uVar) == aVar4) {
                                return aVar4;
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
                uVar = new u(this, cVar);
                Object obj32 = uVar.u;
                b71.a aVar42 = b71.a.r;
                i2 = uVar.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof x) {
                    xVar2 = (x) cVar;
                    int i23 = xVar2.v;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        xVar2.v = i23 - Integer.MIN_VALUE;
                        Object obj4 = xVar2.u;
                        b71.a aVar5 = b71.a.r;
                        i3 = xVar2.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            CreateAgentTaskPullsResponse createAgentTaskPullsResponse = (CreateAgentTaskPullsResponse) obj;
                            k71.k.g(createAgentTaskPullsResponse, "<this>");
                            xn.d dVar = new xn.d(createAgentTaskPullsResponse.b);
                            xVar2.v = 1;
                            if (this.s.c(dVar, xVar2) == aVar5) {
                                return aVar5;
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
                xVar2 = new x(this, cVar);
                Object obj42 = xVar2.u;
                b71.a aVar52 = b71.a.r;
                i3 = xVar2.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof y) {
                    yVar = (y) cVar;
                    int i24 = yVar.v;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        yVar.v = i24 - Integer.MIN_VALUE;
                        Object obj5 = yVar.u;
                        b71.a aVar6 = b71.a.r;
                        i4 = yVar.v;
                        if (i4 != 0) {
                            sy.y.j(obj5);
                            AgentTaskResponse agentTaskResponse = (AgentTaskResponse) obj;
                            String str15 = "<this>";
                            k71.k.g(agentTaskResponse, "<this>");
                            String str16 = agentTaskResponse.a;
                            String str17 = agentTaskResponse.b;
                            xn.e eVar2 = agentTaskResponse.c;
                            String str18 = agentTaskResponse.d;
                            String str19 = agentTaskResponse.e;
                            String str20 = agentTaskResponse.f;
                            long j3 = agentTaskResponse.g;
                            long j4 = agentTaskResponse.h;
                            long j5 = agentTaskResponse.i;
                            int i25 = agentTaskResponse.j;
                            ArrayList arrayList4 = new ArrayList(x61.n.F(agentTaskResponse.k, 10));
                            for (Iterator it2 = r5.iterator(); it2.hasNext(); it2 = it2) {
                                AgentTaskCollaboratorResponse agentTaskCollaboratorResponse = (AgentTaskCollaboratorResponse) it2.next();
                                k71.k.g(agentTaskCollaboratorResponse, "<this>");
                                arrayList4.add(new xn.c(agentTaskCollaboratorResponse.a, agentTaskCollaboratorResponse.b, agentTaskCollaboratorResponse.c, agentTaskCollaboratorResponse.d));
                            }
                            List list5 = agentTaskResponse.l;
                            ArrayList arrayList5 = new ArrayList(x61.n.F(list5, 10));
                            Iterator it3 = list5.iterator();
                            while (it3.hasNext()) {
                                AgentTaskArtifactResponse agentTaskArtifactResponse = (AgentTaskArtifactResponse) it3.next();
                                k71.k.g(agentTaskArtifactResponse, "<this>");
                                Iterator it4 = it3;
                                String str21 = agentTaskArtifactResponse.b;
                                String str22 = str16;
                                String str23 = agentTaskArtifactResponse.c;
                                AgentTaskArtifactDataResponse agentTaskArtifactDataResponse = agentTaskArtifactResponse.a;
                                k71.k.g(agentTaskArtifactDataResponse, "<this>");
                                arrayList5.add(new xn.a(str21, str23, new xn.b(agentTaskArtifactDataResponse.a, agentTaskArtifactDataResponse.b, agentTaskArtifactDataResponse.c, agentTaskArtifactDataResponse.d, agentTaskArtifactDataResponse.e)));
                                it3 = it4;
                                str16 = str22;
                                str17 = str17;
                            }
                            x0 x0Var = new x0(str16, str17, eVar2, str18, str19, str20, j3, j4, j5, i25, arrayList4, arrayList5, agentTaskResponse.m, agentTaskResponse.n);
                            List list6 = agentTaskResponse.o;
                            ArrayList arrayList6 = new ArrayList(x61.n.F(list6, 10));
                            Iterator it5 = list6.iterator();
                            while (it5.hasNext()) {
                                AgentTaskSessionResponse agentTaskSessionResponse = (AgentTaskSessionResponse) it5.next();
                                k71.k.g(agentTaskSessionResponse, str15);
                                String str24 = agentTaskSessionResponse.a;
                                String str25 = agentTaskSessionResponse.b;
                                String str26 = agentTaskSessionResponse.h;
                                xn.e eVar3 = agentTaskSessionResponse.i;
                                Instant instant = sy.f0.g(agentTaskSessionResponse.j).toInstant();
                                k71.k.f(instant, "toInstant(...)");
                                String str27 = agentTaskSessionResponse.k;
                                String str28 = agentTaskSessionResponse.l;
                                Instant instant2 = str28 != null ? sy.f0.g(str28).toInstant() : null;
                                String str29 = agentTaskSessionResponse.o;
                                String str30 = agentTaskSessionResponse.v;
                                String str31 = agentTaskSessionResponse.w;
                                Iterator it6 = it5;
                                String str32 = agentTaskSessionResponse.y;
                                AgentTaskSessionErrorResponse agentTaskSessionErrorResponse = agentTaskSessionResponse.A;
                                if (agentTaskSessionErrorResponse == null || (str10 = agentTaskSessionErrorResponse.a) == null) {
                                    str = null;
                                } else {
                                    if (str10.length() == 0) {
                                        str10 = null;
                                    }
                                    str = str10;
                                }
                                String str33 = agentTaskSessionResponse.t;
                                String str34 = str15;
                                long j6 = agentTaskSessionResponse.r;
                                Long valueOf = j6 != 0 ? Long.valueOf(j6) : null;
                                int i26 = agentTaskSessionResponse.s;
                                l3 l3Var = new l3(str33, valueOf, i26 != 0 ? Integer.valueOf(i26) : null, agentTaskSessionResponse.u, agentTaskSessionResponse.q);
                                long j7 = agentTaskSessionResponse.c;
                                String str35 = agentTaskSessionResponse.m;
                                String str36 = agentTaskSessionResponse.n;
                                String str37 = agentTaskSessionResponse.o;
                                List list7 = agentTaskSessionResponse.p;
                                k71.k.g(str35, "eventType");
                                k71.k.g(str36, "eventUrl");
                                k71.k.g(str37, "eventContent");
                                k71.k.g(list7, "eventIdentifiers");
                                Long e = sy.oShadow.e("issue", list7);
                                Long e2 = sy.oShadow.e("issue_id", list7);
                                if (e == null && e2 == null) {
                                    Long e3 = sy.oShadow.e("alert", list7);
                                    Long e4 = sy.oShadow.e("alert_id", list7);
                                    if (e3 == null && e4 == null) {
                                        switch (str35.hashCode()) {
                                            case -1783613603:
                                                str4 = str37;
                                                list = list7;
                                                str5 = str35;
                                                j = j7;
                                                if (str5.equals("linear_webhook")) {
                                                    q3Var = new q3(j, str5, str4, t71.p.T(str36) ? null : str36);
                                                    y3Var = q3Var;
                                                    break;
                                                }
                                                arrayList = new ArrayList();
                                                for (Object obj6 : list) {
                                                    long j8 = j;
                                                    if (!t71.p.T((String) obj6)) {
                                                        arrayList.add(obj6);
                                                    }
                                                    j = j8;
                                                }
                                                long j9 = j;
                                                if (!arrayList.isEmpty()) {
                                                    s3Var = new w3(j9, str5, str4);
                                                    y3Var = s3Var;
                                                    break;
                                                } else {
                                                    q3Var = new v3(j9, str5, str4, arrayList);
                                                    y3Var = q3Var;
                                                }
                                            case -1745578464:
                                                str4 = str37;
                                                list = list7;
                                                str5 = str35;
                                                j = j7;
                                                break;
                                            case -1584697929:
                                                str6 = str36;
                                                str7 = str37;
                                                list = list7;
                                                j2 = j7;
                                                if (!str35.equals("pull_request_review_non_copilot_pull_request")) {
                                                    str5 = str35;
                                                    j = j2;
                                                    str4 = str7;
                                                    arrayList = new ArrayList();
                                                    while (r21.hasNext()) {
                                                    }
                                                    long j92 = j;
                                                    if (!arrayList.isEmpty()) {
                                                    }
                                                }
                                                q3Var = new u3(j2, str35, str7, !t71.p.T(str6) ? null : str6, sy.oShadow.g(list));
                                                y3Var = q3Var;
                                                break;
                                            case -1106575017:
                                                str8 = str36;
                                                str4 = str37;
                                                list = list7;
                                                str5 = str35;
                                                j = j7;
                                                break;
                                            case -910458915:
                                                str4 = str37;
                                                list = list7;
                                                str5 = str35;
                                                j = j7;
                                                break;
                                            case -569640967:
                                                str7 = str37;
                                                j2 = j7;
                                                if (str35.equals("merge_conflict")) {
                                                    q3Var = new r3(j2, str35, str7, t71.p.T(str36) ? null : str36, sy.oShadow.g(list7));
                                                    y3Var = q3Var;
                                                    break;
                                                }
                                                str5 = str35;
                                                list = list7;
                                                j = j2;
                                                str4 = str7;
                                                arrayList = new ArrayList();
                                                while (r21.hasNext()) {
                                                }
                                                long j922 = j;
                                                if (!arrayList.isEmpty()) {
                                                }
                                                break;
                                            case -485264143:
                                                str8 = str36;
                                                str7 = str37;
                                                j2 = j7;
                                                if (str35.equals("workflow_run_failed")) {
                                                    str5 = str35;
                                                    list = list7;
                                                    j = j2;
                                                    str4 = str7;
                                                    q3Var = new x3(j, str5, str4, t71.p.T(str8) ? null : str8, sy.oShadow.g(list));
                                                    y3Var = q3Var;
                                                    break;
                                                }
                                                str5 = str35;
                                                list = list7;
                                                j = j2;
                                                str4 = str7;
                                                arrayList = new ArrayList();
                                                while (r21.hasNext()) {
                                                }
                                                long j9222 = j;
                                                if (!arrayList.isEmpty()) {
                                                }
                                                break;
                                            case -374143193:
                                                str7 = str37;
                                                j2 = j7;
                                                break;
                                            case -334046968:
                                                str7 = str37;
                                                j2 = j7;
                                                if (str35.equals("jira_issue")) {
                                                    q3Var = new p3(j2, str35, str7, t71.p.T(str36) ? null : str36);
                                                    y3Var = q3Var;
                                                    break;
                                                }
                                                str5 = str35;
                                                list = list7;
                                                j = j2;
                                                str4 = str7;
                                                arrayList = new ArrayList();
                                                while (r21.hasNext()) {
                                                }
                                                long j92222 = j;
                                                if (!arrayList.isEmpty()) {
                                                }
                                                break;
                                            case -222650302:
                                                str6 = str36;
                                                str7 = str37;
                                                j2 = j7;
                                                if (str35.equals("pull_request_review")) {
                                                    list = list7;
                                                    q3Var = new u3(j2, str35, str7, !t71.p.T(str6) ? null : str6, sy.oShadow.g(list));
                                                    y3Var = q3Var;
                                                    break;
                                                }
                                                str5 = str35;
                                                list = list7;
                                                j = j2;
                                                str4 = str7;
                                                arrayList = new ArrayList();
                                                while (r21.hasNext()) {
                                                }
                                                long j922222 = j;
                                                if (!arrayList.isEmpty()) {
                                                }
                                                break;
                                            case -122338652:
                                                str9 = str36;
                                                str7 = str37;
                                                j2 = j7;
                                                break;
                                            case 39529599:
                                                str7 = str37;
                                                j2 = j7;
                                                break;
                                            case 381295353:
                                                str7 = str37;
                                                j2 = j7;
                                                if (str35.equals("code_scanning_alerts_assignment")) {
                                                    String str38 = t71.p.T(str36) ? null : str36;
                                                    ArrayList arrayList7 = new ArrayList();
                                                    Iterator it7 = list7.iterator();
                                                    while (it7.hasNext()) {
                                                        Long H = t71.w.H((String) it7.next());
                                                        if (H != null) {
                                                            arrayList7.add(H);
                                                        }
                                                    }
                                                    q3Var = new n3(j2, str35, str7, str38, arrayList7);
                                                    y3Var = q3Var;
                                                    break;
                                                }
                                                str5 = str35;
                                                list = list7;
                                                j = j2;
                                                str4 = str7;
                                                arrayList = new ArrayList();
                                                while (r21.hasNext()) {
                                                }
                                                long j9222222 = j;
                                                if (!arrayList.isEmpty()) {
                                                }
                                                break;
                                            case 431351170:
                                                if (str35.equals("issue_created")) {
                                                    o3Var = new o3(j7, str35, str37, "an issue", t71.p.T(str36) ? null : str36, str36, null, sy.oShadow.g(list7));
                                                    break;
                                                }
                                                str4 = str37;
                                                list = list7;
                                                str5 = str35;
                                                j = j7;
                                                arrayList = new ArrayList();
                                                while (r21.hasNext()) {
                                                }
                                                long j92222222 = j;
                                                if (!arrayList.isEmpty()) {
                                                }
                                                break;
                                            case 560767113:
                                                if (str35.equals("android_mobile_repo_profile")) {
                                                    str4 = str37;
                                                    str5 = str35;
                                                    j = j7;
                                                    s3Var = new s3(j, str5, str4);
                                                    y3Var = s3Var;
                                                    break;
                                                }
                                                str4 = str37;
                                                list = list7;
                                                str5 = str35;
                                                j = j7;
                                                arrayList = new ArrayList();
                                                while (r21.hasNext()) {
                                                }
                                                long j922222222 = j;
                                                if (!arrayList.isEmpty()) {
                                                }
                                                break;
                                            case 1538220725:
                                                if (str35.equals("pull_request_comment")) {
                                                    str9 = str36;
                                                    str7 = str37;
                                                    j2 = j7;
                                                    q3Var = new t3(j2, str35, str7, t71.p.T(str9) ? null : str9, sy.oShadow.g(list7));
                                                    y3Var = q3Var;
                                                    break;
                                                }
                                                str4 = str37;
                                                list = list7;
                                                str5 = str35;
                                                j = j7;
                                                arrayList = new ArrayList();
                                                while (r21.hasNext()) {
                                                }
                                                long j9222222222 = j;
                                                if (!arrayList.isEmpty()) {
                                                }
                                                break;
                                            case 1721649299:
                                                if (str35.equals("agents_panel")) {
                                                    str4 = str37;
                                                    str5 = str35;
                                                    j = j7;
                                                    s3Var = new w3(j, str5, str4);
                                                    y3Var = s3Var;
                                                    break;
                                                }
                                                str4 = str37;
                                                list = list7;
                                                str5 = str35;
                                                j = j7;
                                                arrayList = new ArrayList();
                                                while (r21.hasNext()) {
                                                }
                                                long j92222222222 = j;
                                                if (!arrayList.isEmpty()) {
                                                }
                                                break;
                                            default:
                                                str4 = str37;
                                                list = list7;
                                                str5 = str35;
                                                j = j7;
                                                arrayList = new ArrayList();
                                                while (r21.hasNext()) {
                                                }
                                                long j922222222222 = j;
                                                if (!arrayList.isEmpty()) {
                                                }
                                                break;
                                        }
                                        arrayList6.add(new a1(str24, str25, str26, eVar3, instant, str27, instant2, str29, str30, str31, str32, str, l3Var, y3Var, agentTaskSessionResponse.z, agentTaskSessionResponse.p));
                                        it5 = it6;
                                        str15 = str34;
                                    } else {
                                        if (e3 == null || (str3 = h1.m("alert #", e3.longValue())) == null) {
                                            str3 = "an alert";
                                        }
                                        o3Var = new m3(j7, str35, str37, str3, t71.p.T(str36) ? null : str36, str36, e3, e4);
                                    }
                                } else {
                                    if (e == null || (str2 = h1.m("issue #", e.longValue())) == null) {
                                        str2 = "an issue";
                                    }
                                    o3Var = new o3(j7, str35, str37, str2, t71.p.T(str36) ? null : str36, str36, e, e2);
                                }
                                y3Var = o3Var;
                                arrayList6.add(new a1(str24, str25, str26, eVar3, instant, str27, instant2, str29, str30, str31, str32, str, l3Var, y3Var, agentTaskSessionResponse.z, agentTaskSessionResponse.p));
                                it5 = it6;
                                str15 = str34;
                            }
                            y0 y0Var = new y0(x0Var, arrayList6);
                            yVar.v = 1;
                            if (this.s.c(y0Var, yVar) == aVar6) {
                                return aVar6;
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
                yVar = new y(this, cVar);
                Object obj52 = yVar.u;
                b71.a aVar62 = b71.a.r;
                i4 = yVar.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof z) {
                    zVar = (z) cVar;
                    int i27 = zVar.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        zVar.v = i27 - Integer.MIN_VALUE;
                        Object obj7 = zVar.u;
                        b71.a aVar7 = b71.a.r;
                        i5 = zVar.v;
                        if (i5 != 0) {
                            sy.y.j(obj7);
                            String str39 = ((AgentTaskSessionResponse) obj).h;
                            zVar.v = 1;
                            if (this.s.c(str39, zVar) == aVar7) {
                                return aVar7;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj7);
                        }
                        return w61.a0.a;
                    }
                }
                zVar = new z(this, cVar);
                Object obj72 = zVar.u;
                b71.a aVar72 = b71.a.r;
                i5 = zVar.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof vb0.b) {
                    bVar = (vb0.b) cVar;
                    int i28 = bVar.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        bVar.v = i28 - Integer.MIN_VALUE;
                        Object obj8 = bVar.u;
                        b71.a aVar8 = b71.a.r;
                        i6 = bVar.v;
                        if (i6 != 0) {
                            sy.y.j(obj8);
                            v20.f fVar = ((v20.c) obj).a;
                            if (fVar != null) {
                                int i29 = fVar.b;
                                v20.a aVar9 = fVar.c;
                                x61.rShadow rVar = aVar9.c;
                                if (rVar == null) {
                                    rVar = x61.rShadow.r;
                                }
                                ArrayList S = x61.m.S(rVar);
                                ArrayList arrayList8 = new ArrayList(x61.n.F(S, 10));
                                int size = S.size();
                                int i31 = 0;
                                while (i31 < size) {
                                    Object obj9 = S.get(i31);
                                    i31++;
                                    v20.d dVar2 = (v20.d) obj9;
                                    k71.k.g(dVar2, "<this>");
                                    c1 c1Var = dVar2.c;
                                    String str40 = c1Var.d;
                                    Avatar q = t.q.q(c1Var.g);
                                    String str41 = c1Var.b;
                                    String str42 = c1Var.c;
                                    if (str42 == null) {
                                        str42 = "";
                                    }
                                    arrayList8.add(new b2(str40, q, str41, str42, false, false, 112));
                                }
                                v20.e eVar4 = aVar9.a;
                                aVar = new db0.a(i29, arrayList8, new x01.i(eVar4.b, eVar4.a, false));
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                bVar.v = 1;
                                if (this.s.c(aVar, bVar) == aVar8) {
                                    return aVar8;
                                }
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj8);
                        }
                        return w61.a0.a;
                    }
                }
                bVar = new vb0.b(this, cVar);
                Object obj82 = bVar.u;
                b71.a aVar82 = b71.a.r;
                i6 = bVar.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof vb0.c) {
                    cVar2 = (vb0.c) cVar;
                    int i32 = cVar2.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        cVar2.v = i32 - Integer.MIN_VALUE;
                        Object obj10 = cVar2.u;
                        b71.a aVar10 = b71.a.r;
                        i7 = cVar2.v;
                        if (i7 != 0) {
                            sy.y.j(obj10);
                            oy oyVar = ((ny) obj).a;
                            i30.c cVar4 = (oyVar == null || (lyVar = oyVar.a) == null) ? null : lyVar.b;
                            if (cVar4 != null && (aVar2 = cVar4.b) != null) {
                                iVar = aVar2.c;
                            } else if (cVar4 == null || (bVar2 = cVar4.c) == null) {
                                arrayList2 = x61.rShadow.r;
                                cVar2.v = 1;
                                if (this.s.c(arrayList2, cVar2) == aVar10) {
                                    return aVar10;
                                }
                            } else {
                                iVar = bVar2.c;
                            }
                            arrayList2 = sy.f0.b(iVar);
                            cVar2.v = 1;
                            if (this.s.c(arrayList2, cVar2) == aVar10) {
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj10);
                        }
                        return w61.a0.a;
                    }
                }
                cVar2 = new vb0.c(this, cVar);
                Object obj102 = cVar2.u;
                b71.a aVar102 = b71.a.r;
                i7 = cVar2.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof vb0.m) {
                    mVar = (vb0.m) cVar;
                    int i33 = mVar.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        mVar.v = i33 - Integer.MIN_VALUE;
                        Object obj11 = mVar.u;
                        b71.a aVar11 = b71.a.r;
                        i8 = mVar.v;
                        if (i8 != 0) {
                            sy.y.j(obj11);
                            u10.a aVar12 = ((u10.d) obj).a;
                            y50.a aVar13 = (aVar12 == null || (bVar3 = aVar12.a) == null || (eVar = bVar3.a) == null) ? null : eVar.c;
                            if (aVar13 == null) {
                                yz0.s.Companion.getClass();
                                yz0.q qVar2 = yz0.r.b;
                                x2.Companion.getClass();
                                i9 = new o6(qVar2);
                            } else {
                                i9 = t.a0.i(aVar13);
                            }
                            mVar.v = 1;
                            if (this.s.c(i9, mVar) == aVar11) {
                                return aVar11;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                        }
                        return w61.a0.a;
                    }
                }
                mVar = new vb0.m(this, cVar);
                Object obj112 = mVar.u;
                b71.a aVar112 = b71.a.r;
                i8 = mVar.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof vb0.o) {
                    oVar = (vb0.o) cVar;
                    int i34 = oVar.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        oVar.v = i34 - Integer.MIN_VALUE;
                        Object obj12 = oVar.u;
                        b71.a aVar14 = b71.a.r;
                        i11 = oVar.v;
                        if (i11 != 0) {
                            sy.y.j(obj12);
                            u10.o0 o0Var = ((u10.r0) obj).a;
                            u10.u0 u0Var = o0Var != null ? o0Var.a : null;
                            if (u0Var != null) {
                                oVar.v = 1;
                                if (this.s.c(u0Var, oVar) == aVar14) {
                                    return aVar14;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj12);
                        }
                        return w61.a0.a;
                    }
                }
                oVar = new vb0.o(this, cVar);
                Object obj122 = oVar.u;
                b71.a aVar142 = b71.a.r;
                i11 = oVar.v;
                if (i11 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof vb0.p) {
                    pVar = (vb0.p) cVar;
                    int i35 = pVar.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        pVar.v = i35 - Integer.MIN_VALUE;
                        Object obj13 = pVar.u;
                        b71.a aVar15 = b71.a.r;
                        i12 = pVar.v;
                        if (i12 != 0) {
                            sy.y.j(obj13);
                            u10.u0 u0Var2 = (u10.u0) obj;
                            t0 t0Var = u0Var2.b;
                            List list8 = u0Var2.c.a;
                            u10.s0 s0Var = list8 != null ? (u10.s0) x61.m.W(list8) : null;
                            if (s0Var != null) {
                                d7 d7Var = s0Var.c;
                                c7 c7Var = d7Var.f;
                                c40.c cVar5 = d7Var.j;
                                z70.a7 a7Var = d7Var.e;
                                String str43 = a7Var != null ? a7Var.a : null;
                                String str44 = c7Var != null ? c7Var.b : "";
                                i80.c cVar6 = d7Var.k;
                                String str45 = str44;
                                y60.a aVar16 = d7Var.n;
                                String str46 = d7Var.g;
                                PullRequestReviewCommentState M = k21.f.M(d7Var.h);
                                String I = (c7Var == null || (list3 = c7Var.g) == null || (z6Var2 = (z6) x61.m.f0(list3)) == null) ? null : d7Var.c == null ? null : t.a0.I(z6Var2.b);
                                String str47 = d7Var.i;
                                boolean z4 = d7Var.l.b;
                                if (c7Var == null || (list2 = c7Var.g) == null || (z6Var = (z6) x61.m.f0(list2)) == null || (diffLineType = z3.S(z6Var.b.a)) == null) {
                                    diffLineType = DiffLineType.UNKNOWN__;
                                }
                                DiffLineType diffLineType2 = diffLineType;
                                g80.a aVar17 = c7Var != null ? c7Var.h : null;
                                String str48 = t0Var.b;
                                String str49 = t0Var.c;
                                if (c7Var != null) {
                                    str11 = str48;
                                    if (c7Var.c) {
                                        z = true;
                                        String str50 = (c7Var != null || (b7Var = c7Var.d) == null) ? "" : b7Var.a;
                                        if (c7Var == null) {
                                            z2 = true;
                                            if (c7Var.e) {
                                                z3 = true;
                                                gVar = t.a0.a(cVar5, str45, str43, cVar6, aVar16, str46, M, I, str47, z4, diffLineType2, aVar17, str11, str49, true, z, str50, z3, c7Var == null && c7Var.f == z2, (g70.a) null, t.a0.O(u0Var2.a));
                                            }
                                        } else {
                                            z2 = true;
                                        }
                                        z3 = false;
                                        gVar = t.a0.a(cVar5, str45, str43, cVar6, aVar16, str46, M, I, str47, z4, diffLineType2, aVar17, str11, str49, true, z, str50, z3, c7Var == null && c7Var.f == z2, (g70.a) null, t.a0.O(u0Var2.a));
                                    }
                                } else {
                                    str11 = str48;
                                }
                                z = false;
                                if (c7Var != null) {
                                }
                                if (c7Var == null) {
                                }
                                z3 = false;
                                gVar = t.a0.a(cVar5, str45, str43, cVar6, aVar16, str46, M, I, str47, z4, diffLineType2, aVar17, str11, str49, true, z, str50, z3, c7Var == null && c7Var.f == z2, (g70.a) null, t.a0.O(u0Var2.a));
                            } else {
                                gVar = null;
                            }
                            if (gVar != null) {
                                pVar.v = 1;
                                if (this.s.c(gVar, pVar) == aVar15) {
                                    return aVar15;
                                }
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj13);
                        }
                        return w61.a0.a;
                    }
                }
                pVar = new vb0.p(this, cVar);
                Object obj132 = pVar.u;
                b71.a aVar152 = b71.a.r;
                i12 = pVar.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof vb0.q) {
                    qVar = (vb0.q) cVar;
                    int i36 = qVar.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        qVar.v = i36 - Integer.MIN_VALUE;
                        Object obj14 = qVar.u;
                        b71.a aVar18 = b71.a.r;
                        i13 = qVar.v;
                        if (i13 != 0) {
                            sy.y.j(obj14);
                            Boolean bool = Boolean.TRUE;
                            qVar.v = 1;
                            if (this.s.c(bool, qVar) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj14);
                        }
                        return w61.a0.a;
                    }
                }
                qVar = new vb0.q(this, cVar);
                Object obj142 = qVar.u;
                b71.a aVar182 = b71.a.r;
                i13 = qVar.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof vb0.s) {
                    sVar2 = (vb0.s) cVar;
                    int i37 = sVar2.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        sVar2.v = i37 - Integer.MIN_VALUE;
                        Object obj15 = sVar2.u;
                        b71.a aVar19 = b71.a.r;
                        i14 = sVar2.v;
                        w61.a0 a0Var = w61.a0.a;
                        if (i14 != 0) {
                            sy.y.j(obj15);
                            sVar2.v = 1;
                            if (this.s.c(a0Var, sVar2) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj15);
                        }
                        return a0Var;
                    }
                }
                sVar2 = new vb0.s(this, cVar);
                Object obj152 = sVar2.u;
                b71.a aVar192 = b71.a.r;
                i14 = sVar2.v;
                w61.a0 a0Var2 = w61.a0.a;
                if (i14 != 0) {
                }
                return a0Var2;
            case 12:
                if (cVar instanceof vb0.tShadow) {
                    tVar = (vb0.tShadow) cVar;
                    int i38 = tVar.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        tVar.v = i38 - Integer.MIN_VALUE;
                        Object obj16 = tVar.u;
                        b71.a aVar20 = b71.a.r;
                        i15 = tVar.v;
                        if (i15 != 0) {
                            sy.y.j(obj16);
                            Boolean bool2 = Boolean.TRUE;
                            tVar.v = 1;
                            if (this.s.c(bool2, tVar) == aVar20) {
                                return aVar20;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj16);
                        }
                        return w61.a0.a;
                    }
                }
                tVar = new vb0.tShadow(this, cVar);
                Object obj162 = tVar.u;
                b71.a aVar202 = b71.a.r;
                i15 = tVar.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof vb0.w) {
                    wVar2 = (vb0.w) cVar;
                    int i39 = wVar2.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        wVar2.v = i39 - Integer.MIN_VALUE;
                        Object obj17 = wVar2.u;
                        b71.a aVar21 = b71.a.r;
                        i16 = wVar2.v;
                        if (i16 != 0) {
                            sy.y.j(obj17);
                            fk fkVar = ((ek) obj).a;
                            x2 d = (fkVar == null || (gkVar = fkVar.a) == null) ? null : sy.tShadow.d(gkVar.c);
                            if (d != null) {
                                wVar2.v = 1;
                                if (this.s.c(d, wVar2) == aVar21) {
                                    return aVar21;
                                }
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj17);
                        }
                        return w61.a0.a;
                    }
                }
                wVar2 = new vb0.w(this, cVar);
                Object obj172 = wVar2.u;
                b71.a aVar212 = b71.a.r;
                i16 = wVar2.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof vb0.z) {
                    zVar2 = (vb0.z) cVar;
                    int i41 = zVar2.v;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        zVar2.v = i41 - Integer.MIN_VALUE;
                        Object obj18 = zVar2.u;
                        b71.a aVar22 = b71.a.r;
                        i17 = zVar2.v;
                        if (i17 != 0) {
                            sy.y.j(obj18);
                            tw twVar = ((sw) obj).a;
                            if (twVar == null || (uwVar = twVar.a) == null) {
                                throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "resolveReviewThread field null", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                            }
                            g4 f = sy.f0.f(uwVar.c);
                            zVar2.v = 1;
                            if (this.s.c(f, zVar2) == aVar22) {
                                return aVar22;
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj18);
                        }
                        return w61.a0.a;
                    }
                }
                zVar2 = new vb0.z(this, cVar);
                Object obj182 = zVar2.u;
                b71.a aVar222 = b71.a.r;
                i17 = zVar2.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 15:
                return a(cVar, obj);
            case 16:
                return b(cVar, obj);
            case 17:
                return d(cVar, obj);
            case 18:
                return e(cVar, obj);
            case 19:
                return f(cVar, obj);
            case 20:
                return g(cVar, obj);
            case 21:
                return h(cVar, obj);
            case 22:
                return i(cVar, obj);
            case 23:
                if (cVar instanceof k0) {
                    k0Var = (k0) cVar;
                    int i42 = k0Var.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        k0Var.v = i42 - Integer.MIN_VALUE;
                        Object obj19 = k0Var.u;
                        b71.a aVar23 = b71.a.r;
                        i18 = k0Var.v;
                        w61.a0 a0Var3 = w61.a0.a;
                        if (i18 != 0) {
                            sy.y.j(obj19);
                            k0Var.v = 1;
                            if (this.s.c(a0Var3, k0Var) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj19);
                        }
                        return a0Var3;
                    }
                }
                k0Var = new k0(this, cVar);
                Object obj192 = k0Var.u;
                b71.a aVar232 = b71.a.r;
                i18 = k0Var.v;
                w61.a0 a0Var32 = w61.a0.a;
                if (i18 != 0) {
                }
                return a0Var32;
            case 24:
                return j(cVar, obj);
            case 25:
                return k(cVar, obj);
            case 26:
                return n(cVar, obj);
            case 27:
                return o(cVar, obj);
            case 28:
                return p(cVar, obj);
            default:
                if (cVar instanceof vb0.w0) {
                    w0Var = (vb0.w0) cVar;
                    int i43 = w0Var.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        w0Var.v = i43 - Integer.MIN_VALUE;
                        Object obj20 = w0Var.u;
                        b71.a aVar24 = b71.a.r;
                        i19 = w0Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj20);
                            xa xaVar = ((wa) obj).a;
                            e50.l0 l0Var = (xaVar == null || (yaVar = xaVar.c) == null) ? null : yaVar.b;
                            if (l0Var == null) {
                                throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Invalid server response.", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                            }
                            b01.b b = sy.tShadow.b(l0Var);
                            w0Var.v = 1;
                            if (this.s.c(b, w0Var) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj20);
                        }
                        return w61.a0.a;
                    }
                }
                w0Var = new vb0.w0(this, cVar);
                Object obj202 = w0Var.u;
                b71.a aVar242 = b71.a.r;
                i19 = w0Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
        }
    }
}
