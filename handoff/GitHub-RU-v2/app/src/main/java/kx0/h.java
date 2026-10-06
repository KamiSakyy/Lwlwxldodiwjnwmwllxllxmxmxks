package kx0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.NotificationReasonState;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.type.IssueState;
import com.github.service.models.response.type.SubscriptionState;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.z3;
import java.time.ZonedDateTime;
import kotlin.NoWhenBranchMatchedException;
import m7.y;
import ox0.a0;
import ox0.b0;
import ox0.j0;
import ox0.k0;
import ox0.l0;
import ox0.m0;
import ox0.n;
import ox0.n0;
import ox0.o0;
import ox0.p;
import ox0.q;
import ox0.r;
import ox0.s;
import ox0.t;
import ox0.u;
import ox0.v;
import ox0.w;
import ox0.x;
import ox0.z;
import pz0.f40;
import pz0.gl;
import pz0.va;
import pz0.y2;
import yz0.a5;
import yz0.c3;
import yz0.c5;
import yz0.d3;
import yz0.e3;
import yz0.g3;
import yz0.h3;
import yz0.i3;
import yz0.m4;
import yz0.n4;
import yz0.o4;
import yz0.p4;
import yz0.q4;
import yz0.r4;
import yz0.s4;
import yz0.t4;
import yz0.u4;
import yz0.v4;
import yz0.w4;
import yz0.x4;
import yz0.y4;
import yz0.z2;
import yz0.z4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements z2 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public int g;
    public ZonedDateTime h;
    public c5 i;
    public boolean j;
    public boolean k;
    public i3 l;
    public boolean m;
    public SubscriptionState n;
    public SubscriptionState o;
    public o.b p;
    public NotificationReasonState q;

    /* JADX WARN: Removed duplicated region for block: B:131:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(ox0.f fVar) {
        c5 c5Var;
        boolean z;
        i3 i3Var;
        i3 c3Var;
        boolean z2;
        ox0.i iVar;
        o.b bVar;
        o.b o4Var;
        gl glVar;
        NotificationReasonState notificationReasonState;
        f40 f40Var;
        k71.k.g(fVar, "node");
        ox0.e eVar = fVar.m;
        String str = fVar.a;
        String str2 = fVar.b;
        String str3 = fVar.c;
        n0 n0Var = fVar.o;
        ox0.j jVar = n0Var.m;
        ox0.h hVar = n0Var.e;
        p pVar = n0Var.h;
        ox0.l lVar = n0Var.g;
        String str4 = lVar != null ? lVar.g : pVar != null ? pVar.h : null;
        String str5 = fVar.l;
        boolean z3 = fVar.d;
        int i = fVar.e;
        ZonedDateTime zonedDateTime = fVar.f;
        o0 o0Var = fVar.h;
        String str6 = o0Var != null ? o0Var.b : "";
        Avatar L = y.L(o0Var != null ? o0Var.d : null);
        String str7 = fVar.i;
        c5 c5Var2 = new c5(null, str6, L, str7 == null ? "" : str7, 1);
        boolean z4 = fVar.j;
        boolean z5 = fVar.k;
        r rVar = eVar.c;
        if (rVar != null) {
            c5Var = c5Var2;
            z = z3;
            i3Var = new d3(rVar.b.b, rVar.c);
        } else {
            c5Var = c5Var2;
            z = z3;
            a0 a0Var = eVar.d;
            if (a0Var != null) {
                c3Var = new h3(a0Var.a);
            } else {
                ox0.y yVar = eVar.e;
                if (yVar != null) {
                    c3Var = new e3(yVar.a.a, yVar.b);
                } else {
                    n nVar = eVar.f;
                    if (nVar != null) {
                        c3Var = new c3(nVar.a);
                    } else {
                        g3.Companion.getClass();
                        i3Var = g3.a;
                    }
                }
            }
            i3Var = c3Var;
        }
        int ordinal = fVar.g.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            z2 = true;
            x xVar = eVar.b;
            SubscriptionState Q = (xVar != null || (f40Var = xVar.b) == null) ? null : i21.a.Q(f40Var);
            SubscriptionState subscriptionState = (Q != null ? -1 : k.a[Q.ordinal()]) != 1 ? SubscriptionState.IGNORED : SubscriptionState.UNSUBSCRIBED;
            SubscriptionState subscriptionState2 = SubscriptionState.SUBSCRIBED;
            iVar = n0Var.b;
            if (iVar == null) {
                bVar = new n4(iVar.a, iVar.b, iVar.c);
            } else {
                ox0.k kVar = n0Var.c;
                if (kVar != null) {
                    bVar = new p4(kVar.b, kVar.a);
                } else {
                    z zVar = n0Var.d;
                    if (zVar != null) {
                        bVar = new y4(zVar.b, zVar.a);
                    } else if (hVar != null) {
                        String str8 = hVar.a;
                        String str9 = hVar.b;
                        CheckStatusState K = k21.f.K(hVar.d);
                        y2 y2Var = hVar.c;
                        bVar = new m4(str8, str9, K, y2Var != null ? i21.a.N(y2Var) : null);
                    } else {
                        b0 b0Var = n0Var.f;
                        if (b0Var != null) {
                            o4Var = new a5(b0Var.c, b0Var.a, b0Var.b, b0Var.d.a, b0Var.e.a);
                        } else if (lVar != null) {
                            String str10 = lVar.a;
                            String str11 = lVar.b;
                            int i2 = lVar.c;
                            IssueState i0 = m71.a.i0(lVar.d);
                            m0 m0Var = lVar.e;
                            bVar = new q4(str10, str11, i2, i0, m0Var.b.b, m0Var.a, b4.k0(lVar.f));
                        } else if (pVar != null) {
                            String str12 = pVar.a;
                            String str13 = pVar.b;
                            boolean z6 = pVar.c;
                            int i3 = pVar.d;
                            PullRequestState Q2 = z3.Q(pVar.e);
                            j0 j0Var = pVar.f;
                            bVar = new r4(str12, str13, z6, i3, Q2, j0Var.b.b, j0Var.a, pVar.g);
                        } else {
                            q qVar = n0Var.i;
                            if (qVar != null) {
                                String str14 = qVar.a;
                                String str15 = qVar.b;
                                String str16 = qVar.c;
                                k0 k0Var = qVar.d;
                                o4Var = new s4(str14, str15, str16, k0Var.c.b, k0Var.b);
                            } else {
                                u uVar = n0Var.j;
                                if (uVar != null) {
                                    bVar = new v4(uVar.a, uVar.b);
                                } else {
                                    v vVar = n0Var.k;
                                    if (vVar != null) {
                                        bVar = new w4(vVar.a, vVar.b);
                                    } else if (jVar != null) {
                                        String str17 = jVar.a;
                                        String str18 = jVar.b;
                                        ox0.a aVar = jVar.e;
                                        String str19 = aVar != null ? aVar.a : null;
                                        boolean z7 = !(str19 == null || t71.p.T(str19));
                                        int i4 = jVar.c;
                                        l0 l0Var = jVar.f;
                                        String str20 = l0Var.b.b;
                                        String str21 = l0Var.a;
                                        va vaVar = jVar.d;
                                        o4Var = new o4(str17, str18, z7, i4, str20, str21, vaVar != null ? b4.n0(vaVar) : null);
                                    } else {
                                        s sVar = n0Var.l;
                                        if (sVar != null) {
                                            bVar = new t4(sVar.a, sVar.b);
                                        } else {
                                            t tVar = n0Var.n;
                                            if (tVar != null) {
                                                String str22 = tVar.a;
                                                String str23 = tVar.b;
                                                bVar = new u4(str22, str23 == null ? "" : str23);
                                            } else {
                                                w wVar = n0Var.o;
                                                if (wVar != null) {
                                                    String str24 = wVar.a;
                                                    String str25 = wVar.b;
                                                    bVar = new x4(str24, str25 == null ? "" : str25);
                                                } else {
                                                    bVar = z4.t;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        bVar = o4Var;
                    }
                }
            }
            glVar = fVar.n;
            switch (glVar != null ? -1 : hx0.a.a[glVar.ordinal()]) {
                case -1:
                case 17:
                case 18:
                    notificationReasonState = NotificationReasonState.UNKNOWN;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    notificationReasonState = NotificationReasonState.ASSIGN;
                    break;
                case 2:
                    notificationReasonState = NotificationReasonState.AUTHOR;
                    break;
                case 3:
                    notificationReasonState = NotificationReasonState.COMMENT;
                    break;
                case 4:
                    notificationReasonState = NotificationReasonState.INVITATION;
                    break;
                case 5:
                    notificationReasonState = NotificationReasonState.MANUAL;
                    break;
                case 6:
                    notificationReasonState = NotificationReasonState.MENTION;
                    break;
                case 7:
                    notificationReasonState = NotificationReasonState.REVIEW_REQUESTED;
                    break;
                case 8:
                    notificationReasonState = NotificationReasonState.SECURITY_ADVISORY_CREDIT;
                    break;
                case 9:
                    notificationReasonState = NotificationReasonState.SECURITY_ALERT;
                    break;
                case 10:
                    notificationReasonState = NotificationReasonState.STATE_CHANGE;
                    break;
                case 11:
                    notificationReasonState = NotificationReasonState.SUBSCRIBED;
                    break;
                case 12:
                    notificationReasonState = NotificationReasonState.TEAM_MENTION;
                    break;
                case 13:
                    notificationReasonState = NotificationReasonState.CI_ACTIVITY;
                    break;
                case 14:
                    notificationReasonState = NotificationReasonState.APPROVAL_REQUESTED;
                    break;
                case 15:
                    notificationReasonState = NotificationReasonState.SAVE;
                    break;
                case 16:
                    notificationReasonState = NotificationReasonState.READY_FOR_REVIEW;
                    break;
            }
            k71.k.g(subscriptionState, "unsubscribeActionState");
            k71.k.g(notificationReasonState, "reason");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = z;
            this.g = i;
            this.h = zonedDateTime;
            this.i = c5Var;
            this.j = z4;
            this.k = z5;
            this.l = i3Var;
            this.m = z2;
            this.n = subscriptionState;
            this.o = subscriptionState2;
            this.p = bVar;
            this.q = notificationReasonState;
        }
        z2 = false;
        x xVar2 = eVar.b;
        if (xVar2 != null) {
        }
        if ((Q != null ? -1 : k.a[Q.ordinal()]) != 1) {
        }
        SubscriptionState subscriptionState22 = SubscriptionState.SUBSCRIBED;
        iVar = n0Var.b;
        if (iVar == null) {
        }
        glVar = fVar.n;
        switch (glVar != null ? -1 : hx0.a.a[glVar.ordinal()]) {
        }
        k71.k.g(subscriptionState, "unsubscribeActionState");
        k71.k.g(notificationReasonState, "reason");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = i;
        this.h = zonedDateTime;
        this.i = c5Var;
        this.j = z4;
        this.k = z5;
        this.l = i3Var;
        this.m = z2;
        this.n = subscriptionState;
        this.o = subscriptionState22;
        this.p = bVar;
        this.q = notificationReasonState;
    }

    @Override // yz0.z2
    public final i3 a() {
        return this.l;
    }

    @Override // yz0.z2
    public final int b() {
        return this.g;
    }

    @Override // yz0.z2
    public final ZonedDateTime c() {
        return this.h;
    }

    @Override // yz0.z2
    public final String d() {
        return this.d;
    }

    @Override // yz0.z2
    public final boolean e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c) && k71.k.b(this.d, hVar.d) && k71.k.b(this.e, hVar.e) && this.f == hVar.f && this.g == hVar.g && k71.k.b(this.h, hVar.h) && k71.k.b(this.i, hVar.i) && this.j == hVar.j && this.k == hVar.k && k71.k.b(this.l, hVar.l) && this.m == hVar.m && this.n == hVar.n && this.o == hVar.o && k71.k.b(this.p, hVar.p) && this.q == hVar.q;
    }

    @Override // yz0.z2
    public final boolean f() {
        return this.k;
    }

    @Override // yz0.z2
    public final boolean g() {
        return this.f;
    }

    @Override // yz0.z2
    public final String getId() {
        return this.a;
    }

    @Override // yz0.z2
    public final String getTitle() {
        return this.c;
    }

    @Override // yz0.z2
    public final String getUrl() {
        return this.e;
    }

    @Override // yz0.z2
    public final o.b h() {
        return this.p;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
        String str2 = this.d;
        int hashCode2 = (i + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int a = com.github.rudroid.m0.a(this.h, s0.b(this.g, x.i.e((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f), 31), 31);
        c5 c5Var = this.i;
        int hashCode3 = (this.n.hashCode() + x.i.e((this.l.hashCode() + x.i.e(x.i.e((a + (c5Var == null ? 0 : c5Var.hashCode())) * 31, 31, this.j), 31, this.k)) * 31, 31, this.m)) * 31;
        SubscriptionState subscriptionState = this.o;
        int hashCode4 = subscriptionState != null ? subscriptionState.hashCode() : 0;
        return this.q.hashCode() + ((this.p.hashCode() + ((hashCode3 + hashCode4) * 31)) * 31);
    }

    @Override // yz0.z2
    public final NotificationReasonState i() {
        return this.q;
    }

    @Override // yz0.z2
    public final boolean isDone() {
        return this.j;
    }

    @Override // yz0.z2
    public final SubscriptionState j() {
        return this.n;
    }

    @Override // yz0.z2
    public final c5 k() {
        return this.i;
    }

    @Override // yz0.z2
    public final SubscriptionState l() {
        return this.o;
    }

    public final String toString() {
        StringBuilder o = s0.o("ApolloNotification(id=", this.a, ", threadType=", this.b, ", title=");
        f1.e.x(o, this.c, ", titleHTML=", this.d, ", url=");
        com.github.rudroid.m0.x(o, this.e, ", isUnread=", this.f, ", itemCount=");
        o.append(this.g);
        o.append(", lastUpdatedAt=");
        o.append(this.h);
        o.append(", summary=");
        o.append(this.i);
        o.append(", isDone=");
        o.append(this.j);
        o.append(", isSaved=");
        o.append(this.k);
        o.append(", owner=");
        o.append(this.l);
        o.append(", isSubscribed=");
        o.append(this.m);
        o.append(", unsubscribeActionState=");
        o.append(this.n);
        o.append(", subscribeActionState=");
        o.append(this.o);
        o.append(", subject=");
        o.append(this.p);
        o.append(", reason=");
        o.append(this.q);
        o.append(")");
        return o.toString();
    }
}
