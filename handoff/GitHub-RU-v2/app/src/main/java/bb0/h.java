package bb0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.InteractionType;
import com.github.service.models.response.NotificationReasonState;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.type.IssueState;
import com.github.service.models.response.type.SubscriptionState;
import com.google.android.gms.internal.measurement.i4;
import fb0.h0;
import fb0.i0;
import fb0.j0;
import fb0.k0;
import fb0.l0;
import fb0.m0;
import fb0.n;
import fb0.o;
import fb0.p;
import fb0.r;
import fb0.s;
import fb0.t;
import fb0.u;
import fb0.v;
import fb0.w;
import fb0.xShadow;
import fb0.y;
import fb0.z;
import hc0.ev;
import hc0.i9;
import hc0.ih;
import hc0.j2;
import java.time.ZonedDateTime;
import kotlin.NoWhenBranchMatchedException;
import t.a0;
import t.q;
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

/* loaded from: /home/user/work/p/classes3.dex */
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
    /* JADX WARN: Removed duplicated region for block: B:45:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(fb0.f fVar) {
        c5 c5Var;
        boolean z;
        d3 d3Var;
        d3 c3Var;
        boolean z2;
        fb0.i iVar;
        n4 n4Var;
        n4 o4Var;
        ih ihVar;
        NotificationReasonState notificationReasonState;
        ev evVar;
        k71.k.g(fVar, "node");
        fb0.e eVar = fVar.m;
        String str = fVar.a;
        String str2 = fVar.b;
        String str3 = fVar.c;
        l0 l0Var = fVar.o;
        fb0.j jVar = l0Var.m;
        fb0.h hVar = l0Var.e;
        n nVar = l0Var.h;
        fb0.l lVar = l0Var.g;
        String str4 = lVar != null ? lVar.g : nVar != null ? nVar.g : null;
        String str5 = fVar.l;
        boolean z3 = fVar.d;
        int i = fVar.e;
        ZonedDateTime zonedDateTime = fVar.f;
        m0 m0Var = fVar.h;
        String str6 = m0Var != null ? m0Var.b : "";
        Avatar q = q.q(m0Var != null ? m0Var.d : null);
        String str7 = fVar.i;
        c5 c5Var2 = new c5((InteractionType) null, str6, q, str7 == null ? "" : str7, 1);
        boolean z4 = fVar.j;
        boolean z5 = fVar.k;
        p pVar = eVar.c;
        if (pVar != null) {
            c5Var = c5Var2;
            z = z3;
            d3Var = new d3(pVar.b.b, pVar.c);
        } else {
            c5Var = c5Var2;
            z = z3;
            y yVar = eVar.d;
            if (yVar != null) {
                c3Var = new h3(yVar.a);
            } else {
                w wVar = eVar.e;
                if (wVar != null) {
                    c3Var = new e3(wVar.a.a, wVar.b);
                } else {
                    fb0.m mVar = eVar.f;
                    if (mVar != null) {
                        c3Var = new c3(mVar.a);
                    } else {
                        g3.Companion.getClass();
                        d3Var = g3.a;
                    }
                }
            }
            d3Var = c3Var;
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
            v vVar = eVar.b;
            SubscriptionState D = (vVar != null || (evVar = vVar.b) == null) ? null : a.a.D(evVar);
            SubscriptionState subscriptionState = (D != null ? -1 : k.a[D.ordinal()]) != 1 ? SubscriptionState.IGNORED : SubscriptionState.UNSUBSCRIBED;
            SubscriptionState subscriptionState2 = SubscriptionState.SUBSCRIBED;
            iVar = l0Var.b;
            if (iVar == null) {
                n4Var = new n4(iVar.a, iVar.b, iVar.c);
            } else {
                fb0.kShadow kVar = l0Var.c;
                if (kVar != null) {
                    n4Var = new p4(kVar.b, kVar.a);
                } else {
                    x xVar = l0Var.d;
                    if (xVar != null) {
                        n4Var = new y4(xVar.b, xVar.a);
                    } else if (hVar != null) {
                        String str8 = hVar.a;
                        String str9 = hVar.b;
                        CheckStatusState Y = b91.g.Y(hVar.d);
                        j2 j2Var = hVar.c;
                        n4Var = new m4(str8, str9, Y, j2Var != null ? b41.b.S(j2Var) : null);
                    } else {
                        z zVar = l0Var.f;
                        if (zVar != null) {
                            o4Var = new a5(zVar.c, zVar.a, zVar.b, zVar.d.a, zVar.e.a);
                        } else if (lVar != null) {
                            String str10 = lVar.a;
                            String str11 = lVar.b;
                            int i2 = lVar.c;
                            IssueState x0 = i4.x0(lVar.d);
                            k0 k0Var = lVar.e;
                            n4Var = new q4(str10, str11, i2, x0, k0Var.b.b, k0Var.a, a0.N(lVar.f));
                        } else if (nVar != null) {
                            String str12 = nVar.a;
                            String str13 = nVar.b;
                            boolean z6 = nVar.c;
                            int i3 = nVar.d;
                            PullRequestState Q = m7.y.Q(nVar.e);
                            h0 h0Var = nVar.f;
                            n4Var = new r4(str12, str13, z6, i3, Q, h0Var.b.b, h0Var.a, false);
                        } else {
                            o oVar = l0Var.i;
                            if (oVar != null) {
                                String str14 = oVar.a;
                                String str15 = oVar.b;
                                String str16 = oVar.c;
                                i0 i0Var = oVar.d;
                                o4Var = new s4(str14, str15, str16, i0Var.c.b, i0Var.b);
                            } else {
                                s sVar = l0Var.j;
                                if (sVar != null) {
                                    n4Var = new v4(sVar.a, sVar.b);
                                } else {
                                    t tVar = l0Var.k;
                                    if (tVar != null) {
                                        n4Var = new w4(tVar.a, tVar.b);
                                    } else if (jVar != null) {
                                        String str17 = jVar.a;
                                        String str18 = jVar.b;
                                        fb0.a aVar = jVar.e;
                                        String str19 = aVar != null ? aVar.a : null;
                                        boolean z7 = !(str19 == null || t71.p.T(str19));
                                        int i4 = jVar.c;
                                        j0 j0Var = jVar.f;
                                        String str20 = j0Var.b.b;
                                        String str21 = j0Var.a;
                                        i9 i9Var = jVar.d;
                                        o4Var = new o4(str17, str18, z7, i4, str20, str21, i9Var != null ? sy.oShadow.m(i9Var) : null);
                                    } else {
                                        fb0.q qVar = l0Var.l;
                                        if (qVar != null) {
                                            n4Var = new t4(qVar.a, qVar.b);
                                        } else {
                                            r rVar = l0Var.n;
                                            if (rVar != null) {
                                                String str22 = rVar.a;
                                                String str23 = rVar.b;
                                                n4Var = new u4(str22, str23 == null ? "" : str23);
                                            } else {
                                                u uVar = l0Var.o;
                                                if (uVar != null) {
                                                    String str24 = uVar.a;
                                                    String str25 = uVar.b;
                                                    n4Var = new x4(str24, str25 == null ? "" : str25);
                                                } else {
                                                    n4Var = z4.t;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        n4Var = o4Var;
                    }
                }
            }
            ihVar = fVar.n;
            switch (ihVar != null ? -1 : za0.a.a[ihVar.ordinal()]) {
                case -1:
                case 17:
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
            this.l = d3Var;
            this.m = z2;
            this.n = subscriptionState;
            this.o = subscriptionState2;
            this.p = n4Var;
            this.q = notificationReasonState;
        }
        z2 = false;
        v vVar2 = eVar.b;
        if (vVar2 != null) {
        }
        if ((D != null ? -1 : k.a[D.ordinal()]) != 1) {
        }
        SubscriptionState subscriptionState22 = SubscriptionState.SUBSCRIBED;
        iVar = l0Var.b;
        if (iVar == null) {
        }
        ihVar = fVar.n;
        switch (ihVar != null ? -1 : za0.a.a[ihVar.ordinal()]) {
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
        this.l = d3Var;
        this.m = z2;
        this.n = subscriptionState;
        this.o = subscriptionState22;
        this.p = n4Var;
        this.q = notificationReasonState;
    }

    public final i3 a() {
        return this.l;
    }

    public final int b() {
        return this.g;
    }

    public final ZonedDateTime c() {
        return this.h;
    }

    public final String d() {
        return this.d;
    }

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

    public final boolean f() {
        return this.k;
    }

    public final boolean g() {
        return this.f;
    }

    public final String getId() {
        return this.a;
    }

    public final String getTitle() {
        return this.c;
    }

    public final String getUrl() {
        return this.e;
    }

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

    public final NotificationReasonState i() {
        return this.q;
    }

    public final boolean isDone() {
        return this.j;
    }

    public final SubscriptionState j() {
        return this.n;
    }

    public final c5 k() {
        return this.i;
    }

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
